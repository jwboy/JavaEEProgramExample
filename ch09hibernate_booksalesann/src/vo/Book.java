package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "book", catalog = "booksales")

public class Book implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private Seller seller;
	private String bookName;
	private Float bookPrice;
	private String publisher;
	private Date publishedDate;
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);
	private Set<CategoryItem> categoryItems = new HashSet<CategoryItem>(0);

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
			Set<Orderdetail> orderdetails, Set<CategoryItem> categoryItems) {
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
	@Id

	@Column(name = "book_id", unique = true, nullable = false)

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller_id", nullable = false)

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Column(name = "book_name", nullable = false, length = 50)

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "book_price", nullable = false, precision = 12, scale = 0)

	public Float getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Column(name = "publisher", nullable = false, length = 50)

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "published_date", nullable = false, length = 10)

	public Date getPublishedDate() {
		return this.publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "book")

	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "book")

	public Set<CategoryItem> getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set<CategoryItem> categoryItems) {
		this.categoryItems = categoryItems;
	}

}