package com.watchapp.service;

import java.util.List;
import com.watchapp.model.Category;

public interface ICategoryService {
	Category addCategory(Category category);

	void updateCategory(Category category);

	void deleteCategory(int categoryId);

	List<Category> getAll();

	Category getById(int categoryId);
	
	List<Category> getcategoryName(String categoryName);
	
	List<Category> getByDialColor(String dialColor);
	
	List<Category> getByNameAndDialColor(String name,String dialColor);
	
	List<Category> getByMaterialAndDialColor(String name,String dialColor);
	
	List<Category> getByWatchName(String name);
	
	List<Category> getByCategoryNameAndPrice(String categoryName,double price);
   
}
