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
@Component("checkReq")
@Slf4j
public class CheckReqCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        Map<String , String > reqMap = this.getSlot().getRequestData();
        String jsonStrReq = JSONObject.toJSONString(reqMap);
        RuleReqVo ruleReqVo = JSONObject.parseObject(jsonStrReq, RuleReqVo.class);
        log.info("校验参数完成");
    }
}
