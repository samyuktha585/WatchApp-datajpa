package com.watchapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.watchapp.model.Brand;
import com.watchapp.model.Category;
import com.watchapp.model.Description;
import com.watchapp.service.IBrandService;
import com.watchapp.service.ICategoryService;
import com.watchapp.service.IDescriptionService;
import com.watchapp.service.IWatchService;

@SpringBootApplication
public class SpringWatchappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringWatchappDatajpaApplication.class, args);
	}

	@Autowired
	IWatchService watchService;

	public void setWatchService(IWatchService watchService) {
		this.watchService = watchService;
	}

	@Autowired
	IBrandService brandService;

	public void setBrandService(IBrandService brandService) {
		this.brandService = brandService;
	}

	@Autowired
	IDescriptionService descriptionService;

	public void setDescriptionService(IDescriptionService descriptionService) {
		this.descriptionService = descriptionService;
	}

	@Autowired
	ICategoryService categoryService;

	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@Override
	public void run(String... args) throws Exception {
//		Brand brand1 = new Brand("Titan","USA");
//		Brand brand2 = new Brand("Fastrack","London");
//		Brand brand3= new Brand("Fossil","UK");
//		Brand brand4= new Brand("Rolex","England");
//		brandService.addBrand(brand1);
		
//		Description description = new Description("type1","female","Round","red");
//		descriptionService.addDescription(description);
		
		
//		Category category1 = new Category("categoryName","dialColor");
//		categoryService.addCategory(category1);
//		Category category2 = new Category();
//		categoryService.addCategory(category2);
		
//		List<Category> categoryList = Arrays.asList(category1);
//		Set<Category> categorySet = new HashSet<>(categoryList);
		
//		Watch watch = new Watch("ethos",9000,"World-time-Zone","Leather",brand1,categorySet,description);
//		watchService.addWatch(watch);
                                                                                                                                                                                                                                                                              
		System.out.println();
		System.out.println("Getting by Watch name and dial color");
		categoryService.getByNameAndDialColor("ethos", "dialColor").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting by Watch material and dial color");
		categoryService.getByMaterialAndDialColor("material","dialColor").forEach(System.out::println);
		System.out.println();
		System.out.println("Getting category by watch name");
		categoryService.getByWatchName("ethos").forEach(System.out::println);
		System.out.println();
		System.out.println("Getting category name by watch price");
		categoryService.getByCategoryNameAndPrice("categoryName",9000).forEach(System.out::println);
		
		
//		descriptionService.getByStrapColor("red").forEach(System.out::println);
//		List<Description> despList= descriptionService.getAll();
//		for(Description desp: despList) {
//			System.out.println(desp.getCaseShape());
//			System.out.println(desp.getStrapColor());
//			System.out.println(desp.getGender());
//			System.out.println(desp.getDescId());
//			System.out.println(desp.getType());
//			System.out.println(desp.getWatch());
//		}

//		System.out.println();
//		System.out.println();
//		System.out.println("Getting By Gender");
//		descriptionService.getByGender("female").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Getting By Shape");
//		descriptionService.getByCaseShape("round").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Getting Strap color");
//		descriptionService.getByStrapColor("red").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Getting By Type");
//		descriptionService.getByType("type1").forEach(System.out::println);
//		System.out.println("Getting By Strap color and case shape");
//		descriptionService.getBystrapColorAndcaseShape("red","round").forEach(System.out::println);
//		System.out.println();
		
		System.out.println();
		System.out.println("Getting description by watch name");
		descriptionService.getByWatchName("ethos").forEach(System.out::println);
		

		System.out.println();
		System.out.println("Getting description by watch name and type");
		descriptionService.getByNameAndType("ethos","type1").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting description by watch feature");
		descriptionService.getByFeature("World-time-Zone").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting description by watch material");
		descriptionService.getByMaterial("Leather").forEach(System.out::println);
//			System.out.println("Getting all the category List");
//			categoryService.getAll().forEach(System.out::println);;
//			System.out.println();
//			System.out.println();
//		    System.out.println("Getting by dialColor");
//		    categoryService.getByDialColor("dialColor").forEach(System.out::println);
//		System.out.println("Getting by brand  name");
//		brandService.getByBrandName("Titan").forEach(System.out::println);
//		brandService.getByOrigin("USA").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Getting by watch name and brand origin");
//		brandService.getByWatchNameAndOrigin("ethos", "USA").forEach(System.out::println);
	
		
		
		
		
//		System.out.println("Getting By watch Name");
//		watchService.getByName("ethos").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting watch by Price");
//		watchService.getByPrice(10000).forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting watch by features");
//		watchService.getByFeature("World-time-Zone").forEach(System.out::println);
//		
//		 System.out.println();
//		 System.out.println("Getting watch By Material");
//		 watchService.getByMaterial("Leather").forEach(System.out::println);
//			
//		System.out.println();
//		System.out.println("Getting watch By Id");
//	    System.out.println(watchService.getById(1));
//
//		System.out.println();
//		System.out.println("Getting watch By origin");
//		watchService.getByOrigin("USA").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting watch by brand name");
//		watchService.getByBrandName("Titan").forEach(System.out::println);
		
//		System.out.println();
//		System.out.println("Getting By category name");
//		watchService.getByCategoryName("categoryName").forEach(System.out::println);
//		
		
		System.out.println();
		System.out.println("Getting Watch by gender");
		watchService.getByGender("female").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting Watch by case shape");
		watchService.getByCaseShape("round").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting Watch by strap color");
		watchService.getByStrapColor("red").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting Watch by type");
		watchService.getByType("type1").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Getting By dial color");
//		watchService.getByDialColor("dialColor").forEach(System.out::println);
		
//		System.out.println();
//		System.out.println("Getting brand by watch name");
//		brandService.getByWatch("ethos").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting By watch name and origin");
//		brandService.getByWatchNameAndOrigin("ethos","USA").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting By material  and origin");
//		brandService.getByMaterialAndOrigin("Leather","USA").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting By brand  and price");
//		brandService.getByPriceAndBrandName(9000,"Titan").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Getting By feature  and brand name");
//		brandService.getByFeatureAndBrandName("World-time-Zone","Titan").forEach(System.out::println);
		


	}

}








