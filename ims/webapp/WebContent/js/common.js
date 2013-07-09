
function createModalDialog(){
	
	var dialogObj= jQuery("#dialog");
	dialogObj.css({"width":"600px", "height":"200px","display":"inline"});
	
	var centerCoordinates = calculateCenterOfScreenRelativeToElem(dialogObj);
	jQuery("#dialog").css({
		"top" : centerCoordinates.top+"px",
		"left" : centerCoordinates.left+"px"
	});
	return dialogObj;
	
}

function iconClickHandler(iconObj, url) {
	
	var params = new AjaxRequestParameters(url);
	params.setResponseType(HTML_RESPONSE_TPE);
	
	params.setSuccessHandler(function (param){
		var data = params.getResponseData();
		var dialogObj = createModalDialog();
		dialogObj.empty();
		dialogObj.append(data);
		
	}); 
	
	params.setErrorHandler(function (param) {
		
		//alert("request Error");
	});
	
	params.setCompleteHandler(function (param) {
		//alert("request Complete");
	});
		
	sendAjaxRequest(params);
	
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


function sendAjaxRequest(params) {
	
	jQuery.ajax({
		
		url : params.getUrl(), 
		dataType : params.getResponseType(),
		beforeSend : function (xhr, settings){
			
		},
		complete : function(xhr, textStatus){
			params.setXhr(xhr);
			params.setRequestStatus(textStatus);
			params.executeCompleteHandler();
			
		},
		error : function (xhr, textStatus, errorThrown){

			params.setXhr(xhr);
			params.setRequestStatus(textStatus);
			params.setErrorThrown(errorThrown);
			params.executeErrorHandler();
			
		},
		success : function(responseData,textStatus, jqXHR) {
			params.setResponseData(responseData);
			params.executeSuccessHandler();
		}
	});
}
