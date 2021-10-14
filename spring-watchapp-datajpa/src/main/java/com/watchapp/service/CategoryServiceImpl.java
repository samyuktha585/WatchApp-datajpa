package com.watchapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchapp.model.Category;
import com.watchapp.model.Watch;
import com.watchapp.repository.ICategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	ICategoryRepository categoryRepository;

	public void setCategoryService(ICategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getById(int categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.getById(categoryId);
	}

	@Override
	public List<Category> getcategoryName(String categoryName) {
		return categoryRepository.findByCategoryName(categoryName);
	}

	@Override
	public List<Category> getByDialColor(String dialColor) {
		return categoryRepository.findByDialColor(dialColor);
	}

	@Override
	public List<Category> getByNameAndDialColor(String name, String dialColor) {
		return categoryRepository.findByNameAndDialColor(name, dialColor);
	}

	@Override
	public List<Category> getByMaterialAndDialColor(String name, String dialColor) {
		return categoryRepository.findByMaterialAndDialColor(name, dialColor);
	}

	@Override
	public List<Category> getByWatchName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> getByCategoryNameAndPrice(String categoryName, double price) {
		return categoryRepository.findByCategoryNameAndPrice(categoryName, price);
	}

}
