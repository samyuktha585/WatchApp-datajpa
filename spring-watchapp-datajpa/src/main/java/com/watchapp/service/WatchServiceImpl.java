package com.watchapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchapp.exceptions.WatchNotFoundException;
import com.watchapp.model.Watch;
import com.watchapp.repository.IWatchRepository;
@Service
public class WatchServiceImpl implements IWatchService{

	@Autowired
	IWatchRepository watchRepository;
	public void setWatchRepository(IWatchRepository watchRepository) {
		this.watchRepository = watchRepository;
	}

	@Override
	public Watch addWatch(Watch watch) {
		return watchRepository.save(watch);
	}

	@Override
	public void updateWatch(Watch watch) {
		watchRepository.save(watch);		
	}

	@Override
	public void deleteWatch(int watchId) {
		watchRepository.deleteById(watchId);		
	}

	@Override
	public List<Watch> getAll() {
		return watchRepository.findAll();
	}

	@Override
	public Watch getById(int watchId) throws WatchNotFoundException{
		return watchRepository.findById(watchId).orElseThrow(() -> new WatchNotFoundException("invalid id"));
//		Watch nwatch =new Watch();
//		nwatch = watchRepository.getById(watchId);
//		return nwatch;
	}

	@Override
	public List<Watch> getByName(String name) {
		List<Watch> watchList = watchRepository.findByName(name);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Name not available");		
		return watchList;
	}


	@Override
	public List<Watch> getByPrice(double price) {
		List<Watch> watchByPrice = watchRepository.findByPrice(price);
		if (watchByPrice.isEmpty())
			throw new WatchNotFoundException("Price not found");
		return watchByPrice;
	}


	@Override
	public List<Watch> getByMaterial(String material) {
		List<Watch> watchList = watchRepository.findByMaterial(material);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Material not available");		
		return watchList;
	}

	@Override
	public List<Watch> getByFeature(String feature) {
		List<Watch> watchList = watchRepository.findByFeature(feature);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Feature not available");		
		return watchList;
	}

	@Override
	public List<Watch> getByBrandName(String brandName) {
		List<Watch> watchList = watchRepository.findByFeature(brandName);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Brand Name not available");		
		return watchList;
		}

	@Override
	public List<Watch> getByOrigin(String origin) {
		List<Watch> watchList = watchRepository.findByOrigin(origin);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("origin Name not available");		
		return watchList;	
		}

	@Override
	public List<Watch> getByCategoryName(String categoryName) {
		List<Watch> watchList = watchRepository.findByName(categoryName);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("categoryName  not available");		
		return watchList;	
		}

	@Override
	public List<Watch> getByDialColor(String dialColor) {
		List<Watch> watchList = watchRepository.findByDialColor(dialColor);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("dialColor  not available");		
		return watchList;	
		}

	@Override
	public List<Watch> getByGender(String gender) {
		List<Watch> watchList = watchRepository.findByGender(gender);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("gender  not available");		
		return watchList;	
		}

	@Override
	public List<Watch> getByCaseShape(String caseShape) {
		List<Watch> watchList = watchRepository.findByCaseShape(caseShape);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Case Shape  not available");		
		return watchList;	
		}

	@Override
	public List<Watch> getByStrapColor(String strapColor) {
		List<Watch> watchList = watchRepository.findByStrapColor(strapColor);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Strap Color not available");		
		return watchList;
		}

	@Override
	public List<Watch> getByType(String type) {
		List<Watch> watchList = watchRepository.findByType(type);
		if(watchList.isEmpty())
		 throw new WatchNotFoundException("Type not available");		
		return watchList;	
		}

}
