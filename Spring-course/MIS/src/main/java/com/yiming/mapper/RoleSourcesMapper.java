package com.yiming.mapper;

import com.yiming.entity.RoleSources;
import com.yiming.entity.RoleSourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleSourcesMapper {
    long countByExample(RoleSourcesExample example);

    int deleteByExample(RoleSourcesExample example);

    int deleteByPrimaryKey(Integer rsid);

    int insert(RoleSources record);

    int insertSelective(RoleSources record);

    List<RoleSources> selectByExample(RoleSourcesExample example);

    RoleSources selectByPrimaryKey(Integer rsid);

    int updateByExampleSelective(@Param("record") RoleSources record, @Param("example") RoleSourcesExample example);

    int updateByExample(@Param("record") RoleSources record, @Param("example") RoleSourcesExample example);

    int updateByPrimaryKeySelective(RoleSources record);

    int updateByPrimaryKey(RoleSources record);
}