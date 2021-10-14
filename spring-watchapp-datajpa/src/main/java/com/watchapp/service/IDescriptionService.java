package com.watchapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchapp.model.Description;
import com.watchapp.repository.ICategoryRepository;
@Service
public interface IDescriptionService {

	Description addDescription(Description description);

	void updateDescription(Description description);

	void deleteDescription(int watchId);

	List<Description> getAll();

	Description getById(int descId);

	List<Description> getByType(String type);


	List<Description> getByStrapColor(String strapColor);
	
	List<Description>  getByCaseShape(String caseShape);
	
	List<Description>  getByGender(String gender);
	
	List<Description> getByWatchName(String name);
	
	List<Description> getByNameAndType(String name,String type);
	
	List<Description> getByFeature(String feature);
	
	List<Description> getByMaterial(String material);
	
	
	//List<Description> getBystrapColorAndcaseShape(String strapColor,String caseShape);

}
