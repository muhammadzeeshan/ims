
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

	this.createModuleIcons();

};

Desktop.prototype.setDimensions= function (desktop){
	jQuery(desktop).css({
		"height":getWindowHeight(),
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


Desktop.prototype.createModuleIcons = function () {

	var classInstance = this;
	//1st Icon;
	var icon = new Icon({
		desktop : this,
		title : "Role Management",
		id:"iconRoleManagement",
	});
	icon.init();
	this.placeIcon(icon)
	this._icons[icon.getId()] = icon;
	icon.bindEvent({
		event : "dblclick",
		data:{},
		handler : function(e){
			console.log("I am First Icon")
			var roleManagement = new RoleManagement({
				desktop : classInstance
			});
			windows[roleManagement.getId()] = roleManagement;
			roleManagement.init();
		}
	})

	// 2nd icon;
	var newIcon = new Icon({
		desktop : this,
		title : "My Another Icon",
		id:"icon-2",
	});
	newIcon.init();
	this.placeNextIcon(icon, newIcon);
	this._icons[newIcon.getId()] = newIcon;
	newIcon.bindEvent({
		event : "dblclick",
		data:{},
		handler : function(e) {
			console.log("I am Second Icon");
		}
	})

};


