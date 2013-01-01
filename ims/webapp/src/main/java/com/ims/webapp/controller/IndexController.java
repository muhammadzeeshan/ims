package com.ims.webapp.controller;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;


@Namespace(value="/")
@ResultPath(value="/")
@Results({
	@Result(name="displayLayout", location="desktopLayout", type="tiles")
})

public class IndexController {
	
	@Action(value="index")
	public String displayLayout() {
		return "displayLayout";
	}

}
