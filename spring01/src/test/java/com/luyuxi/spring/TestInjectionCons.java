package com.luyuxi.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.luyuxi.spring.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjectionCons extends GetResourcesXML {

  public TestInjectionCons() {
    super("classpath*:spring-injection-cons.xml");
  }

  /**
   * .构造器注入测试方法
   */
  @Test
  public void testCons() {
    InjectionService service = super.getBean("injectionServiceCons");
    service.saveData("构造器注入");
  }

}
