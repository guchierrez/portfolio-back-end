package com.guchierrez.portfolioapi.controller;

import com.guchierrez.portfolioapi.dto.ProjectDTO;
import com.guchierrez.portfolioapi.model.Project;
import com.guchierrez.portfolioapi.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjectController {
    private final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<Project> createProject(@Valid @RequestBody final ProjectDTO projectData) {
        final Project createdProject = projectService.createProject(projectData);

        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Project>> readProjects() {
        return new ResponseEntity<>(projectService.readProjects(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Project> updateProject(@RequestBody final ProjectDTO projectData, @PathVariable String id) {
        final Project updatedProject = projectService.updateProject(projectData, Long.parseLong(id));

        return new ResponseEntity<>(updatedProject, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Project> deleteProject(@PathVariable String id) {
        projectService.deleteProject(Long.parseLong(id));

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
