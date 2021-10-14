package com.leagueapp.model;

//retrieving data from a view
public interface LeagueView {
  //create getter methods for columns in view
	//column names should be in caps
	String getNAME();
	int getDURATION_IN_MONTHS();
	String getCOUNTRY();
}
