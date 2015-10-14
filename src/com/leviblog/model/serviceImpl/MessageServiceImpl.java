package com.leviblog.model.serviceImpl;

import com.leviblog.common.util.DateUtil;
import com.leviblog.model.service.MessageService;
import com.leviblog.orm.dao.MessageDao;
import com.leviblog.orm.entity.Message;

public class MessageServiceImpl  implements MessageService{
	
     MessageDao dao = new  MessageDao();
     
	@Override
	public boolean leaveMessage(Message message) {
		message.setMes_datetime(DateUtil.getDateTime());
		message.setMes_id(createId());
		dao.add(message);
		return true;
	}
	
	/*
	 * 这是生成id的算法
	 */
	public String createId(){
		String datetime = DateUtil.getDateTime().replaceAll("-", "")
				.replaceAll(":", "")
				.replaceAll(" ", "");
		String t = (int) (Math.random()*1000)+"";
		datetime+=t;
		return datetime;
	}
}
