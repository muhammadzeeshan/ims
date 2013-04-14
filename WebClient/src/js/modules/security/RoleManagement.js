function RoleManagement(args){
	this._id = "roleManagementDialog";
	this._desktopRef = args.desktop ? args.desktop : null;
}

RoleManagement.prototype.init = function() {
	
	var wndw = new Window({
		desktop : this._desktopRef,
		id : this._id,
	});
	wndw.init();
}

RoleManagement.prototype.getId= function() {
	return this._id	
}
