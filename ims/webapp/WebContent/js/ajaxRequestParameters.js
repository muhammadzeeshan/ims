
function AjaxRequestParameters(reqUrl){
	this._url = reqUrl;
	this._data = null;
	this._requestStatus=null;
	this._xhr=null;
	this._errorThrown = null;
	this._successHandler = null;
	this._errorHandler = null;
	this._completeHandler = null;
	this._responseType = "string";
	
}



//Setter <Start>

AjaxRequestParameters.prototype.setXhr = function(xhr){
	this._xhr = xhr;
};

AjaxRequestParameters.prototype.setRequestStatus = function(reqStatus){
	this._requestStatus = reqStatus;
};

AjaxRequestParameters.prototype.setErrorThrown = function(errorThrown) {
	this._errorThrown = errorThrown;
};

AjaxRequestParameters.prototype.setResponseData = function(data) {
	this._data = data;
};

AjaxRequestParameters.prototype.setResponseType= function(data) {
	this._responseType = data;
};
//Setter <End>




// Getters <Start>
AjaxRequestParameters.prototype.getUrl= function() {
	return  this._url;
};
AjaxRequestParameters.prototype.getRequestStatus = function(){
	return this._requestStatus;
};

AjaxRequestParameters.prototype.getXhr = function(){
	return  this._xhr;
};

AjaxRequestParameters.prototype.getErrorThrown = function() {
	return  this._errorThrown;
};

AjaxRequestParameters.prototype.getResponseData = function() {
	return  this._data;
};
AjaxRequestParameters.prototype.getResponseType= function() {
	return this._responseType;
};
//Getters <End>



//Set handlers <Start>
AjaxRequestParameters.prototype.setSuccessHandler = function (handler){
	this._successHandler = handler;
};

AjaxRequestParameters.prototype.setErrorHandler = function (handler){
	this._errorHandler = handler;
};

AjaxRequestParameters.prototype.setCompleteHandler = function (handler){
	this._completeHandler = handler;
};
//Set handlers <End>




//Execute handler <Start>
AjaxRequestParameters.prototype.executeErrorHandler = function (){
	if(this._errorHandler) {
		this._errorHandler();
	}
		
};

AjaxRequestParameters.prototype.executeSuccessHandler = function (){
	if(this._successHandler){
		this._successHandler();	
	}
	
};

AjaxRequestParameters.prototype.executeCompleteHandler = function (){
	if(this._completeHandler){
		this._completeHandler();	
	}
	
};

//Execute handler <End>