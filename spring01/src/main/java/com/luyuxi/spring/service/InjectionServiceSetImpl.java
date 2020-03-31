package com.luyuxi.spring.service;

import com.luyuxi.spring.dao.InjectionDao;

public class InjectionServiceSetImpl implements InjectionService {

  private InjectionDao injectionDao;

  // 设值注入
  public void setInjectionDao(InjectionDao injectionServiceSet) {
    this.injectionDao = injectionServiceSet;
  }

  public String saveData(String age) {
    // 保存业务数据
    age = "业务处理:" + age;
    injectionDao.saveDao(age);
    return "保存业务数据成功";
  }

}
