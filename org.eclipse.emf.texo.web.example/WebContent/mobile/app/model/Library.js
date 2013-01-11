Ext.define('Library.model.Library', {
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