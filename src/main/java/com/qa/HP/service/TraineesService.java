package com.qa.HP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.HP.domain.Trainees;
import com.qa.HP.domain.TraineesRepo;

public class TraineesService {
	
	@Autowired
	private TraineesRepo repo;

	private TraineesService(TraineesRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Trainees> getTrainee() {
		return this.repo.findAll();
	}

	public Trainees createTrainee(Trainees trainee) {
		return this.repo.save(trainee);
	}

//delete trainee
 // public boolean deleteTrainee(Long id) {
	//	this.repository.deleteById(id);
	//	return !this.repository.existsById(id);
	//}

// update trainee
//	public Trainee updateTrainee(Trainee trainee, Long id) {
//		Optional<Trainee> optTrainee = this.repository.findById(id);
//		Trainee oldTrainee = optTrainee.orElseThrow(() -> new TraineeNotFoundException());

	//	oldTrainee.setTraineeID(trainee.getTraineeID());
	//  oldTrainee.setFirstName(trainee.getFirstName());
  //	oldTrainee.setSecondName(trainee.getSecondName());
  //  oldTrainee.setCohort(trainee.getCohort());
  //  oldTrainee.setPassword(trainee.getPassword());
    
	//	Trainee updatedTrainee = this.repository.save(oldTrainee);
	//	return updatedTrainee;

	//}
} 

