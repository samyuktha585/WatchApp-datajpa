package com.leagueapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@ToString

public class Matches {
	@Id
	@GeneratedValue(generator = "match_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "match_gen", sequenceName = "match_seq", initialValue = 100, allocationSize = 1) 
private Integer matchId;
	private String squads;
	private String stadiumName;
	
	@ManyToOne
	@JoinColumn(name="league_id")   //to use existing column that is created in unidirectional relation
    League league;
	
	@OneToOne
	@JoinColumn(name="")
	Team team;
		@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		@JoinColumn(name="match_id")
		Set<Team> teams;

	public Matches(String squads, String stadiumName) {
		super();
		this.squads = squads;
		this.stadiumName = stadiumName;
	}
	
}
