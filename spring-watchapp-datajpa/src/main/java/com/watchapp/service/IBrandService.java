package com.watchapp.service;

import java.util.List;

import com.watchapp.model.Brand;

public interface IBrandService {
	//public List<Brand> getByWatchName(String name);

	//public List<Brand> getByWatchNameAndOrigin(String name, String origin);

	public Brand addBrand(Brand brand);
	
	public List<Brand> getByOrigin(String origin);
	
	public List<Brand> getByBrandName(String brandName);
	
	public List<Brand> getByWatch(String name);
	
	public List<Brand> getByWatchNameAndOrigin(String watchName,String origin);
	
	public List<Brand> getByMaterialAndOrigin(String material,String origin);
	
	public List<Brand> getByPriceAndBrandName(double price,String brandName);
	
	public List<Brand> getByFeatureAndBrandName(String feature,String brandName);
}

