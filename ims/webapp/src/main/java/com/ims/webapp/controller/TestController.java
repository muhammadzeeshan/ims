package com.ims.webapp.controller;
import org.apache.struts.annotations.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.views.tiles.TilesResult;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/")
@ResultPath(value="/")
@Results({
	@Result(name="success", location="tiletest", type="tiles")
})
public class TestController {
	
	@Action(value="handle")
	public String  handleTest(){
		return "success";
	}
}
