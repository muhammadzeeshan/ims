function createModalDialog(){
	
	var dialogObj= jQuery("#dialog");
	dialogObj.css({"width":"600px", "height":"200px","display":"inline"});
	
	var centerCoordinates = calculateCenterOfScreenRelativeToElem(dialogObj);
	jQuery("#dialog").css({
		"top" : centerCoordinates.top+"px",
		"left" : centerCoordinates.left+"px"
	});
}

function iconClickHandler(iconObj) {
	createModalDialog();
}

function calculateCenterOfScreenRelativeToElem(elem){
	
	var screenWidth = screen.width;
	var screenHeight = screen.height;
	
	var screenWidthCenter = screenWidth / 2;
	var screenHeightCenter = screenHeight/ 2;

	var axis = {
			top : 0,
			left : 0
		};

	if(elem){
		
		axis.top = screenHeightCenter - (parseInt(elem.css("height")) / 2);
		axis.left = screenWidthCenter - (parseInt(elem.css("width")) / 2);
	}
	
	return axis;
	
}