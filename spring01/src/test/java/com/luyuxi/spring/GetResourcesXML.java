package com.luyuxi.spring;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class GetResourcesXML {

  private ClassPathXmlApplicationContext context;

  private String springXmlpath;

  public GetResourcesXML() {

  }

  public GetResourcesXML(String springXmlpath) {
    this.springXmlpath = springXmlpath;
  }

  @Before
  public void before() {
    if (StringUtils.isEmpty(springXmlpath)) {
      springXmlpath = "classpath*:spring-*.xml";
    }
    try {
      String[] str = springXmlpath.split("[\\s]+");
      context = new ClassPathXmlApplicationContext(str);
    } catch (BeansException e) {
      e.printStackTrace();
    }
  }

  @After
  public void after() {
    context.close();
  }

  @SuppressWarnings("unchecked")
  public <T extends Object> T getBean(String beanid) {
    return (T) context.getBean(beanid);
  }

  public <T extends Object> T getBean(Class<T> clazz) {
    return context.getBean(clazz);
  }
}
