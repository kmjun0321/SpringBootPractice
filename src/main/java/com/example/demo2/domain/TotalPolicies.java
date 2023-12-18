package com.example.demo2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TotalPolicies")
public class TotalPolicies {

    @Id
    @GeneratedValue
    private Long seq;

    @Column(name = "DomainID")
    private Long domainID;

    @Column(name = "PolicyID")
    private String policyID;

    @Column(name = "PolicyName")
    private String policyName;

    @Column(name = "RegDate")
    private String regDate;

    @Column(name = "LastModifyDate")
    private String lastModifyDate;

    @Column(name = "Memo")
    private String memo;

    public void setSeq(Long seq) {
        this.seq = seq;
    }

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

    public Long getSeq() {
        return seq;
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
