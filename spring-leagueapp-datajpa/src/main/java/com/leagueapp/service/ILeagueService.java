package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;

public interface ILeagueService {
	
League addLeague(League league);
	void updateLeague(League league);
	void deleteLeague(int leagueId);
	League getById(int leagueId);
	List<League> getAll();
	
	
	List<LeagueView> getLeagueDetails();
	
	Integer getLeagueCount(String country);
	
	List<League> getLeagueByBoard(String boardname);
}
