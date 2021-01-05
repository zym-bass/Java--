package com.yiming.service;


import com.yiming.entity.Sources;

import java.util.List;

public interface SourcesService {


    public List<Sources> getRootSources(Integer pid);

    List<Sources> getParentNodes(List<Sources> sources);
}
