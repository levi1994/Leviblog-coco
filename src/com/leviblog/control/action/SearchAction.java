package com.leviblog.control.action;

import com.leviblog.model.page.MainPage;
import com.leviblog.model.serviceImpl.PageServiceImpl;
import com.leviblog.model.serviceImpl.SearchServiceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class SearchAction implements Action{
    private String keyword;
    private SearchServiceImpl service = new SearchServiceImpl();
    
	@Override
	public String execute() throws Exception {
		MainPage main = new PageServiceImpl().getMain();
		main.setArticleList(service.search(keyword));
		ActionContext con = ActionContext.getContext();
		con.put("main", main);
		return "success";
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public SearchServiceImpl getService() {
		return service;
	}

	public void setService(SearchServiceImpl service) {
		this.service = service;
	}
	
	

}
