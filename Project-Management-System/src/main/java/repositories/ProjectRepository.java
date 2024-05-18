package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ProjectEntity;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long>{

}
