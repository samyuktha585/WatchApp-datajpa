package com.watchapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Watch {
	@Id
	@GeneratedValue(generator = "watch_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "watch_gen", sequenceName = "watch_seq", initialValue = 100, allocationSize = 1)
	private Integer watchId;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private double price;
	private String feature;
	private String material;
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "watch_category", joinColumns = { @JoinColumn(name = "watch_id") }, inverseJoinColumns = {
			@JoinColumn(name = "category_id") })
	Set<Category> categoryList;
	@OneToOne
	@JoinColumn(name = "description_id")
	Description description;
	
	@Override
	public String toString() {
		return "Watch [name=" + name + ", price=" + price + ", feature=" + feature + ", material=" + material
				+ ", brand=" + brand + ", category=" + categoryList + ", description=" + description + "]";
	}

	public Watch(String name, double price, String feature, String material, Brand brand, Set<Category> categoryList,
			Description description) {
		super();
		this.name = name;
		this.price = price;
		this.feature = feature;
		this.material = material;
		this.brand = brand;
		this.categoryList = categoryList;
		this.description = description;
	}
	
	
	

	

}
