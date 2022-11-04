package org.example.felixlyd.ruleliteflow.bean.vo;

import lombok.Builder;
import lombok.experimental.Tolerate;

import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/4
 */
@Builder
public class RuleRespVo {

    @Tolerate
    public RuleRespVo(){}

    private Map<String ,String > results;

    public Map<String, String> getResults() {
        return results;
    }

    public void setResults(Map<String, String> results) {
        this.results = results;
    }
}
