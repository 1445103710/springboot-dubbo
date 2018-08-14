/**
 * Copyright (C), 2015-2018, 北京思特奇股份有限公司
 * FileName: DefaultDemoService
 * Author:   yaoyao_crmpd
 * Date:     2018/8/14 12:44
 * Description: 实现api
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yao.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService{

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}