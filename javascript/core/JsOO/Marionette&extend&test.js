(function() {

	// intended backbone way of extension, will not effect itself, only its descendant
	Marionette.View.prototype.constructor = function() {
		console.log('View new', this);
		return Marionette.View.apply(this, arguments);
	};


	// standard extend for backbone
	OldLayout = Marionette.Layout;
	Marionette.Layout = function() {
		console.log('Layout new', this);
		// normal js doesn't use prototype.constructor
		return OldLayout.prototype.constructor.apply(this, arguments);
	};
	Marionette.Layout.prototype = new OldLayout;
	// normal js doesn't have this line
	Marionette.Layout.prototype.constructor = Marionette.Layout;

	
	console.log('===========');
	var view = new Marionette.View();
	console.log('===========');

})();