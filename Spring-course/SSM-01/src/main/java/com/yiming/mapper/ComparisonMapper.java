package com.yiming.mapper;

import com.yiming.entity.Comparison;
import com.yiming.entity.ComparisonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComparisonMapper {
    long countByExample(ComparisonExample example);

    int deleteByExample(ComparisonExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Comparison record);

    int insertSelective(Comparison record);

    List<Comparison> selectByExample(ComparisonExample example);

    Comparison selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Comparison record, @Param("example") ComparisonExample example);

    int updateByExample(@Param("record") Comparison record, @Param("example") ComparisonExample example);

    int updateByPrimaryKeySelective(Comparison record);

    int updateByPrimaryKey(Comparison record);
}