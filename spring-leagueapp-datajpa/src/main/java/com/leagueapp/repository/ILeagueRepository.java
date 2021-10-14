package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;
@Repository
public interface ILeagueRepository extends JpaRepository<League, Integer>{
@Query(value="select *from leagueView",nativeQuery = true)
	List<LeagueView> getLeagueDetails();

//if the procedure name and the method name are same then no need of passing attributes with @Procedure
@Procedure(procedureName = "GET_LEAGUE_COUNT")
Integer GET_LEAGUE_COUNT(String country);

//if the procedure
@Procedure(procedureName = "GET_LEAGUE_COUNT")
Integer getLeagueCount(String country);

@Query(name= "findByBoard")
List<League> findLeagueByBoard(String boardname);
}
