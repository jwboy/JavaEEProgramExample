package vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CategoryItemId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class CategoryItemId implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private Integer bookId;

	// Constructors

	/** default constructor */
	public CategoryItemId() {
	}

	/** full constructor */
	public CategoryItemId(Integer categoryId, Integer bookId) {
		this.categoryId = categoryId;
		this.bookId = bookId;
	}

	// Property accessors

	@Column(name = "category_id", nullable = false)

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "book_id", nullable = false)

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CategoryItemId))
			return false;
		CategoryItemId castOther = (CategoryItemId) other;

		return ((this.getCategoryId() == castOther.getCategoryId()) || (this.getCategoryId() != null
				&& castOther.getCategoryId() != null && this.getCategoryId().equals(castOther.getCategoryId())))
				&& ((this.getBookId() == castOther.getBookId()) || (this.getBookId() != null
						&& castOther.getBookId() != null && this.getBookId().equals(castOther.getBookId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCategoryId() == null ? 0 : this.getCategoryId().hashCode());
		result = 37 * result + (getBookId() == null ? 0 : this.getBookId().hashCode());
		return result;
	}

}