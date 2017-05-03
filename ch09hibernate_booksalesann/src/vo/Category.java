package vo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "category", catalog = "booksales")

public class Category implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private String notes;
	private Set<CategoryItem> categoryItems = new HashSet<CategoryItem>(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(Integer categoryId, String categoryName, String notes) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.notes = notes;
	}

	/** full constructor */
	public Category(Integer categoryId, String categoryName, String notes, Set<CategoryItem> categoryItems) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.notes = notes;
		this.categoryItems = categoryItems;
	}

	// Property accessors
	@Id

	@Column(name = "category_id", unique = true, nullable = false)

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "category_name", nullable = false, length = 50)

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "notes", nullable = false, length = 50)

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")

	public Set<CategoryItem> getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set<CategoryItem> categoryItems) {
		this.categoryItems = categoryItems;
	}

}