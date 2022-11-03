package org.example.felixlyd.ruleliteflow.component;

import com.alibaba.fastjson.JSONObject;
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
@Component("reqToRuleContext")
@Slf4j
public class ReqToRuleContextCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        Map<String , String > reqMap = this.getSlot().getRequestData();
        String jsonStrReq = JSONObject.toJSONString(reqMap);
        RuleReqVo ruleReqVo = JSONObject.parseObject(jsonStrReq, RuleReqVo.class);
        RuleContext context = this.getContextBean(RuleContext.class);

        BeanUtils.copyProperties(ruleReqVo, context);

        for(String key: reqMap.keySet()){
            context.setData(key, reqMap.get(key));
        }

        Map<String , String> results = new HashMap<>();
        context.setResults(results);

    }

    @Override
    public boolean isAccess() {
        Map<String , String > reqMap = this.getSlot().getRequestData();
        return reqMap != null;
    }
}
