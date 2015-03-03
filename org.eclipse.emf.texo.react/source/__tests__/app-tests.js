
jest.dontMock('../js/app.jsx');

describe('TestCounter', function() {
  it('changes the counter after click', function() {
    var React = require('react/addons');
    var TestUtils = React.addons.TestUtils;
     
    var Counter = require('../js/components/counter.jsx');

    // Render the counter
    var counter = TestUtils.renderIntoDocument(
      <Counter/>
    );

	// check the label
    var label = TestUtils.findRenderedDOMComponentWithTag(counter, 'h1');
    expect(label.getDOMNode().textContent).toEqual('Count: 0');

    // Simulate a click
    var button = TestUtils.findRenderedDOMComponentWithTag(counter, 'button');
    TestUtils.Simulate.click(button);
    expect(label.getDOMNode().textContent).toEqual('Count: 1');
  });
});