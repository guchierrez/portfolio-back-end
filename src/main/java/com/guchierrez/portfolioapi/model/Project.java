package com.guchierrez.portfolioapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 230, nullable = false)
    private String description;

    @Column(length = 230, nullable = false)
    private String description_en;

    @Column
    private String image;

    @ElementCollection
    private List<String> technologies;

    @ElementCollection
    private List<String> features;

    @ElementCollection
    private List<String> features_en;

    @Column
    private String project_url;

    @Column
    private String repository_url;


    public Project(long id, String name, String description, String image, String description_en, List<String> technologies, List<String> features, List<String> features_en, String project_url, String repository_url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.description_en = description_en;
        this.technologies = technologies;
        this.features = features;
        this.features_en = features_en;
        this.project_url = project_url;
        this.repository_url = repository_url;
    }

    public Project() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getRepository_url() {
        return repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }
}
