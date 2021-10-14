package com.watchapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchapp.model.Description;
import com.watchapp.repository.IDescriptionRepository;
@Service
public class DescriptionServiceImpl implements IDescriptionService{
@Autowired
IDescriptionRepository descriptionRepo;
public void setDescriptionRepo(IDescriptionRepository descriptionRepo) {
	this.descriptionRepo = descriptionRepo;
}

	@Override
	public Description addDescription(Description description) {
		return descriptionRepo.save(description);
	}

	@Override
	public void updateDescription(Description description) {
		descriptionRepo.save(description);		
	}

	@Override
	public void deleteDescription(int watchId) {
		descriptionRepo.deleteById(watchId);		
	}

	@Override
	public List<Description> getAll() {
		return descriptionRepo.findAll();
	}

	@Override
	public Description getById(int descId) {
		return descriptionRepo.getById(descId);
	}

	@Override
	public List<Description> getByType(String type) {
		return descriptionRepo.findByType(type);
	}

	@Override
	public List<Description> getByStrapColor(String strapColor) {
		return descriptionRepo.findByStrapColor(strapColor);
	}

	@Override
	public List<Description> getByCaseShape(String caseShape) {
		return descriptionRepo.findByCaseShape(caseShape);
	}

	@Override
	public List<Description> getByGender(String gender) {
		return descriptionRepo.findByGender(gender);
	}

	@Override
	public List<Description> getByWatchName(String name) {
		return descriptionRepo.findByName(name);
	}

	@Override
	public List<Description> getByNameAndType(String name, String type) {
		return descriptionRepo.findByNameAndType(name, type);
	}

	@Override
	public List<Description> getByFeature(String feature) {
		return descriptionRepo.findByFeature(feature);
	}

	@Override
	public List<Description> getByMaterial(String material) {
		return descriptionRepo.findByMaterial(material);
	}

//	@Override
//	public List<Description> getBystrapColorAndcaseShape(String strapColor, String caseShape) {
//		return descriptionRepo.findBystrapColorAndcaseShape(strapColor,caseShape);
//	}

	
}

