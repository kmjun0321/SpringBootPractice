package com.example.demo2.domain;

import lombok.Data;

@Data
public class TotalPolicies {
    private Long domainID;
    private String policyID;
    private String policyName;
    private String regDate;
    private String lastModifyDate;
    private String memo;

    public void setDomainID(Long domainID) {
        this.domainID = domainID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getDomainID() {
        return domainID;
    }

    public String getPolicyID() {
        return policyID;
    }

    public String getPolicyName() {
        return policyName;
    }

    public String getRegDate() {
        return regDate;
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public String getMemo() {
        return memo;
    }
}
