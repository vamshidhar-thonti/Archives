package com.cg.spring2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.spring2.dto.TraineeDTO;

@Repository("dao")
public class TraineeDAOImpl implements TraineeDAO {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addTrainee(TraineeDTO trainee) {
		// TODO Auto-generated method stub
		System.out.println("3");
		em.persist(trainee);
		em.flush();
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
