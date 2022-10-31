package org.example.felixlyd.ruleliteflow.component;

import com.ql.util.express.DefaultContext;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
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
        String i = this.getSlot().getRequestData();
        log.info("test:"+i);
    }
}
