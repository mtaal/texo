Ext.define('Library.view.Libraries', {
  extend: 'Ext.List',
  xtype: 'libraries',

  config: {
    title: 'Libraries',
    cls: 'x-contacts',
    limit: 25,
    plugins: [{
      xclass: 'Ext.plugin.ListPaging',
      autoPaging: true
    }, {
      xclass: 'Ext.plugin.PullRefresh'
    }],

    store: 'Libraries',
    itemTpl: ['{name}'].join(''),

    overlayFields: ['_id', 'name'],

    listeners: {
      itemdoubletap: function(list, index, dataItem, record, event, options) {
        this.overlay.doSetRecord(record.raw);
        this.overlay.showBy(dataItem);
      }
    }
  }
});