package com.guchierrez.portfolioapi.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public class ProjectDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Size(max = 30)
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    @Size(max = 230)
    private String description;

    @NotEmpty(message = "Technologies cannot be empty")
    private List<String> technologies;

    @NotEmpty(message = "Features cannot be empty")
    private List<String> features;

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
}
