package org.example.felixlyd.ruleliteflow.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/4
 */
@FeignClient(name = "ccbft-adaptor")
public interface Adapter {
    /**
     * 外呼adapter
     * @param m 请求报文
     * @return 对象
     */
    @PostMapping("/requestTransaction")
    Object requestTransaction(@RequestBody Map m);
}
