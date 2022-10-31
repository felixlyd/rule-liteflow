package org.example.felixlyd.ruleliteflow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/10/28
 */
@RestController
public class TestController {

    @Resource
    private FlowExecutor flowExecutor;

    @PostMapping("/test")
    @ResponseBody
    public String  testLiteFlow(@Nullable @RequestParam String i){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", i);
        return JSONObject.toJSONString(response);
    }
}
