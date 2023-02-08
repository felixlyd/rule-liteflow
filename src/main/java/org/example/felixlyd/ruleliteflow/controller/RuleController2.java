package org.example.felixlyd.ruleliteflow.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleRespVo;
import org.example.felixlyd.ruleliteflow.service.RuleFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
@RestController
@RequestMapping("/api-b")
public class RuleController2 {
    @Autowired
    private RuleFlowService ruleFlowService;

    @PostMapping("/rule")
    @ResponseBody
    public String ruleFlow(@RequestBody Map<String, String> reqMap){
        RuleReqVo ruleReqVo = JSONObject.parseObject(JSONObject.toJSONString(reqMap), RuleReqVo.class);
        RuleRespVo ruleRespVo = ruleFlowService.executeRuleFlow(ruleReqVo);
        return JSONObject.toJSONString(ruleRespVo);
    }

    @PostMapping("/refresh")
    @ResponseBody
    public String refreshRule(){
        ruleFlowService.reloadRule();
        return "刷新规则OK";
    }

}
