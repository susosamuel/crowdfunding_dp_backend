package com.crowdfunding.dp.backend.dao;

import com.crowdfunding.dp.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findProjectsByNameContaining(String name);
}
