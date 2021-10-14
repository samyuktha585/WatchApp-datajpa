package com.watchapp.service;

import java.util.List;

import com.watchapp.model.Watch;

public interface IWatchService {
	Watch addWatch(Watch watch);

	void updateWatch(Watch watch);

	void deleteWatch(int watchId);

	List<Watch> getAll();

	Watch getById(int watchId);
//------------------------------------------------------------------------------//
	List<Watch> getByName(String name);

	
    List<Watch> getByMaterial(String material);
    
	List<Watch> getByFeature(String feature);

	List<Watch> getByPrice(double price);
//-----------------------------------------------------------------------------//
	
List<Watch> getByBrandName(String brandName);
	
List<Watch> getByOrigin(String origin);

List<Watch> getByCategoryName(String categoryName);

List<Watch> getByDialColor(String dialColor);
	
List<Watch> getByGender(String gender);

List<Watch> getByCaseShape(String caseShape);

List<Watch> getByStrapColor(String strapColor);

List<Watch> getByType(String type);
	
}
