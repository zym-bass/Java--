package com.yiming.service;


import com.yiming.entity.Sources;
import com.yiming.utils.OAResult;

import java.util.List;

public interface SourcesService {


    List<Sources> getRootSources(Integer pid);

    List<Sources> getParentNodes(List<Sources> sources);

    OAResult addSources(Sources sources);

    OAResult deleteSources(Integer id);

    Sources getParentNodeById(Integer id);

    OAResult updateSource(Sources sources);
}
