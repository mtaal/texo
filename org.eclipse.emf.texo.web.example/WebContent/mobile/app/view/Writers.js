Ext.define('Library.view.Writers', {
  extend: 'Ext.List',
  xtype: 'writers',

  config: {
    title: 'Writers',
    cls: 'x-contacts',
    limit: 25,
    store: 'Writers',
    limit: 25,
    plugins: [{
      xclass: 'Ext.plugin.ListPaging',
      autoPaging: true
    }, {
      xclass: 'Ext.plugin.PullRefresh'
    }],
    overlayFields: ['_id', 'name'],

    listeners: {
      itemdoubletap: function(list, index, dataItem, record, event, options) {
        this.overlay.doSetRecord(record.raw);
        this.overlay.showBy(dataItem);
      }
    },

    itemTpl: ['{name}'].join('')
  }
});