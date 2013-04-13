function Window(args){
	
	if(!args.desktop){
		throw "Desktop reference is required";
	}
	
	this._desktopRef = args.desktop;
	this._id = args.id;
	this._element = null;
};

Window.prototype.init = function() {
	this.createLayout();
};


Window.prototype.createLayout= function() {
	var div = jQuery("<div class='window'>");
		jQuery(div).append("<div id='systemBar' class='systemBar'> System Bar </div>");
		jQuery(div).append("<div id='notificationArea' class='notification' > Notification  </div>");
		jQuery(div).append("<div id='contentArea' class='content'>  Content</div>");
		jQuery(div).append("<div id='statusBar' class='statusBar'>  stats bar</div>");
	jQuery(div).append("</div>");
	
	jQuery("body").append(div);
	this._element = div;
	
	var desktopElem = this._desktopRef.getElement();
	var width = getPixelsFromPrecentage(jQuery(desktopElem).outerWidth(true) ,50 );
	var height = getPixelsFromPrecentage(jQuery(desktopElem).outerHeight(true) ,50 );
	this.setDimenstions({
		width : width,
		height: height
	});

	var pos = getCenterPosition(desktopElem, this._element);
	console.log(pos)
	this.setPosition(pos);
	
};

Window.prototype.getId= function() {
	return this._id;
	
};


Window.prototype.setDimenstions= function(args) {
	jQuery(this._element).css({
		"width" : args.width,
		"height" : args.height,
	});	
};

Window.prototype.setPosition= function(args) {

	jQuery(this._element).css({
		"top" : args.top,
		"left" :args.left,
	})	

	
};
