package com.leagueapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;
import com.leagueapp.repository.ILeagueRepository;
@Service
public class LeagueServiceImpl implements ILeagueService{
@Autowired
ILeagueRepository leagueRepo;
	@Override
	public League addLeague(League league) {
		return leagueRepo.save(league);
	}

	@Override
	public void updateLeague(League league) {
		leagueRepo.save(league);
	}

	@Override
	public void deleteLeague(int leagueId) {
		leagueRepo.deleteById(leagueId);	
	}

	@Override
	public League getById(int leagueId) {
		return leagueRepo.findById(leagueId).get();
	}

	@Override
	public List<League> getAll() {
		return leagueRepo.findAll();
	}

	@Override
	public List<LeagueView> getLeagueDetails() {
		return leagueRepo.getLeagueDetails();
	}

	@Override
	public Integer getLeagueCount(String country) {
		return leagueRepo.GET_LEAGUE_COUNT(country);
	}

	@Override
	public List<League> getLeagueByBoard(String boardname) {
		return leagueRepo.findLeagueByBoard(boardname);
	}

}