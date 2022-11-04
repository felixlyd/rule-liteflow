package org.example.felixlyd.ruleliteflow.component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.example.felixlyd.ruleliteflow.bean.slot.RuleContext;
import org.example.felixlyd.ruleliteflow.bean.vo.RuleReqVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/2
 */
@Component("ruleReqToRuleContext")
@Slf4j
public class RuleReqToRuleContextCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        RuleReqVo ruleReqVo = this.getSlot().getRequestData();
        RuleContext context = this.getContextBean(RuleContext.class);
        BeanUtils.copyProperties(ruleReqVo, context);
        Map<String , String> reqMap = JSONObject.parseObject(JSONObject.toJSONString(ruleReqVo),
                new TypeReference<Map<String, String>>() {});
        for(String key: reqMap.keySet()){
            context.setData(key, reqMap.get(key));
        }

        Map<String , String> results = new HashMap<>();
        context.setResults(results);
        log.info("请求参数转入上下文完成");
    }

    @Override
    public boolean isAccess() {
        RuleReqVo ruleReqVo = this.getSlot().getRequestData();
        return ruleReqVo != null;
    }
}
