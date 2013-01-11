Ext.define('Library.view.Books', {
  extend: 'Ext.List',
  xtype: 'books',

  config: {
    title: 'Books',
    cls: 'x-contacts',
    limit: 25,

    plugins: [{
      xclass: 'Ext.plugin.ListPaging',
      autoPaging: true
    }, {
      xclass: 'Ext.plugin.PullRefresh'
    }],

    overlayFields: ['_id', 'title', 'pages', 'category'],

    listeners: {
      itemdoubletap: function(list, index, dataItem, record, event, options) {
        this.overlay.doSetRecord(record.raw);
        this.overlay.showBy(dataItem);
      }
    },

    store: 'Books',
    itemTpl: ['{title} ({pages})'].join('')
  }
});