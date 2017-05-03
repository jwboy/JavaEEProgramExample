package actions;

import beans.CellPhoneNumber;

import com.opensymphony.xwork2.ActionSupport;

public class CellPhoneAction extends ActionSupport {
	CellPhoneNumber cellNumber;

	public CellPhoneNumber getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(CellPhoneNumber cellNumber) {
		this.cellNumber = cellNumber;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.SUCCESS;
	}	
	
	
}
