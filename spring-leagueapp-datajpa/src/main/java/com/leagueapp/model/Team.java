package com.leagueapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Team {
	@Id
	@GeneratedValue(generator = "team_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "team_gen", sequenceName = "team_seq", initialValue = 100, allocationSize = 1)
	Integer teamId;
	String teamName;
	String owner;
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", owner=" + owner + "]";
	}
	public Team(String teamName, String owner) {
		super();
		this.teamName = teamName;
		this.owner = owner;
	}
	
	
	

}
