package vo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CategoryItem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "category_item", catalog = "booksales")

public class CategoryItem implements java.io.Serializable {

	// Fields

	private CategoryItemId id;
	private Book book;
	private Category category;

	// Constructors

	/** default constructor */
	public CategoryItem() {
	}

	/** full constructor */
	public CategoryItem(CategoryItemId id, Book book, Category category) {
		this.id = id;
		this.book = book;
		this.category = category;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "categoryId", column = @Column(name = "category_id", nullable = false)),
			@AttributeOverride(name = "bookId", column = @Column(name = "book_id", nullable = false)) })

	public CategoryItemId getId() {
		return this.id;
	}

	public void setId(CategoryItemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", nullable = false, insertable = false, updatable = false)

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false, insertable = false, updatable = false)

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}