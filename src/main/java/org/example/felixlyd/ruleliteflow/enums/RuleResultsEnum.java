package org.example.felixlyd.ruleliteflow.enums;

import com.yomahub.liteflow.script.ScriptBean;
import org.springframework.stereotype.Component;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/2
 */
public enum RuleResultsEnum {
    /**
     * 规则处理结果
     */
    OK("OK","成功"),
    FAIL("FAIL","失败");
    private final String code;
    private final String msg;

    RuleResultsEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
