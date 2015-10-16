package com.leviblog.control.action;

import com.leviblog.common.util.ExceptionStack;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ErrorAction implements Action {

	@Override
	public String execute() throws Exception {
		ActionContext con = ActionContext.getContext();
		con.put("errorStack", ExceptionStack.get());
		return "success";
	}

}
