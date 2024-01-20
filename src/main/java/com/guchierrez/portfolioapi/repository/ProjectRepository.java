package com.guchierrez.portfolioapi.repository;

import com.guchierrez.portfolioapi.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    boolean existsProjectByName(final String name);
}
