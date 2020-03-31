package com.luyuxi.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.luyuxi.spring.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjectionSet extends GetResourcesXML {

  public TestInjectionSet() {
    super("classpath*:spring-injection-set.xml");
  }

  /**
   * .设值注入测试方法
   */
  @Test
  public void testSet() {
    InjectionService service = super.getBean("injectionServiceSet");
    service.saveData("设值注入");
  }

}
