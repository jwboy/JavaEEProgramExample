package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import povo.Notice;

public class NoticeDAO extends BaseDAO {
	static String ADD_NOTICE = "insert into article(a_title,a_log,a_content,a_author,"
			+ "a_date, a_phone)value(?,?,?,?,?,?)";

	public NoticeDAO() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void add(Notice notice)throws SQLException{
		ArrayList<Object> params=new ArrayList<Object>();
		params.add(notice.getTitle());
		params.add(notice.getLinktag());
		params.add(notice.getContent());
		params.add(notice.getAuthor());
		params.add(notice.getPublictime());
		params.add(notice.getPhone());
		executeUpdate(ADD_NOTICE,params.toArray());
	}
}
