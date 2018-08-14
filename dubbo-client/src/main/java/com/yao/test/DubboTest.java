package com.yao.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @program: dubbo
 * @description:
 * @author: yaoyao_cmrpd
 * @create: 2018-08-14 21:44
 **/
public class DubboTest {
    public static void main(String[] args){
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo");
        System.out.println("xxxx"+JSON.toJSONString(application));
        RegistryConfig registry = new RegistryConfig();
        //registry.setClient("zookeeper");
        registry.setAddress("zookeeper://localhost:2181");
        registry.setPort(12345);
        System.out.println("xxxx"+JSON.toJSONString(registry));
        application.setRegistry(registry);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        // 弱类型接口名
        reference.setInterface("com.yao.service.DemoService");
        // 声明为泛化接口
        reference.setGeneric(true);

        reference.setApplication(application);
        System.out.println("xxxx"+JSON.toJSONString(reference));
        // 用com.alibaba.dubbo.rpc.service.GenericService可以替代所有接口引用
        GenericService genericService = reference.get();

        String name = (String) genericService.$invoke("sayHello", new String[]{int.class.getName()}, new Object[]{1});
        System.out.println(name);
    }
}
