Ext.define('Library.store.Libraries', {
  extend: 'Ext.data.Store',

  config: {
    model: 'Library.model.Library',
    remoteFilter: true,
    remoteSort: true,
    autoLoad: true,

    proxy: {
      type: 'rest',
      url: '../jsonws/Library',
      startParam: 'firstResult',
      limitParam: 'maxResults',
      pageParam: null,
      extraParams: {
        client: 'sencha'
      },
      reader: {
        type: 'json',
        totalProperty: 'totalRows',
        rootProperty: 'data'
      }
    }
  }
});

Ext.define('Library.store.Writers', {
  extend: 'Ext.data.Store',

  config: {
    model: 'Library.model.Writer',
    remoteFilter: true,
    remoteSort: true,
    autoLoad: true,

    proxy: {
      type: 'rest',
      url: '../jsonws/Writer',
      startParam: 'firstResult',
      limitParam: 'maxResults',
      pageParam: null,
      extraParams: {
        sencha: true
      },
      reader: {
        type: 'json',
        totalProperty: 'totalRows',
        rootProperty: 'data'
      }
    }
  }
});

Ext.define('Library.store.Books', {
  extend: 'Ext.data.Store',

  config: {
    model: 'Library.model.Book',
    remoteFilter: true,
    remoteSort: true,
    autoLoad: true,

    proxy: {
      type: 'rest',
      url: '../jsonws/Book',
      startParam: 'firstResult',
      limitParam: 'maxResults',
      pageParam: null,
      extraParams: {
        sencha: true
      },
      reader: {
        type: 'json',
        totalProperty: 'totalRows',
        rootProperty: 'data'
      }
    }
  }
});