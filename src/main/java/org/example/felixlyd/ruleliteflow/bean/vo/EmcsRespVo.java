package org.example.felixlyd.ruleliteflow.bean.vo;

import lombok.Builder;
import lombok.experimental.Tolerate;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
@Builder
public class EmcsRespVo {
    @Tolerate
    public EmcsRespVo(){}
    private String respCode;
    private String respMsg;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}
