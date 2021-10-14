package com.watchapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Category {
	@Id
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq", initialValue = 1, allocationSize = 1)
	Integer categoryId;
	@Column(length = 20)
    String categoryName; //sports,luxury,smart,kids,water-resistant
	@Column(length = 20)
    String dialColor;
    @ManyToMany(mappedBy="categoryList")
	Set<Watch> watchList;
	public Category(String categoryName, String dialColor) {
		super();
		this.categoryName = categoryName;
		this.dialColor = dialColor;
	}
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", dialColor=" + dialColor + "]";
	}
    
}
