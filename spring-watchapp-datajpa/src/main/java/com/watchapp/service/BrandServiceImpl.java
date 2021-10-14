package com.watchapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.watchapp.model.Brand;
import com.watchapp.repository.IBrandRepository;
@Service
public class BrandServiceImpl implements IBrandService{
@Autowired
IBrandRepository brandRepository;
public void setBrandRepository(IBrandRepository brandRepository) {
	this.brandRepository = brandRepository;
}



	@Override
	public Brand addBrand(Brand brand) {
		return brandRepository.save(brand);
	}



	@Override
	public List<Brand> getByOrigin(String origin) {
		return brandRepository.findByOrigin(origin);
	}



	@Override
	public List<Brand> getByBrandName(String brandName) {
		return brandRepository.findByBrandName(brandName);
	}



	@Override
	public List<Brand> getByWatch(String name) {
		return brandRepository.findByWatch(name);
	}



	@Override
	public List<Brand> getByWatchNameAndOrigin(String watchName, String origin) {
		return brandRepository.findByWatchNameAndOrigin(watchName,origin);
	}



	@Override
	public List<Brand> getByMaterialAndOrigin(String material, String origin) {
		return brandRepository.findByMaterialAndOrigin(material, origin);
	}



	@Override
	public List<Brand> getByPriceAndBrandName(double price,String brandName) {
		return brandRepository.findByPriceAndBrandName(price, brandName);
	}



	@Override
	public List<Brand> getByFeatureAndBrandName(String feature, String brandName) {
		return brandRepository.findByFeatureAndBrandName(feature, brandName);
	}
	


	

}
