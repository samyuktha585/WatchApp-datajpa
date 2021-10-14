package com.watchapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Description {
	@Id
	@GeneratedValue(generator = "description_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "description_gen", sequenceName = "description_seq", initialValue = 1, allocationSize = 1)
    Integer descId;                       //serialId
    private String type;                  //digital,analog
    private String gender;
    private String caseShape;             //analog
    private String strapColor;            // gold
    @OneToOne(mappedBy = "description")
	private Watch watch;
	public Description(String type, String gender, String caseShape, String strapColor) {
		super();
		this.type = type;
		this.gender = gender;
		
		this.caseShape = caseShape;
		this.strapColor = strapColor;
	}
	@Override
	public String toString() {
		return "Description [type=" + type + ", gender=" + gender + ", caseShape=" + caseShape + ", strapColor="
				+ strapColor + "]";
	}
	
	

}
