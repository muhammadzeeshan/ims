

function getPixelsFromPrecentage(pixel , percentage){
	
	var calculatedPixels = (pixel * percentage) / 100;
	return calculatedPixels;
	
}

function getWindowHeight(){

	return jQuery(window).height();
}

function getCenterPosition(parentDiv, childDiv) {
	
	var parentDivPosition = jQuery(parentDiv).position();
	var halfHeight = jQuery(childDiv).outerHeight(true) / 2;
	var halfWidth = jQuery(childDiv).outerWidth(true) / 2;
	
	return {
		top :  (parentDivPosition.top + halfHeight),
		left : (parentDivPosition.left + halfWidth),
	};
}