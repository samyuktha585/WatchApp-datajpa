package com.watchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.watchapp.model.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Integer> {

	
	public List<Brand> findByOrigin(String origin);
	
	public List<Brand> findByBrandName(String brandName);

	@Query("from Brand b inner join b.watchList w where w.name=?1")
	List<Brand> findByWatch(String name);
	
	@Query("from Brand b inner join b.watchList w where w.name=?1 and b.origin=?2")
	List<Brand> findByWatchNameAndOrigin(String name,String origin);
	
	@Query("from Brand b inner join b.watchList w where w.material=?1 and b.origin=?2")
	List<Brand> findByMaterialAndOrigin(String material,String origin);
	
	@Query("from Brand b inner join b.watchList w where w.price=?1 and b.brandName=?2")
	List<Brand> findByPriceAndBrandName(double price,String brandName);
	
	@Query("from Brand b inner join b.watchList w where w.feature=?1 and b.brandName=?2")
	List<Brand> findByFeatureAndBrandName(String feature,String brandName);
}
