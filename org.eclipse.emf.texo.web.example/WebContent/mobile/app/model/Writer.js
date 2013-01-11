Ext.define('Library.model.Writer', {
  extend: 'Ext.data.Model',

  config: {
    fields: [{
      name: 'name',
      type: 'string'
    }]
  },

  validations: [{
    type: 'presence',
    field: 'name'
  }]
});