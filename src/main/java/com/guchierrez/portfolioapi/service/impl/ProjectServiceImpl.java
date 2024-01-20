package com.guchierrez.portfolioapi.service.impl;

import com.guchierrez.portfolioapi.dto.ProjectDTO;
import com.guchierrez.portfolioapi.exception.AppException;
import com.guchierrez.portfolioapi.model.Project;
import com.guchierrez.portfolioapi.repository.ProjectRepository;
import com.guchierrez.portfolioapi.service.ProjectService;
import org.springframework.http.HttpStatus;

import java.util.List;


public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;

    public Project createProject(final ProjectDTO projectData) {
        Project createdProject = new Project();

        createdProject.setName(projectData.getName());
        createdProject.setDescription(projectData.getDescription());
        createdProject.setTechnologies(projectData.getTechnologies());
        createdProject.setFeatures(projectData.getFeatures());

        return projectRepository.save(createdProject);
    }

    public List<Project> readProjects() {
        return projectRepository.findAll();
    }

    public Project updateProject(ProjectDTO projectData, final long id) {
        Project foundProject = projectRepository.findById(id).orElseThrow(() -> new AppException("Project not found.", HttpStatus.NOT_FOUND));

        foundProject.setName(projectData.getName());
        foundProject.setDescription(projectData.getDescription());
        foundProject.setTechnologies(projectData.getTechnologies());
        foundProject.setFeatures(projectData.getFeatures());

        return projectRepository.save(foundProject);
    }

    public void deleteProject(final long id) {
        projectRepository.deleteById(id);
        return;
    }
}
