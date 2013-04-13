
function Desktop(){
	this._taskbar = null;
	this._element = null;
	this._icons={};
}


Desktop.prototype.init = function(){
	this.createLayout();
	
};



Desktop.prototype.createLayout= function(){
	
	var desktop = jQuery("<div></div>");
	jQuery(desktop).attr("id","desktop");
	jQuery(desktop).addClass("desktop");
	jQuery("body").append(desktop);
	this._element = desktop;
	this.setDimensions(desktop);
	
	this._taskbar = new Taskbar(this);
	this._taskbar.init();

	//1st Icon;
	var icon = new Icon({
		desktop : this,
		title : "My Icon",
		id:"icon-1",
	});
	icon.init();
	this.placeIcon(icon)
	this._icons[icon.getId()] = icon;

	// 2nd icon;
	var newIcon = new Icon({
		desktop : this,
		title : "My Another Icon",
		id:"icon-2",
	});
	newIcon.init();
	this.placeNextIcon(icon, newIcon);
	this._icons[newIcon.getId()] = newIcon;

};

Desktop.prototype.setDimensions= function (desktop){
	jQuery(desktop).css({
		"height":screen.height,
	});
};


Desktop.prototype.getElement= function (){
	return this._element
};


Desktop.prototype.placeIcon= function (icon) {
	var taskbar = this._taskbar.getElement();
	var iconTop =getPixelsFromPrecentage( jQuery(taskbar).outerHeight()  , 150);
	var iconLeft = getPixelsFromPrecentage(jQuery(this._element).outerWidth() , 2);
	
	console.log(iconTop +" , "+iconLeft+" - " )
	
	icon.setPosition({
		top :  iconTop,
		left : iconLeft
	});
};

Desktop.prototype.placeNextIcon= function (prevIcon, currentIcon) {
	var iconElem = prevIcon.getElement();
	var iconTop =getPixelsFromPrecentage( jQuery(iconElem).position().top +jQuery(iconElem).outerHeight()   , 120);
	var iconLeft = jQuery(iconElem).position().left;
	
	console.log(iconTop +" , "+iconLeft+" - " )
	
	currentIcon.setPosition({
		top :  iconTop,
		left : iconLeft
	});
};
