package com.luyuxi.spring.service;

import com.luyuxi.spring.dao.InjectionDao;

public class InjectionServiceConsImpl implements InjectionService {

  private InjectionDao injectionDao;

  // 构造器注入
  public InjectionServiceConsImpl(InjectionDao injectionServiceCons) {
    this.injectionDao = injectionServiceCons;
  }

  public String saveData(String age) {
    // 保存业务数据
    age = "业务处理:" + age;
    injectionDao.saveDao(age);
    return "保存业务数据成功";
  }

}
