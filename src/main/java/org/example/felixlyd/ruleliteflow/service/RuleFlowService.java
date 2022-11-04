package org.example.felixlyd.ruleliteflow.service;

import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleRespVo;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/4
 */
public interface RuleFlowService {
    /**
     * 执行规则流程
     * @param ruleReqVo 规则请求vo对象
     * @return 规则响应vo对象
     */
    RuleRespVo executeRuleFlow(RuleReqVo ruleReqVo);

    /**
     * 刷新规则
     */
    void reloadRule();
}
