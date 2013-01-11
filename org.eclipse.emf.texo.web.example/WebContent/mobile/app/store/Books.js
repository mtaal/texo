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