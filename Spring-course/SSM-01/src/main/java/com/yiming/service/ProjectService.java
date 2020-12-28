package com.yiming.service;

import com.yiming.entity.Employee;
import com.yiming.entity.Project;

import java.util.List;

public interface ProjectService {
    Project getProject(Integer id);

    List<Project> getProjects();
}
