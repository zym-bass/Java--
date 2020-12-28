package com.yiming.service.impl;

import com.yiming.entity.Project;
import com.yiming.entity.ProjectExample;
import com.yiming.mapper.ProjectMapper;
import com.yiming.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectMapper projectMapper;

    @Override
    public Project getProject(Integer id) {
        return projectMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Project> getProjects() {
        return projectMapper.selectByExample(new ProjectExample());
    }
}
