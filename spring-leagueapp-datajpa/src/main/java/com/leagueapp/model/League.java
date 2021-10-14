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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
@NamedQuery(name ="findByBoard",query="from League l inner join l.board b where b.name=?1")
public class League {
	@Id
	@GeneratedValue(generator = "league_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "league_gen", sequenceName = "league_seq", initialValue = 1, allocationSize = 1)
	Integer leagueId;
	String name;
	@OneToOne   //(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "board_id")   //to give a different column name
	Board board;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="league_id")   //to remove the intermediate table and add the column to many side
	Set<Matches> match;
	
	String country;
	int durationInMonths;
  //league is primary class .if you use ManyToOne add @JoinColumn annotation together with this 
	@ManyToOne
	@JoinColumn(name = "sports_id")
	Sports sports;
	@Override
	public String toString() {
		return "League [name=" + name + ", owner=" + board + ", match=" + match + ", country=" + country
				+ ", durationInMonths=" + durationInMonths + ", sports=" + sports + "]";
	}
	
	
	
}