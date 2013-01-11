Ext.define('Library.view.Main', {
  extend: 'Ext.tab.Panel',
  xtype: 'mainview',

  requires: ['Library.view.DataView', 'Library.view.Libraries', 'Library.view.Books', 'Library.view.Writers'],

  config: {
    autoDestroy: false,
    xtype: 'tabpanel',
    tabBar: {
      docked: 'bottom'
    },
    ui: 'light',
    defaults: {
      scrollable: true
    },
    items: [{
      title: 'Libraries',
      iconCls: 'info',
      xtype: 'dataView',
      listView: {
    	  xtype: 'libraries'
      }
    }, {
      title: 'Books',
      iconCls: 'settings',
      xtype: 'dataView',
      filterProperty: 'title',
      listView: {
    	  xtype: 'books'
      }
    }, {
      title: 'Writers',
      iconCls: 'favorites',
      xtype: 'dataView',
      listView: {
    	  xtype: 'writers'
      }
    }]
  }
});