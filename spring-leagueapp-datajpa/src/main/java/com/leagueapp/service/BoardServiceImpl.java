package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Board;
import com.leagueapp.repository.IBoardRepository;

@Service
public class BoardServiceImpl implements IBoardService
{
@Autowired
IBoardRepository ownerRepo;

	@Override
	public Board addOwner(Board board) {
		// TODO Auto-generated method stub
		return ownerRepo.save(board);
	}

	@Override
	public void updateOwner(Board board) {
		ownerRepo.save(board);		
	}

	@Override
	public void deleteOwner(int boardId) {
		ownerRepo.deleteById(boardId);		
	}

	@Override
	public Board getById(int boardId) {
		// TODO Auto-generated method stub
		return ownerRepo.findById(boardId).get();
	}

	@Override
	public List<Board> getAll() {
		return ownerRepo.findAll();
	}

}
