//<debug>
Ext.Loader.setPath({
    'Ext': '../../src'
});
//</debug>

Ext.application({
    name: 'Library',

    phoneStartupScreen: 'resources/loading/Homescreen.jpg',
    tabletStartupScreen: 'resources/loading/Homescreen~ipad.jpg',

    glossOnIcon: false,
    icon: {
        57: 'resources/icons/icon.png',
        72: 'resources/icons/icon@72.png',
        114: 'resources/icons/icon@2x.png',
        144: 'resources/icons/icon@114.png'
    },

    //require any components/classes what we will use in our example
    requires: [
        'Ext.data.Store',
        'Ext.List',
        'Ext.plugin.ListPaging',
        'Ext.plugin.PullRefresh'
    ],
    
    models: ['Library', 'Book', 'Writer'],
    stores: ['Libraries', 'Books', 'Writers'],
    views: ['Main', 'DataView', 'Libraries', 'Books', 'Writers'],
    //controllers: ['Application'],

    launch: function() {
        Ext.Viewport.add({
            xclass: 'Library.view.Main'
        });
    }
});

// prevent an error in chrome
// http://www.sencha.com/forum/showthread.php?240574
Ext.define('OverrideConnection', {
    override: 'Ext.data.Connection',
    onStateChange : function(request) {
        if (request && request.xhr && request.xhr.readyState == 4) {
            this.clearTimeout(request);
            this.onComplete(request);
            this.cleanup(request);
        }
    }
});
