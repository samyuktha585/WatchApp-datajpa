package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Board;

public interface IBoardService {

	Board addOwner(Board board);

	void updateOwner(Board board);

	void deleteOwner(int boardId);

	Board getById(int boardId);

	List<Board> getAll();
}
