package org.example.felixlyd.ruleliteflow.bean.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.experimental.Tolerate;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
@Builder
public class EmcsReqVo {

    @Tolerate
    public EmcsReqVo(){}

    @JSONField(name = "REQ")
    private String req;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
}
