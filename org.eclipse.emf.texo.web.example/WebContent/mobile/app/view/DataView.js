Ext.define('Library.view.DataView', {
  extend: 'Ext.Container',
  xtype: 'dataView',

  config: {
    layout: 'vbox',
    align: 'stretch',
    filterProperty: 'name'
  },

  initialize: function() {
    var me = this,
        isPhone = Ext.os.deviceType == 'Phone';

    this.overlay = Ext.Viewport.add({
      xtype: 'panel',

      // Make it modal so you can click the mask to hide the overlay
      modal: true,
      hideOnMaskTap: true,

      // Make it hidden by default
      hidden: true,

      top: 0,
      left: 0,

      // Set the width and height of the panel
      width: isPhone ? 260 : 400,
      height: isPhone ? '70%' : 400,

      // Style the content and make it scrollable
      styleHtmlContent: true,
      scrollable: true,

      // Insert a title docked at the top with a title
      items: [{
        docked: 'top',
        xtype: 'toolbar',
        title: 'Overlay Title'
      }]
    });

    this.searchField = Ext.create('Ext.field.Search', {
      xtype: 'searchfield',
      placeHolder: 'Search...',
      listeners: {
        scope: this,
        clearicontap: this.onSearchClearIconTap,
        keyup: this.onSearchKeyUp
      }
    });

    this.delayedFilter = Ext.create('Ext.util.DelayedTask', function() {
      me.doFilter();
    });

    //    this.config.listView.onItemDisclosure = function(record, btn, index) {
    //      me.overlay.showBy(btn);
    //    };
    this.setItems([{
      docked: 'top',
      xtype: 'toolbar',
      title: this.config.title,
      items: [{
        xtype: 'spacer'
      },
      this.searchField]
    },
    Ext.apply(this.config.listView, {
      flex: 1
    })]);

    this.callParent(arguments);

    this.overlay.doSetRecord = function(raw) {
      var i, overlayFld, content, list = me.list;
      this.getItems().items[0].setTitle(raw._title);
      content = '<table>';
      for (i = 0; i < list.config.overlayFields.length; i++) {
        overlayFld = list.config.overlayFields[i];
        content = content.concat('<tr><td><b>');
        content = content.concat(overlayFld);
        content = content.concat(': </b></td><td>');
        content = content.concat(raw[overlayFld]);
        content = content.concat('</td></tr>');
      }
      content = content.concat('</table>');
      this.setHtml(content);
    };

    this.list = this.getItems().items[1];

    this.list.overlay = this.overlay;
  },

  onSearchKeyUp: function(field) {
    this.delayedFilter.delay(500);
  },

  doFilter: function() {
    var field = this.searchField,
        value = field.getValue(),
        store = this.list.getStore();

    this.overlay.hide();

    if (!value) {
      this.onSearchClearIconTap();
      return;
    }
    store.clearFilter();
    store.filter([new Ext.util.Filter({
      property: this.getFilterProperty(),
      value: value,
      caseSensitive: false,
      anyMatch: true,
      exactMatch: false
    })]);
    store.load();
  },

  onSearchClearIconTap: function() {
	this.overlay.hide();
    this.list.getStore().clearFilter();
    this.list.getStore().load();
  }
});