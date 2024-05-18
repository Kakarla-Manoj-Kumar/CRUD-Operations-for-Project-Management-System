package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import models.ProjectEntity;
import services.ProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@PostMapping("/addProject")
	public ProjectEntity saveProject(@RequestBody ProjectEntity project) {
		return service.addProject(project);
	}
	
	@GetMapping("/getProject")
	public List<ProjectEntity> getALL() {
		return service.getAllProjects();
	}
	
	@GetMapping("/getOne")
	public ProjectEntity getProject(@RequestParam Long proId) {
		return service.getByProjectId(proId);
	}
	
	@PutMapping("/editProject")
	public ProjectEntity updateProject( @RequestBody ProjectEntity project) {
		return service.editProject(project);
	}
	
	@DeleteMapping("/deletProject")
	public String deleteProject(@RequestParam Long proId) {
		return service.deleteProject(proId);
	}
	
	

}
