package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportsView;

public interface ISportService {
	Sports addSports(Sports sports);
	void updateSports(Sports sports);
	void deleteSports(int sportsId);
	Sports getById(int sportsId);
	List<Sports> getAll();
	List<SportsView> getSportsView();
	
	//calling stored procedure
	
	
}
