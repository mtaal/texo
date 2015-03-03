(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({"/home/mtaal/mydata/dev/git/texo/org.eclipse.emf.texo.react/source/js/app.jsx":[function(require,module,exports){
"use strict";

var React = require("react"),
    Counter = React.createFactory(require("./components/counter.jsx")),
    Rendered = React.render(React.createElement(Counter, null), document.getElementById("mount-point"));

module.exports = Rendered;


},{"./components/counter.jsx":"/home/mtaal/mydata/dev/git/texo/org.eclipse.emf.texo.react/source/js/components/counter.jsx","react":"react"}],"/home/mtaal/mydata/dev/git/texo/org.eclipse.emf.texo.react/source/js/components/counter.jsx":[function(require,module,exports){
"use strict";

var React = require("react"),
    Counter = React.createClass({displayName: "Counter",
  incrementCount: function() {
    this.setState({
      count: this.state.count + 1
    });
  },
  getInitialState: function() {
    return {
      count: 0
    };
  },
  render: function() {
    return ( React.createElement("div", {className: "counter"}, " ", React.createElement("h1", null, " Count: ", this.state.count, " "), 
        React.createElement("button", {type: "button", onClick: this.incrementCount}, "Increment"), " ")
    );
  }
});

module.exports = Counter;


},{"react":"react"}]},{},["/home/mtaal/mydata/dev/git/texo/org.eclipse.emf.texo.react/source/js/app.jsx"])
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIm5vZGVfbW9kdWxlcy9icm93c2VyaWZ5L25vZGVfbW9kdWxlcy9icm93c2VyLXBhY2svX3ByZWx1ZGUuanMiLCIvaG9tZS9tdGFhbC9teWRhdGEvZGV2L2dpdC90ZXhvL29yZy5lY2xpcHNlLmVtZi50ZXhvLnJlYWN0L3NvdXJjZS9qcy9hcHAuanN4IiwiL2hvbWUvbXRhYWwvbXlkYXRhL2Rldi9naXQvdGV4by9vcmcuZWNsaXBzZS5lbWYudGV4by5yZWFjdC9zb3VyY2UvanMvY29tcG9uZW50cy9jb3VudGVyLmpzeCJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtBQ0FBLFlBQVksQ0FBQzs7QUFFYixJQUFJLEtBQUssR0FBRyxPQUFPLENBQUMsT0FBTyxDQUFDO0lBQ3hCLE9BQU8sR0FBRyxLQUFLLENBQUMsYUFBYSxDQUFDLE9BQU8sQ0FBQywwQkFBMEIsQ0FBQyxDQUFDO0FBQ3RFLElBQUksUUFBUSxHQUFHLEtBQUssQ0FBQyxNQUFNLENBQUMsb0JBQUMsT0FBTyxFQUFBLElBQUUsQ0FBQSxFQUFFLFFBQVEsQ0FBQyxjQUFjLENBQUMsYUFBYSxDQUFDLENBQUMsQ0FBQzs7QUFFaEYsTUFBTSxDQUFDLE9BQU8sR0FBRyxRQUFRLENBQUM7Ozs7QUNOMUIsWUFBWSxDQUFDOztBQUViLElBQUksS0FBSyxHQUFHLE9BQU8sQ0FBQyxPQUFPLENBQUM7SUFDeEIsNkJBQTZCLHVCQUFBO0VBQy9CLGNBQWMsRUFBRSxXQUFXO0lBQ3pCLElBQUksQ0FBQyxRQUFRLENBQUM7TUFDWixLQUFLLEVBQUUsSUFBSSxDQUFDLEtBQUssQ0FBQyxLQUFLLEdBQUcsQ0FBQztLQUM1QixDQUFDLENBQUM7R0FDSjtFQUNELGVBQWUsRUFBRSxXQUFXO0lBQzFCLE9BQU87TUFDTCxLQUFLLEVBQUUsQ0FBQztLQUNULENBQUM7R0FDSDtFQUNELE1BQU0sRUFBRSxXQUFXO0lBQ2pCLFNBQVMsb0JBQUEsS0FBSyxFQUFBLENBQUEsQ0FBQyxTQUFBLEVBQVMsR0FBRyxTQUFTLENBQUUsQ0FBQSxFQUFBLEdBQUEsRUFBQyxvQkFBQSxJQUFJLEVBQUEsSUFBQSxDQUFFLEVBQUEsVUFBQSxFQUFTLElBQUksQ0FBQyxLQUFLLENBQUMsS0FBSyxFQUFDLEdBQU8sQ0FBQSxFQUFBO1FBQzFFLG9CQUFBLFFBQU8sRUFBQSxDQUFBLENBQUMsSUFBQSxFQUFJLENBQUMsUUFBQSxFQUFRLENBQUMsT0FBQSxFQUFPLENBQUUsSUFBSSxDQUFDLGNBQWdCLENBQUEsRUFBQSxXQUFtQixDQUFBLEVBQUEsR0FBUSxDQUFBO01BQ2pGO0dBQ0g7QUFDSCxDQUFDLENBQUMsQ0FBQzs7QUFFSCxNQUFNLENBQUMsT0FBTyxHQUFHLE9BQU8sQ0FBQyIsImZpbGUiOiJnZW5lcmF0ZWQuanMiLCJzb3VyY2VSb290IjoiIiwic291cmNlc0NvbnRlbnQiOlsiKGZ1bmN0aW9uIGUodCxuLHIpe2Z1bmN0aW9uIHMobyx1KXtpZighbltvXSl7aWYoIXRbb10pe3ZhciBhPXR5cGVvZiByZXF1aXJlPT1cImZ1bmN0aW9uXCImJnJlcXVpcmU7aWYoIXUmJmEpcmV0dXJuIGEobywhMCk7aWYoaSlyZXR1cm4gaShvLCEwKTt2YXIgZj1uZXcgRXJyb3IoXCJDYW5ub3QgZmluZCBtb2R1bGUgJ1wiK28rXCInXCIpO3Rocm93IGYuY29kZT1cIk1PRFVMRV9OT1RfRk9VTkRcIixmfXZhciBsPW5bb109e2V4cG9ydHM6e319O3Rbb11bMF0uY2FsbChsLmV4cG9ydHMsZnVuY3Rpb24oZSl7dmFyIG49dFtvXVsxXVtlXTtyZXR1cm4gcyhuP246ZSl9LGwsbC5leHBvcnRzLGUsdCxuLHIpfXJldHVybiBuW29dLmV4cG9ydHN9dmFyIGk9dHlwZW9mIHJlcXVpcmU9PVwiZnVuY3Rpb25cIiYmcmVxdWlyZTtmb3IodmFyIG89MDtvPHIubGVuZ3RoO28rKylzKHJbb10pO3JldHVybiBzfSkiLCJcInVzZSBzdHJpY3RcIjtcblxudmFyIFJlYWN0ID0gcmVxdWlyZShcInJlYWN0XCIpLFxuICAgIENvdW50ZXIgPSBSZWFjdC5jcmVhdGVGYWN0b3J5KHJlcXVpcmUoXCIuL2NvbXBvbmVudHMvY291bnRlci5qc3hcIikpLFxuICAgIFJlbmRlcmVkID0gUmVhY3QucmVuZGVyKDxDb3VudGVyLz4sIGRvY3VtZW50LmdldEVsZW1lbnRCeUlkKFwibW91bnQtcG9pbnRcIikpO1xuXG5tb2R1bGUuZXhwb3J0cyA9IFJlbmRlcmVkO1xuIiwiXCJ1c2Ugc3RyaWN0XCI7XG5cbnZhciBSZWFjdCA9IHJlcXVpcmUoXCJyZWFjdFwiKSxcbiAgICBDb3VudGVyID0gUmVhY3QuY3JlYXRlQ2xhc3Moe1xuICBpbmNyZW1lbnRDb3VudDogZnVuY3Rpb24oKSB7XG4gICAgdGhpcy5zZXRTdGF0ZSh7XG4gICAgICBjb3VudDogdGhpcy5zdGF0ZS5jb3VudCArIDFcbiAgICB9KTtcbiAgfSxcbiAgZ2V0SW5pdGlhbFN0YXRlOiBmdW5jdGlvbigpIHtcbiAgICByZXR1cm4ge1xuICAgICAgY291bnQ6IDBcbiAgICB9O1xuICB9LFxuICByZW5kZXI6IGZ1bmN0aW9uKCkge1xuICAgIHJldHVybiAoIDwgZGl2IGNsYXNzTmFtZSA9IFwiY291bnRlclwiID4gPCBoMSA+IENvdW50OiB7dGhpcy5zdGF0ZS5jb3VudH0gPCAvaDE+XG4gICAgICAgIDxidXR0b24gdHlwZT1cImJ1dHRvblwiIG9uQ2xpY2s9e3RoaXMuaW5jcmVtZW50Q291bnR9PkluY3JlbWVudDwvYnV0dG9uID4gPCAvZGl2PlxuICAgICk7XG4gIH1cbn0pO1xuXG5tb2R1bGUuZXhwb3J0cyA9IENvdW50ZXI7XG4iXX0=
