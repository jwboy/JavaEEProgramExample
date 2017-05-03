/**
 * UserInfo.java �û���ϢBean
 */
package chap04;

public class UserInfo {
	private String uName;//�û�����
	private String sex;//�Ա�
	private String homeAddress;//��������
	private String education;//ѧ��
	
	//��Ա������get��set����
	public String getuName() {
		return this.uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String gethomeAddress() {
		return this.homeAddress;
	}
	public void sethomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public String getEducation() {
		return this.education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
} 
