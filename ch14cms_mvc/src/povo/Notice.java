package povo;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private String content;
	private String author;
	private Date publictime;
	private String linktag;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublictime() {
		return publictime;
	}
	public void setPublictime(Date publictime) {
		this.publictime = publictime;
	}
	public String getLinktag() {
		return linktag;
	}
	public void setLinktag(String linktag) {
		this.linktag = linktag;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
