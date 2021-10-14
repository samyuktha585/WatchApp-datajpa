package com.leagueapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sports {
	@Id
	@GeneratedValue(generator = "sports_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sports_gen", sequenceName = "sports_seq", initialValue = 100, allocationSize = 1)
    Integer sportsId;
	String name;
	String origin;
	
	@OneToMany(mappedBy = "sports") //use mappeDBy as league is the primary class/owner of the relationship
	Set<League> leagues;
	public Sports(String name, String origin) {
		super();
		this.name = name;
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Sports [name=" + name + ", origin=" + origin + "]";
	}
	
	
}