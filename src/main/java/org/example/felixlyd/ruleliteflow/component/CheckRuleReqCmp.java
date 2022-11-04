package org.example.felixlyd.ruleliteflow.component;

import com.alibaba.fastjson.JSONObject;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/2
 */
@Component("checkRuleReq")
@Slf4j
public class CheckRuleReqCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        RuleReqVo ruleReqVo  = this.getSlot().getRequestData();
        log.info("校验参数完成");
    }
}
