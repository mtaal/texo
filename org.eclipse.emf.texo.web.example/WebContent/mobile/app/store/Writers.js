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