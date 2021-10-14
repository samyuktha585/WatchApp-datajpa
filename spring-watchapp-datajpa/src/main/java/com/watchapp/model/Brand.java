package com.watchapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Entity

public class Brand {
	@Id
	@GeneratedValue(generator = "brand_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "brand_gen", sequenceName = "brand_seq", initialValue = 100, allocationSize = 1)
	Integer brandId;
	@Column(name = "brandname", length = 20)
	String brandName;
	@Column(length = 20)
	String origin; // brand belongs to which country
	@OneToMany(mappedBy = "brand")
	List<Watch> watchList;

	public Brand(String brandName, String origin) {
		super();
		this.brandName = brandName;
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + ", origin=" + origin + "]";
	}

}
