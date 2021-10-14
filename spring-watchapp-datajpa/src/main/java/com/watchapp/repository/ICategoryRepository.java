package com.watchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.watchapp.model.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer>{

	List<Category> findByCategoryName(String categoryName);
	
	List<Category> findByDialColor(String dialColor);
	
	@Query("from Category c inner join c.watchList w where w.name=?1")
	List<Category> findByName(String name);

	@Query(value="from Category c inner join c.watchList w where w.name=?1 and c.dialColor=?2") //from Category c inner join c.watch w where w.name=?1 and c.dialColor=?2"
	List<Category> findByNameAndDialColor(String name,String dialColor);
	
	@Query(value="from Category c inner join c.watchList w where w.material=?1 and c.dialColor=?2") 
	List<Category> findByMaterialAndDialColor(String material,String dialColor);
	
	@Query(value="from Category c inner join c.watchList w where c.categoryName=?1 and w.price=?2") 
	List<Category> findByCategoryNameAndPrice(String categoryName,double price);
	}
