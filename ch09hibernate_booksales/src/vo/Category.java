package vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private String notes;
	private Set categoryItems = new HashSet(0);

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
	public Category(Integer categoryId, String categoryName, String notes, Set categoryItems) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.notes = notes;
		this.categoryItems = categoryItems;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Set getCategoryItems() {
		return this.categoryItems;
	}

	public void setCategoryItems(Set categoryItems) {
		this.categoryItems = categoryItems;
	}

}