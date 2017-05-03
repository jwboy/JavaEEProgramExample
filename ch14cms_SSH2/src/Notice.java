
// default package

import java.util.Date;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Integer id;

	private String title;
	private String author;
	private String content;
	private String phone;	
	private String linktag;
	private Date publictime;
	/** default constructor */
	public Notice() {
	}

	// Constructors

	public Notice(Integer id, String title, String author, String content, String phone, String linktag,
			Date publictime) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.phone = phone;
		this.linktag = linktag;
		this.publictime = publictime;
	}

	public String getAAuthor() {
		return this.author;
	}

	public String getAContent() {
		return this.content;
	}

	/** full constructor */

	// Property accessors

	public Integer getAId() {
		return this.id;
	}

	public String getAPhone() {
		return this.phone;
	}

	public String getATitle() {
		return this.title;
	}

	public String getLinktag() {
		return this.linktag;
	}

	public Date getPublictime() {
		return this.publictime;
	}

	public void setAAuthor(String AAuthor) {
		this.author = AAuthor;
	}

	public void setAContent(String AContent) {
		this.content = AContent;
	}

	public void setAId(Integer AId) {
		this.id = AId;
	}

	public void setAPhone(String APhone) {
		this.phone = APhone;
	}

	public void setATitle(String ATitle) {
		this.title = ATitle;
	}

	public void setLinktag(String ALog) {
		this.linktag = ALog;
	}

	public void setPublictime(Date ADate) {
		this.publictime = ADate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}