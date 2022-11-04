package org.example.felixlyd.ruleliteflow.service.impl;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.example.felixlyd.ruleliteflow.bean.slot.RuleContext;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleRespVo;
import org.example.felixlyd.ruleliteflow.service.RuleFlowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/4
 */
@Service
public class RuleFlowServiceImpl implements RuleFlowService {

    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public RuleRespVo executeRuleFlow(RuleReqVo ruleReqVo) {
        LiteflowResponse response = flowExecutor.execute2Resp("ruleChain", ruleReqVo, RuleContext.class);
        RuleContext ruleContext = response.getContextBean(RuleContext.class);
        return RuleRespVo.builder()
                .results(ruleContext.getResults())
                .build();
    }

    @Override
    public void reloadRule() {
        flowExecutor.reloadRule();
    }


}
