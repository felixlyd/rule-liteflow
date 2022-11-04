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
public class RuleReqVo {
    @Tolerate
    public RuleReqVo(){}
    private String ruleIdList;
    private String custNo;
    private String cardNo;

    public String getRuleIdList() {
        return ruleIdList;
    }

    public void setRuleIdList(String ruleIdList) {
        this.ruleIdList = ruleIdList;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
