package com.deloitte.inv.application.model;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class InventoryDetailBSOutput extends Entity {

    private BigDecimal organizationId;
    private String organizationCode;


    public BigDecimal getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(BigDecimal organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }


}
