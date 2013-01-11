Ext.define('Library.model.Book', {
  extend: 'Ext.data.Model',

  config: {
    fields: [{
      name: 'title',
      type: 'string'
    }, {
      name: 'author',
      type: 'string'
    }, {
      name: 'pages',
      type: 'int'
    }, {
      name: 'category',
      type: 'string'
    }]
  },

  validations: [{
    type: 'presence',
    field: 'title'
  }]
});