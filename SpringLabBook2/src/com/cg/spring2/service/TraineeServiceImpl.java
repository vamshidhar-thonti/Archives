package com.cg.spring2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring2.DAO.TraineeDAO;
import com.cg.spring2.dto.TraineeDTO;

@Service("service")
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDAO dao;
	
	@Override
	public void addTrainee(TraineeDTO trainee) {
		// TODO Auto-generated method stub
		System.out.println("2");
		dao.addTrainee(trainee);
	}

	@Override
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyTrainee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TraineeDTO retrieveTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TraineeDTO> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
