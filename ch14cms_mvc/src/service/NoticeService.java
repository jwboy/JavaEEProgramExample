package service;

import java.sql.SQLException;

import dao.NoticeDAO;
import povo.Notice;

public class NoticeService {
	public void add(Notice notice)throws ClassNotFoundException,SQLException{
		NoticeDAO noticeDAO=new NoticeDAO();
		noticeDAO.add(notice);
		noticeDAO.close();
	}
}
