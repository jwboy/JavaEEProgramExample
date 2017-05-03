package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private Seller seller;
	private String bookName;
	private Float bookPrice;
	private String publisher;
	private Date publishedDate;
	private Set orderdetails = new HashSet(0);
	private Set categoryItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(Integer bookId, Seller seller, String bookName, Float bookPrice, String publisher, Date publishedDate) {
		this.bookId = bookId;
		this.seller = seller;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
	}

	/** full constructor */
	public Book(Integer bookId, Seller seller, String bookName, Float bookPrice, String publisher, Date publishedDate,
			Set orderdetails, Set categoryItems) {
		this.bookId = bookId;
		this.seller = seller;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.orderdetails = orderdetails;
		this.categoryItems = categoryItems;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Float getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishedDate() {
		return this.publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Set getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set categoryItems) {
		this.categoryItems = categoryItems;
	}

}