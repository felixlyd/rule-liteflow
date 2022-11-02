package org.example.felixlyd.ruleliteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.slot.DefaultContext;
import lombok.extern.slf4j.Slf4j;
import org.example.felixlyd.ruleliteflow.bean.slot.RuleContext;
import org.springframework.stereotype.Component;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/10/28
 */
@Component("test")
@Slf4j
public class TestCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        RuleContext context = this.getContextBean(RuleContext.class);
        String i = context.getData("card_no");
        log.info("test:"+i);
    }
}
