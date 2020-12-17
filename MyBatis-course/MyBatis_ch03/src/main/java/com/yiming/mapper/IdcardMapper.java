package com.yiming.mapper;

import com.yiming.entity.Idcard;

public interface IdcardMapper {
    //通过人的id查询身份证信息
    Idcard getIdcardByid(Integer Persson2Id);
}
