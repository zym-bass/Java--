package com.yiming.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Test01 {
    @Test
    public void doSome(){
        //对Province
        Province p = new Province(1,"河北","翼","石家庄");

        //使用jackson把p转换成json
        ObjectMapper om =  new ObjectMapper();
        try {
            String json = om.writeValueAsString(p);
            System.out.println(json);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
