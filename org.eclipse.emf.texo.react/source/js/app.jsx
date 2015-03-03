"use strict";

var React = require("react"),
    Counter = React.createFactory(require("./components/counter.jsx")),
    Rendered = React.render(<Counter/>, document.getElementById("mount-point"));

module.exports = Rendered;
