package org.example.felixlyd.ruleliteflow.controller;

import com.alibaba.fastjson.JSONObject;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.example.felixlyd.ruleliteflow.bean.slot.RuleContext;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
@RestController
public class RuleController {
    @Resource
    private FlowExecutor flowExecutor;

    @PostMapping("/rule")
    @ResponseBody
    public String ruleFlow(@RequestBody RuleReqVo ruleReqVo){
        LiteflowResponse response = flowExecutor.execute2Resp("ruleChain", ruleReqVo, RuleContext.class);
        return JSONObject.toJSONString(response);
    }
}