package com.leviblog.control.action;

import com.leviblog.model.serviceImpl.MessageServiceImpl;
import com.leviblog.orm.entity.Message;
import com.opensymphony.xwork2.Action;

public class LeaveMessageAction implements Action{
	private Message message;
	private MessageServiceImpl mes = new MessageServiceImpl();
	@Override
	public String execute() throws Exception {
		System.out.println(message.getMes_name());
		return null;
	}
	
	/*
	 * 将留言写入数据库
	 */
	public String leaveMessage(){
		mes.leaveMessage(message);
		return "success";
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	

}
