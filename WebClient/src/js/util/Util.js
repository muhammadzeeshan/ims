

function getPixelsFromPrecentage(pixel , percentage){
	
	var calculatedPixels = (pixel * percentage) / 100;
	return calculatedPixels;
	
}

function getWindowHeight(){

	return jQuery(window).height();
}