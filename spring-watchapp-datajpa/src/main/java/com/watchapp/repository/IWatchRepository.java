package com.watchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.watchapp.model.Watch;

@Repository
public interface IWatchRepository extends JpaRepository<Watch, Integer> {

	List<Watch> findByName(String name);


	List<Watch> findByPrice(double price);

	List<Watch> findByMaterial(String material);

	List<Watch> findByFeature(String feature);

	@Query("from Watch w inner join w.brand b where b.brandName=?1")
	List<Watch> findByBrandName(String brandName);

	@Query("from Watch w inner join w.brand b where b.origin=?1")
	List<Watch> findByOrigin(String origin);

	@Query("from Watch w inner join w.categoryList c where c.categoryName=?1")
	List<Watch> findByCategoryName(String categoryName);
	
	@Query("from Watch w inner join w.categoryList c where c.dialColor=?1")
	List<Watch> findByDialColor(String dialColor);
	
	@Query("from Watch w inner join w.description d where d.gender =?1")
	List<Watch> findByGender(String gender);
	
	@Query("from Watch w inner join w.description d where d.caseShape =?1")
	List<Watch> findByCaseShape(String caseShape);
	
	@Query("from Watch w inner join w.description d where d.strapColor =?1")
	List<Watch> findByStrapColor(String strapColor);
	
	@Query("from Watch w inner join w.description d where d.type =?1")
	List<Watch> findByType(String type);

}
