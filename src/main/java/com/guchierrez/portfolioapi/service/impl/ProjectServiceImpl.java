package com.guchierrez.portfolioapi.service.impl;

import com.guchierrez.portfolioapi.dto.ProjectDTO;
import com.guchierrez.portfolioapi.exception.AppException;
import com.guchierrez.portfolioapi.model.Project;
import com.guchierrez.portfolioapi.repository.ProjectRepository;
import com.guchierrez.portfolioapi.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(final ProjectDTO projectData) {
        Project createdProject = new Project();

        createdProject.setName(projectData.getName());
        createdProject.setDescription(projectData.getDescription());
        createdProject.setDescription_en(projectData.getDescription_en());
        createdProject.setImage(projectData.getImage());
        createdProject.setTechnologies(projectData.getTechnologies());
        createdProject.setFeatures(projectData.getFeatures());
        createdProject.setFeatures_en(projectData.getFeatures_en());
        createdProject.setProject_url(projectData.getProject_url());
        createdProject.setRepository_url(projectData.getRepository_url());

        return projectRepository.save(createdProject);
    }

    public List<Project> readProjects() {
        return projectRepository.findAll();
    }

    public Project updateProject(ProjectDTO projectData, final long id) {
        Project foundProject = projectRepository.findById(id).orElseThrow(() -> new AppException("Project not found.", HttpStatus.NOT_FOUND));

        foundProject.setName((projectData.getName() == null) ? foundProject.getName() : projectData.getName());
        foundProject.setDescription((projectData.getDescription() == null) ? foundProject.getDescription() : projectData.getDescription());
        foundProject.setDescription_en((projectData.getDescription_en() == null) ? foundProject.getDescription_en() : projectData.getDescription_en());
        foundProject.setImage((projectData.getImage() == null) ? foundProject.getImage() : projectData.getImage());
        foundProject.setTechnologies((projectData.getTechnologies() == null) ? foundProject.getTechnologies() : projectData.getTechnologies());
        foundProject.setFeatures((projectData.getFeatures() == null) ? foundProject.getFeatures() : projectData.getFeatures());
        foundProject.setFeatures_en((projectData.getFeatures_en() == null) ? foundProject.getFeatures_en() : projectData.getFeatures_en());
        foundProject.setProject_url((projectData.getProject_url() == null) ? foundProject.getProject_url() : projectData.getProject_url());
        foundProject.setRepository_url((projectData.getRepository_url() == null) ? foundProject.getRepository_url() : projectData.getRepository_url());

        return projectRepository.save(foundProject);
    }

    public void deleteProject(final long id) {
        projectRepository.deleteById(id);
        return;
    }
}
