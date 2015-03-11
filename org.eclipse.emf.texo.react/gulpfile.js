var gulp = require('gulp');
var browserify = require('browserify');
var reactify = require('reactify');
var watchify = require('watchify');
var source = require('vinyl-source-stream');
var jsxcs = require('gulp-jsxcs');
var eslint = require('gulp-eslint');

//var gulpif = require('gulp-if');
//var uglify = require('gulp-uglify');
//var streamify = require('gulp-streamify');
var notify = require('gulp-notify');

var sourceFile = './source/js/app.jsx';
var destFolder = './WebContent/dist/';
var destFile = 'bundle.js';
var destLibFile = 'libs.js';

// Note, based on:
// https://github.com/christianalfoni/react-packaging/blob/master/browserify-project/Gulpfile.js

// The task that handles both development and deployment
var runBrowserifyTask = function (options) {

	// We create one bundle for our dependencies,
	// which in this case is only react
	var vendorBundler = browserify({
		debug: true // We also add sourcemapping
	})
	.require('react');

	// This bundle is for our application
	var bundler = browserify({
		debug: true, // Need that sourcemapping

		// These options are just for Watchify
		cache: {}, packageCache: {}, fullPaths: true
	})
	.require(require.resolve(sourceFile), { entry: true })
	.transform(reactify) // Transform JSX 
	.external('react'); // Do not include react

	// The actual rebundle process
	var rebundle = function() {
		var start = Date.now();
		
		gulp.src(['source/js/**/*.js', 'source/js/**/*.jsx'])
         .pipe(notify("Processing: <%= file.relative %>"))
		 .pipe(eslint())
         .pipe(eslint.format())
	     .pipe(jsxcs());
		
		bundler.bundle()
		.pipe(source(destFile))
//		.pipe(gulpif(options.uglify, streamify(uglify())))
		.pipe(gulp.dest(destFolder))
//		.pipe(notify(function () {
//			console.log('Built in ' + (Date.now() - start) + 'ms');
//		}));
	};

	// Fire up Watchify when developing
	if (options.watch) {
		bundler = watchify(bundler);
		bundler.on('update', rebundle);
	}

	// Run the vendor bundle when the default Gulp task starts
	vendorBundler.bundle()
	.pipe(source(destLibFile))
//	.pipe(streamify(uglify()))
	.pipe(gulp.dest(destFolder));

	return rebundle();
};

gulp.task('default', function () {
	runBrowserifyTask({
		watch: true,
		uglify: false
	});
});

gulp.task('deploy', function () {
	runBrowserifyTask({
		watch: false,
		uglify: true
	});
});
