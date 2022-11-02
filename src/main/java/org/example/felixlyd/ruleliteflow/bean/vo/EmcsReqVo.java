package org.example.felixlyd.ruleliteflow.bean.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
public class EmcsReqVo {
    @JSONField(name = "REQ")
    private String req;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
}
