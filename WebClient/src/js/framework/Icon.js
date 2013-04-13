function Icon(args){

	if(!args.desktop)
		throw "Desktop reference is required";

	this._element = null;
	this._desktopRef = args.desktop;
	this._title = args.title;
	this._iconId = args.id
}

Icon.prototype.init = function() {
	this.createLayout();
};


Icon.prototype.createLayout= function(){
	
	var icon = jQuery("<div class='icon'></div>");
	jQuery(icon).attr("id",this._iconId);
	jQuery(icon).attr("title" , this._title);
	
	
	var desktopElem = this._desktopRef.getElement();
	jQuery(desktopElem).append(icon);
	this._element = icon;
	
	this.setDimensions({
		width : getPixelsFromPrecentage(jQuery(desktopElem).outerWidth(), 4),
		height: getPixelsFromPrecentage(jQuery(desktopElem).outerWidth(), 4)
	});
	
};

Icon.prototype.setDimensions= function(args) {
	jQuery(this._element).css({
		"width" : args.width,
		"height" : args.height,
	});
};

Icon.prototype.setPosition= function(args) {
	jQuery(this._element).css({
		"top" : args.top,
		"left" : args.left,
	});
};


Icon.prototype.getElement= function() {
	return this._element;
};

Icon.prototype.getId= function() {
	return this._iconId;
};



Icon.prototype.bindEvent= function(args) {
	
	jQuery(this._element).bind(args.event, args.data, function(e){
		
		if(args && args.handler) {
			args.handler()	
		}
		
	});
	
};


