package com.yao.client.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yao.client.dto.RequestDto;
import com.yao.client.factory.DubboServiceFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: dubbo
 * @description:
 * @author: yaoyao_cmrpd
 * @create: 2018-08-14 23:03
 **/
@RestController
public class DubboClientController {
    @RequestMapping(value = "/router", method = RequestMethod.POST)
    public Object getUser(@RequestBody RequestDto dto) {
        Map map = new HashMap<>();
        map.put("ParamType", "java.lang.String");  //后端接口参数类型
        System.out.println(JSON.toJSONString(dto));
        map.put("Object", dto.getMethodParams()[0].get("id"));  //用以调用后端接口的实参

        List<Map<String, Object>> paramInfos= new ArrayList<>();
        paramInfos.add(map);

        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }
    @RequestMapping(value = "/routerString", method = RequestMethod.POST)
    public Object getDubbo(@RequestBody String req) {
        System.out.println(req);
        RequestDto dto = JSONObject.parseObject(req,RequestDto.class);
        Map map = new HashMap<>();
        map.put("ParamType", "java.lang.String");  //后端接口参数类型
        System.out.println(JSON.toJSONString(dto));
        map.put("Object", dto.getMethodParams()[0].get("id"));  //用以调用后端接口的实参

        List<Map<String, Object>> paramInfos= new ArrayList<>();
        paramInfos.add(map);

        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }
}
