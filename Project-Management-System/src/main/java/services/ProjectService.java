package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.ProjectEntity;
import repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;

	public ProjectEntity addProject(ProjectEntity project) {
		return repository.save(project);
	}

	public List<ProjectEntity> getAllProjects() {
		return repository.findAll();
	}

	public ProjectEntity getByProjectId(Long proId) {
		Optional<ProjectEntity> optionalProject = repository.findById(proId);
		ProjectEntity project = null;
		if (optionalProject.isPresent()) {
			project = optionalProject.get();
		} else {
			throw new RuntimeException("Project not Founf for Id :" + proId);
		}

		return project;
	}

	public ProjectEntity editProject(ProjectEntity project) {
		ProjectEntity existingProject = repository.getReferenceById(project.getId());
		existingProject.setName(project.getName());
		existingProject.setDescription(project.getDescription());
		existingProject.setStartDate(project.getStartDate());
		existingProject.setEndDate(project.getEndDate());
		return repository.save(existingProject);
	}

	public String deleteProject(Long proId) {
		
	   repository.deleteById(proId);
		
	   return "Project "+proId+"Deleted Successfully";
	}

}
