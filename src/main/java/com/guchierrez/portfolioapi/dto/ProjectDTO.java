package com.guchierrez.portfolioapi.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Map;

public class ProjectDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Size(max = 30)
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    @Size(max = 230)
    private String description;

    @NotEmpty(message = "Description cannot be empty")
    @Size(max = 230)
    private String description_en;

    @NotEmpty(message = "Image cannot be empty")
    private String image;

    @NotEmpty(message = "Technologies cannot be empty")
    private List<String> technologies;

    @NotEmpty(message = "Features cannot be empty")
    private List<String> features;

    @NotEmpty(message = "Features cannot be empty")
    private List<String> features_en;

    @NotEmpty(message = "URL cannot be empty")
    private String project_url;

    @NotEmpty(message = "Repositories cannot be empty")
    private List<String> repositories;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription_en() {
        return description_en;
    }

    public void setDescription_en(String description_en) {
        this.description_en = description_en;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getFeatures_en() {
        return features_en;
    }

    public void setFeatures_en(List<String> features_en) {
        this.features_en = features_en;
    }

    public String getProject_url() {
        return project_url;
    }

    public void setProject_url(String project_url) {
        this.project_url = project_url;
    }

    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }
}
