function Taskbar(desktop) {
	
	if(!desktop)
		throw "Desktop reference is required";
	
	this._desktopRef = desktop;
	this._element= null;
	
	return this;
}


Taskbar.prototype.init = function() {
	this.createLayout();
};


Taskbar.prototype.createLayout= function() {

	var taskbar = jQuery("<div></div>");
	jQuery(taskbar).attr("id","taskbar");
	jQuery(taskbar).addClass("taskbar");
	
	var desktopElem = this._desktopRef.getElement();
	jQuery(desktopElem).append(taskbar);
	this._element = taskbar;
	
	this.setDimensions({
		width : jQuery(desktopElem).outerWidth(),
		height: getPixelsFromPrecentage(jQuery(desktopElem).outerHeight(), 8)
	})
};

Taskbar.prototype.setDimensions= function(args) {
	jQuery(this._element).css({
		"width" : args.width,
		"height" : args.height
	});
}

Taskbar.prototype.getElement= function(args) {
	return this._element;
}