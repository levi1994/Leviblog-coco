package com.leviblog.control.action;

import com.leviblog.model.page.ArticlePage;
import com.leviblog.model.page.IndexPage;
import com.leviblog.model.page.MainPage;
import com.leviblog.model.serviceImpl.PageServiceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class RedirectAction implements Action {
    private  String art_id;
    private String art_type;
    private int pageIndex;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getIndex(){
		IndexPage index = new PageServiceImpl().getIndex();
		ActionContext con = ActionContext.getContext();
		con.put("index", index);
		return SUCCESS;
	}
	
	public String getMain(){
		MainPage main = new PageServiceImpl().getMain();
		ActionContext con = ActionContext.getContext();
		con.put("main", main);
		return "success";
	}
	
	public String getArticle(){
		ArticlePage art = new PageServiceImpl().getArticle(art_id);
		ActionContext con = ActionContext.getContext();
		con.put("art", art);
		return "success";
	}
	
	public String getCategory(){
		if(pageIndex<1){
			pageIndex=1;
		}
		System.out.println(art_type);
		MainPage main = new PageServiceImpl().getCategory(art_type, pageIndex);
		ActionContext con = ActionContext.getContext();
		con.put("main", main);
		return "success";
	}
	
	

	public String getArt_type() {
		return art_type;
	}

	public void setArt_type(String art_type) {
		this.art_type = art_type;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getArt_id() {
		return art_id;
	}

	public void setArt_id(String art_id) {
		this.art_id = art_id;
	}
	
	

}
