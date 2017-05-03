package vo;

import java.util.Date;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */

public class Member implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String resume;
	private String photo;
	private Date createdate;

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** minimal constructor */
	public Member(Integer id, String username, String password, Date createdate) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.createdate = createdate;
	}

	/** full constructor */
	public Member(Integer id, String username, String password, String resume, String photo, Date createdate) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.resume = resume;
		this.photo = photo;
		this.createdate = createdate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResume() {
		return this.resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}