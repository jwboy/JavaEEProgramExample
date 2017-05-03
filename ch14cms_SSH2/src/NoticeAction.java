import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NoticeAction extends ActionSupport implements ModelDriven<Notice> {
	private static final long serialVersionUID = -8727185279638883809L;
	Notice notice=new Notice();
	@Resource(name="noticeService")NoticeService noticeService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		noticeService.add(notice);
		return super.execute();
	}

	public NoticeAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Notice getModel() {
		// TODO Auto-generated method stub
		return notice;
	}

	
}
