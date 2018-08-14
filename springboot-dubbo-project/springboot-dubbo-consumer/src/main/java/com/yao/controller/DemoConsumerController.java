/**
 * Copyright (C), 2015-2018, 北京思特奇股份有限公司
 * FileName: DemoConsumerController
 * Author:   yaoyao_crmpd
 * Date:     2018/8/14 12:49
 * Description: 消费者服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yao.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}