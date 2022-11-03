package org.example.felixlyd.ruleliteflow.bean.slot;

import com.yomahub.liteflow.slot.DefaultContext;

import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/1
 */
public class RuleContext extends DefaultContext {

    private String ruleIdList;
    private String custNo;
    private String cardNo;

    private Map<String ,String > results;

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


    public Map<String, String> getResults() {
        return results;
    }

    public void setResults(Map<String, String> results) {
        this.results = results;
    }
}
