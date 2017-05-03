import javax.annotation.Resource;

public class NoticeServiceBean implements NoticeService {

	@Resource(name="noticeDAO")NoticeDAO noticeDAO;
	@Override
	public void add(Notice notice) {
		// TODO Auto-generated method stub
		noticeDAO.save(notice);
	}

}
