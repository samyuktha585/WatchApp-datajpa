package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportsView;
@Repository
public interface ISportsRepository extends JpaRepository<Sports, Integer>{
@Query(value="select *from sportsview",nativeQuery=true)
List<SportsView> getSportsDetails();
}
