package com.luyuxi.spring.dao;

public class InjectionDaoImpl implements InjectionDao {

  public void saveDao(String age) {
    // 模拟保存数据
    System.out.println("模拟保存数据成功 :" + age);
  }

}
