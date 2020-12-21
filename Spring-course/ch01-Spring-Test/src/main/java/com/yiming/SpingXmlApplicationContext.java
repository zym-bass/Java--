package com.yiming;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpingXmlApplicationContext {
    private Map<String , Object> map = new HashMap<>();

    public SpingXmlApplicationContext(String file) {
        try {
            //1. 创建一个SAReader对象
            SAXReader saxReader = new SAXReader();
            //2. 获取配置文件的输入流对象
            InputStream inputStream = SpingXmlApplicationContext.class.getClassLoader().getResourceAsStream(file);
            //3. 读取流对象并返回一个Document
            Document document = saxReader.read(inputStream);
            //4. 获取根元素
            Element element = document.getRootElement();
            //5.获取根元素下所有的子元素
            List<Element> elements = element.elements();
            //6. 循环所有的bean
            for (Element element1 : elements){
                String key=element.attributeValue("id");
                String className=element.attributeValue("class");
                Class clazz=Class.forName(className);
                Object value=clazz.newInstance();
                map.put(key,value);
                //找到每个bean标签下的所有property子元素
                List<Element> propertyList= element.elements("property");
                if(propertyList!=null && propertyList.size()>0){
                    // 循环propertyList
                    for (Element propertyElement : propertyList) {
                        //找到property标签中的name属性的值
                        String name= propertyElement.attributeValue("name");
                        //找到property标签中的ref属性的值
                        String ref=propertyElement.attributeValue("ref");
                        byte[] names=name.getBytes();
                        names[0]=(byte)(names[0]-32);
                        String methodName="set"+new String(names);
                        Method method= clazz.getDeclaredMethod(methodName,clazz.getDeclaredField(name).getType());
                        method.invoke(value,map.get(ref));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String key){
        return map.get(key);

    }
}
