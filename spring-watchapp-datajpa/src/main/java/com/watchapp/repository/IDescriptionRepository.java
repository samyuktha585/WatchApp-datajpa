package com.watchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.watchapp.model.Description;
@Repository
public interface IDescriptionRepository extends  JpaRepository<Description, Integer>{

	
	List<Description> findByType(String type);

	List<Description> findByGender(String gender);

	List<Description> findByStrapColor(String strapColor);
	
	List<Description>  findByCaseShape(String caseShape);
	
	@Query("from Description d inner join d.watch w where w.name =?1")
	List<Description> findByName(String name);
	
	@Query("from Description d inner join d.watch w where w.name =?1 and d.type=?2")
	List<Description> findByNameAndType(String name,String type);
	
	@Query("from Description d inner join d.watch w where w.material =?1")
	List<Description> findByMaterial(String material);
	
	@Query("from Description d inner join d.watch w where w.feature =?1")
	List<Description> findByFeature(String feature);


}
