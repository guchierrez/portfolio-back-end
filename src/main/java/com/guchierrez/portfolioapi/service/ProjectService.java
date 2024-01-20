package com.guchierrez.portfolioapi.service;

import com.guchierrez.portfolioapi.dto.ProjectDTO;
import com.guchierrez.portfolioapi.model.Project;

import java.util.List;

public interface ProjectService {

    Project createProject(final ProjectDTO projectData);
    List<Project> readProjects();
    Project updateProject(ProjectDTO projectData, final long id);
    void deleteProject(final long id);

}
