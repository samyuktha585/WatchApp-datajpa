package com.watchapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.watchapp.model.Watch;
import com.watchapp.service.IWatchService;

@RestController
@RequestMapping("watch-api")
public class WatchappController {
	@Autowired
	IWatchService watchService;
	
	@PostMapping("/watches")
	Watch addWatch(@RequestBody Watch watch){
		return watchService.addWatch(watch);
	}

	@PutMapping("/watches")
	void updateWatch(@RequestBody Watch watch){
		watchService.updateWatch(watch);
	}
	
	@DeleteMapping("/watches")
	void deleteWatch(int watchId){
		watchService.deleteWatch(watchId);
	}
	@GetMapping("/watches")
	List<Watch> getAll(){
		return watchService.getAll();
	}
	@GetMapping("/watches/{watchId}")
	ResponseEntity<Watch> getById(@PathVariable("watchId") int watchId) {
		Watch watch = watchService.getById(watchId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get one watch by Id");
		headers.add("info", "Returning one Watch");
		ResponseEntity<Watch> responseproduct = new ResponseEntity<Watch>(watch, headers, HttpStatus.OK);
		return responseproduct;
	}

	
	@GetMapping("/watches/name/{name}")
	ResponseEntity<List<Watch>> getByWatchName(@PathVariable("name") String name) {
		List<Watch> watchesByCategory = watchService.getByName(name);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get WatchList By name");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(watchesByCategory);
	}
	@GetMapping("/watches/feature/{feature}")
	List<Watch> getByFeature(@PathVariable("feature") String feature) {
		return watchService.getByFeature(feature);
	}
	@GetMapping("/watches/material/{material}")
	List<Watch> getByMaterial(@PathVariable("material") String material) {
		return watchService.getByMaterial(material);
	}
}
