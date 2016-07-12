package com.deloitte.inv.application.model;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class QualityPlandetailsOutput extends Entity {

    private String planName;
    private BigDecimal planId;


    public String getPlanName() {
        return this.planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public BigDecimal getPlanId() {
        return this.planId;
    }

    public void setPlanId(BigDecimal planId) {
        this.planId = planId;
    }


}
