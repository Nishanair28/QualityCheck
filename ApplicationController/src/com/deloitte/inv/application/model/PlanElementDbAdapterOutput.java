package com.deloitte.inv.application.model;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class PlanElementDbAdapterOutput extends Entity {

    private String name;
    private BigDecimal organizationId;
    private String itemNumberPrompt;
    private String trxNumberPrompt;
    private String txnHeaderIDPrompt;
    private String organizationIDPrompt;
    private String specIDPrompt;
    private String transactionIDPrompt;
    private String departmentIDPrompt;
    private String toDepartmentIDPrompt;
    private String resourceIDPrompt;
    private String quantityPrompt;
    private String uomPrompt;
    private String revisionPrompt;
    private String subinventoryPrompt;
    private String locatoridPrompt;
    private String lotNumberPrompt;
    private String serialNumberPrompt;
    private String compItemIdPrompt;
    private String compUOMPrompt;
    private String compRevisionPrompt;
    private String compSubinventoryPrompt;
    private String compLocatorIdPrompt;
    private String compLotNumberPrompt;
    private String compSerialNumberPrompt;
    private String wipEntityIdPrompt;
    private String lineIdPrompt;
    private String fromOpSeqNumPrompt;
    private String toOpSeqNumPrompt;
    private String vendorIDPrompt;
    private String receiptNumPrompt;
    private String poNumberPrompt;
    private String poLineNumberPrompt;
    private String poReleaseIDPrompt;
    private String poShipmentNumPrompt;
    private String customerIDPrompt;
    private String soHeaderIDPrompt;
    private String rmaHeaderIDPrompt;
    private String transactionDatePrompt;
    private String statusPrompt;
    private String projectIDPrompt;
    private String taskIDPrompt;
    private String xfrLpnIDPrompt;
    private String contractIDPrompt;
    private String contractLineIDPrompt;
    private String deliverableIDPrompt;
    private String assetGroupIDPrompt;
    private String assetNumberPrompt;
    private String assetActivityIDPrompt;
    private String followupActivityIDPrompt;
    private String workOrderIDPrompt;
    private String character1Prompt;
    private String character2Prompt;
    private String character3Prompt;
    private String character4Prompt;
    private String character5Prompt;
    private String character6Prompt;
    private String character7Prompt;
    private String character8Prompt;
    private String character9Prompt;
    private String character10Prompt;
    private String character11Prompt;
    private String character12Prompt;
    private String character13Prompt;
    private String character14Prompt;
    private String character15Prompt;
    private String character16Prompt;
    private String character17Prompt;
    private String character18Prompt;
    private String character19Prompt;
    private String character20Prompt;
    private String character21Prompt;
    private String character22Prompt;
    private String character23Prompt;
    private String character24Prompt;
    private String character25Prompt;
    private String character26Prompt;
    private String character27Prompt;
    private String character28Prompt;
    private String character29Prompt;
    private String character30Prompt;
    private String itemNumberMfFlag;
    private String trxNumberMfFlag;
    private String txnHeaderIDMfFlag;
    private String organizationIDMfFlag;
    private String specIDMfFlag;
    private String transactionIDMfFlag;
    private String departmentIDMfFlag;
    private String toDepartmentIDMfFlag;
    private String resourceIDMfFlag;
    private String quantityMfFlag;
    private String uomMfFlag;
    private String revisionMfFlag;
    private String subinventoryMfFlag;
    private String locatoridMfFlag;
    private String lotNumberMfFlag;
    private String serialNumberMfFlag;
    private String compItemIdMfFlag;
    private String compUOMMfFlag;
    private String compRevisionMfFlag;
    private String compSubinventoryMfFlag;
    private String compLocatorIdMfFlag;
    private String compLotNumberMfFlag;
    private String compSerialNumberMfFlag;
    private String wipEntityIdMfFlag;
    private String lineIdMfFlag;
    private String fromOpSeqNumMfFlag;
    private String toOpSeqNumMfFlag;
    private String vendorIDMfFlag;
    private String receiptNumMfFlag;
    private String poNumberMfFlag;
    private String poLineNumberMfFlag;
    private String poReleaseIDMfFlag;
    private String poShipmentNumMfFlag;
    private String customerIDMfFlag;
    private String soHeaderIDMfFlag;
    private String rmaHeaderIDMfFlag;
    private String transactionDateMfFlag;
    private String statusMfFlag;
    private String projectIDMfFlag;
    private String taskIDMfFlag;
    private String xfrLpnIDMfFlag;
    private String contractIDMfFlag;
    private String contractLineIDMfFlag;
    private String deliverableIDMfFlag;
    private String assetGroupIDMfFlag;
    private String assetNumberMfFlag;
    private String assetActivityIDMfFlag;
    private String followupActivityIDMfFlag;
    private String workOrderIDMfFlag;
    private String character1MfFlag;
    private String character2MfFlag;
    private String character3MfFlag;
    private String character4MfFlag;
    private String character5MfFlag;
    private String character6MfFlag;
    private String character7MfFlag;
    private String character8MfFlag;
    private String character9MfFlag;
    private String character10MfFlag;
    private String character11MfFlag;
    private String character12MfFlag;
    private String character13MfFlag;
    private String character14MfFlag;
    private String character15MfFlag;
    private String character16MfFlag;
    private String character17MfFlag;
    private String character18MfFlag;
    private String character19MfFlag;
    private String character20MfFlag;
    private String character21MfFlag;
    private String character22MfFlag;
    private String character23MfFlag;
    private String character24MfFlag;
    private String character25MfFlag;
    private String character26MfFlag;
    private String character27MfFlag;
    private String character28MfFlag;
    private String character29MfFlag;
    private String character30MfFlag;
    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(BigDecimal organizationId) {
        this.organizationId = organizationId;
    }

    public String getItemNumberPrompt() {
        return this.itemNumberPrompt;
    }

    public void setItemNumberPrompt(String itemNumberPrompt) {
        this.itemNumberPrompt = itemNumberPrompt;
    }

    public String getTrxNumberPrompt() {
        return this.trxNumberPrompt;
    }

    public void setTrxNumberPrompt(String trxNumberPrompt) {
        this.trxNumberPrompt = trxNumberPrompt;
    }

    public String getTxnHeaderIDPrompt() {
        return this.txnHeaderIDPrompt;
    }

    public void setTxnHeaderIDPrompt(String txnHeaderIDPrompt) {
        this.txnHeaderIDPrompt = txnHeaderIDPrompt;
    }

    public String getOrganizationIDPrompt() {
        return this.organizationIDPrompt;
    }

    public void setOrganizationIDPrompt(String organizationIDPrompt) {
        this.organizationIDPrompt = organizationIDPrompt;
    }

    public String getSpecIDPrompt() {
        return this.specIDPrompt;
    }

    public void setSpecIDPrompt(String specIDPrompt) {
        this.specIDPrompt = specIDPrompt;
    }

    public String getTransactionIDPrompt() {
        return this.transactionIDPrompt;
    }

    public void setTransactionIDPrompt(String transactionIDPrompt) {
        this.transactionIDPrompt = transactionIDPrompt;
    }

    public String getDepartmentIDPrompt() {
        return this.departmentIDPrompt;
    }

    public void setDepartmentIDPrompt(String departmentIDPrompt) {
        this.departmentIDPrompt = departmentIDPrompt;
    }

    public String getToDepartmentIDPrompt() {
        return this.toDepartmentIDPrompt;
    }

    public void setToDepartmentIDPrompt(String toDepartmentIDPrompt) {
        this.toDepartmentIDPrompt = toDepartmentIDPrompt;
    }

    public String getResourceIDPrompt() {
        return this.resourceIDPrompt;
    }

    public void setResourceIDPrompt(String resourceIDPrompt) {
        this.resourceIDPrompt = resourceIDPrompt;
    }

    public String getQuantityPrompt() {
        return this.quantityPrompt;
    }

    public void setQuantityPrompt(String quantityPrompt) {
        this.quantityPrompt = quantityPrompt;
    }

    public String getUomPrompt() {
        return this.uomPrompt;
    }

    public void setUomPrompt(String uomPrompt) {
        this.uomPrompt = uomPrompt;
    }

    public String getRevisionPrompt() {
        return this.revisionPrompt;
    }

    public void setRevisionPrompt(String revisionPrompt) {
        this.revisionPrompt = revisionPrompt;
    }

    public String getSubinventoryPrompt() {
        return this.subinventoryPrompt;
    }

    public void setSubinventoryPrompt(String subinventoryPrompt) {
        this.subinventoryPrompt = subinventoryPrompt;
    }

    public String getLocatoridPrompt() {
        return this.locatoridPrompt;
    }

    public void setLocatoridPrompt(String locatoridPrompt) {
        this.locatoridPrompt = locatoridPrompt;
    }

    public String getLotNumberPrompt() {
        return this.lotNumberPrompt;
    }

    public void setLotNumberPrompt(String lotNumberPrompt) {
        this.lotNumberPrompt = lotNumberPrompt;
    }

    public String getSerialNumberPrompt() {
        return this.serialNumberPrompt;
    }

    public void setSerialNumberPrompt(String serialNumberPrompt) {
        this.serialNumberPrompt = serialNumberPrompt;
    }

    public String getCompItemIdPrompt() {
        return this.compItemIdPrompt;
    }

    public void setCompItemIdPrompt(String compItemIdPrompt) {
        this.compItemIdPrompt = compItemIdPrompt;
    }

    public String getCompUOMPrompt() {
        return this.compUOMPrompt;
    }

    public void setCompUOMPrompt(String compUOMPrompt) {
        this.compUOMPrompt = compUOMPrompt;
    }

    public String getCompRevisionPrompt() {
        return this.compRevisionPrompt;
    }

    public void setCompRevisionPrompt(String compRevisionPrompt) {
        this.compRevisionPrompt = compRevisionPrompt;
    }

    public String getCompSubinventoryPrompt() {
        return this.compSubinventoryPrompt;
    }

    public void setCompSubinventoryPrompt(String compSubinventoryPrompt) {
        this.compSubinventoryPrompt = compSubinventoryPrompt;
    }

    public String getCompLocatorIdPrompt() {
        return this.compLocatorIdPrompt;
    }

    public void setCompLocatorIdPrompt(String compLocatorIdPrompt) {
        this.compLocatorIdPrompt = compLocatorIdPrompt;
    }

    public String getCompLotNumberPrompt() {
        return this.compLotNumberPrompt;
    }

    public void setCompLotNumberPrompt(String compLotNumberPrompt) {
        this.compLotNumberPrompt = compLotNumberPrompt;
    }

    public String getCompSerialNumberPrompt() {
        return this.compSerialNumberPrompt;
    }

    public void setCompSerialNumberPrompt(String compSerialNumberPrompt) {
        this.compSerialNumberPrompt = compSerialNumberPrompt;
    }

    public String getWipEntityIdPrompt() {
        return this.wipEntityIdPrompt;
    }

    public void setWipEntityIdPrompt(String wipEntityIdPrompt) {
        this.wipEntityIdPrompt = wipEntityIdPrompt;
    }

    public String getLineIdPrompt() {
        return this.lineIdPrompt;
    }

    public void setLineIdPrompt(String lineIdPrompt) {
        this.lineIdPrompt = lineIdPrompt;
    }

    public String getFromOpSeqNumPrompt() {
        return this.fromOpSeqNumPrompt;
    }

    public void setFromOpSeqNumPrompt(String fromOpSeqNumPrompt) {
        this.fromOpSeqNumPrompt = fromOpSeqNumPrompt;
    }

    public String getToOpSeqNumPrompt() {
        return this.toOpSeqNumPrompt;
    }

    public void setToOpSeqNumPrompt(String toOpSeqNumPrompt) {
        this.toOpSeqNumPrompt = toOpSeqNumPrompt;
    }

    public String getVendorIDPrompt() {
        return this.vendorIDPrompt;
    }

    public void setVendorIDPrompt(String vendorIDPrompt) {
        this.vendorIDPrompt = vendorIDPrompt;
    }

    public String getReceiptNumPrompt() {
        return this.receiptNumPrompt;
    }

    public void setReceiptNumPrompt(String receiptNumPrompt) {
        this.receiptNumPrompt = receiptNumPrompt;
    }

    public String getPoNumberPrompt() {
        return this.poNumberPrompt;
    }

    public void setPoNumberPrompt(String poNumberPrompt) {
        this.poNumberPrompt = poNumberPrompt;
    }

    public String getPoLineNumberPrompt() {
        return this.poLineNumberPrompt;
    }

    public void setPoLineNumberPrompt(String poLineNumberPrompt) {
        this.poLineNumberPrompt = poLineNumberPrompt;
    }

    public String getPoReleaseIDPrompt() {
        return this.poReleaseIDPrompt;
    }

    public void setPoReleaseIDPrompt(String poReleaseIDPrompt) {
        this.poReleaseIDPrompt = poReleaseIDPrompt;
    }

    public String getPoShipmentNumPrompt() {
        return this.poShipmentNumPrompt;
    }

    public void setPoShipmentNumPrompt(String poShipmentNumPrompt) {
        this.poShipmentNumPrompt = poShipmentNumPrompt;
    }

    public String getCustomerIDPrompt() {
        return this.customerIDPrompt;
    }

    public void setCustomerIDPrompt(String customerIDPrompt) {
        this.customerIDPrompt = customerIDPrompt;
    }

    public String getSoHeaderIDPrompt() {
        return this.soHeaderIDPrompt;
    }

    public void setSoHeaderIDPrompt(String soHeaderIDPrompt) {
        this.soHeaderIDPrompt = soHeaderIDPrompt;
    }

    public String getRmaHeaderIDPrompt() {
        return this.rmaHeaderIDPrompt;
    }

    public void setRmaHeaderIDPrompt(String rmaHeaderIDPrompt) {
        this.rmaHeaderIDPrompt = rmaHeaderIDPrompt;
    }

    public String getTransactionDatePrompt() {
        return this.transactionDatePrompt;
    }

    public void setTransactionDatePrompt(String transactionDatePrompt) {
        this.transactionDatePrompt = transactionDatePrompt;
    }

    public String getStatusPrompt() {
        return this.statusPrompt;
    }

    public void setStatusPrompt(String statusPrompt) {
        this.statusPrompt = statusPrompt;
    }

    public String getProjectIDPrompt() {
        return this.projectIDPrompt;
    }

    public void setProjectIDPrompt(String projectIDPrompt) {
        this.projectIDPrompt = projectIDPrompt;
    }

    public String getTaskIDPrompt() {
        return this.taskIDPrompt;
    }

    public void setTaskIDPrompt(String taskIDPrompt) {
        this.taskIDPrompt = taskIDPrompt;
    }

    public String getXfrLpnIDPrompt() {
        return this.xfrLpnIDPrompt;
    }

    public void setXfrLpnIDPrompt(String xfrLpnIDPrompt) {
        this.xfrLpnIDPrompt = xfrLpnIDPrompt;
    }

    public String getContractIDPrompt() {
        return this.contractIDPrompt;
    }

    public void setContractIDPrompt(String contractIDPrompt) {
        this.contractIDPrompt = contractIDPrompt;
    }

    public String getContractLineIDPrompt() {
        return this.contractLineIDPrompt;
    }

    public void setContractLineIDPrompt(String contractLineIDPrompt) {
        this.contractLineIDPrompt = contractLineIDPrompt;
    }

    public String getDeliverableIDPrompt() {
        return this.deliverableIDPrompt;
    }

    public void setDeliverableIDPrompt(String deliverableIDPrompt) {
        this.deliverableIDPrompt = deliverableIDPrompt;
    }

    public String getAssetGroupIDPrompt() {
        return this.assetGroupIDPrompt;
    }

    public void setAssetGroupIDPrompt(String assetGroupIDPrompt) {
        this.assetGroupIDPrompt = assetGroupIDPrompt;
    }

    public String getAssetActivityIDPrompt() {
        return this.assetActivityIDPrompt;
    }

    public void setAssetActivityIDPrompt(String assetActivityIDPrompt) {
        this.assetActivityIDPrompt = assetActivityIDPrompt;
    }

    public String getFollowupActivityIDPrompt() {
        return this.followupActivityIDPrompt;
    }

    public void setFollowupActivityIDPrompt(String followupActivityIDPrompt) {
        this.followupActivityIDPrompt = followupActivityIDPrompt;
    }

    public String getWorkOrderIDPrompt() {
        return this.workOrderIDPrompt;
    }

    public void setWorkOrderIDPrompt(String workOrderIDPrompt) {
        this.workOrderIDPrompt = workOrderIDPrompt;
    }

    public String getCharacter1Prompt() {
        return this.character1Prompt;
    }

    public void setCharacter1Prompt(String character1Prompt) {
        this.character1Prompt = character1Prompt;
    }

    public String getCharacter2Prompt() {
        return this.character2Prompt;
    }

    public void setCharacter2Prompt(String character2Prompt) {
        this.character2Prompt = character2Prompt;
    }

    public String getCharacter3Prompt() {
        return this.character3Prompt;
    }

    public void setCharacter3Prompt(String character3Prompt) {
        this.character3Prompt = character3Prompt;
    }

    public String getCharacter4Prompt() {
        return this.character4Prompt;
    }

    public void setCharacter4Prompt(String character4Prompt) {
        this.character4Prompt = character4Prompt;
    }

    public String getCharacter5Prompt() {
        return this.character5Prompt;
    }

    public void setCharacter5Prompt(String character5Prompt) {
        this.character5Prompt = character5Prompt;
    }

    public String getCharacter6Prompt() {
        return this.character6Prompt;
    }

    public void setCharacter6Prompt(String character6Prompt) {
        this.character6Prompt = character6Prompt;
    }

    public String getCharacter7Prompt() {
        return this.character7Prompt;
    }

    public void setCharacter7Prompt(String character7Prompt) {
        this.character7Prompt = character7Prompt;
    }

    public String getCharacter8Prompt() {
        return this.character8Prompt;
    }

    public void setCharacter8Prompt(String character8Prompt) {
        this.character8Prompt = character8Prompt;
    }

    public String getCharacter9Prompt() {
        return this.character9Prompt;
    }

    public void setCharacter9Prompt(String character9Prompt) {
        this.character9Prompt = character9Prompt;
    }

    public String getCharacter10Prompt() {
        return this.character10Prompt;
    }

    public void setCharacter10Prompt(String character10Prompt) {
        this.character10Prompt = character10Prompt;
    }

    public String getCharacter11Prompt() {
        return this.character11Prompt;
    }

    public void setCharacter11Prompt(String character11Prompt) {
        this.character11Prompt = character11Prompt;
    }

    public String getCharacter12Prompt() {
        return this.character12Prompt;
    }

    public void setCharacter12Prompt(String character12Prompt) {
        this.character12Prompt = character12Prompt;
    }

    public String getCharacter13Prompt() {
        return this.character13Prompt;
    }

    public void setCharacter13Prompt(String character13Prompt) {
        this.character13Prompt = character13Prompt;
    }

    public String getCharacter14Prompt() {
        return this.character14Prompt;
    }

    public void setCharacter14Prompt(String character14Prompt) {
        this.character14Prompt = character14Prompt;
    }

    public String getCharacter15Prompt() {
        return this.character15Prompt;
    }

    public void setCharacter15Prompt(String character15Prompt) {
        this.character15Prompt = character15Prompt;
    }

    public String getCharacter16Prompt() {
        return this.character16Prompt;
    }

    public void setCharacter16Prompt(String character16Prompt) {
        this.character16Prompt = character16Prompt;
    }

    public String getCharacter17Prompt() {
        return this.character17Prompt;
    }

    public void setCharacter17Prompt(String character17Prompt) {
        this.character17Prompt = character17Prompt;
    }

    public String getCharacter18Prompt() {
        return this.character18Prompt;
    }

    public void setCharacter18Prompt(String character18Prompt) {
        this.character18Prompt = character18Prompt;
    }

    public String getCharacter19Prompt() {
        return this.character19Prompt;
    }

    public void setCharacter19Prompt(String character19Prompt) {
        this.character19Prompt = character19Prompt;
    }

    public String getCharacter20Prompt() {
        return this.character20Prompt;
    }

    public void setCharacter20Prompt(String character20Prompt) {
        this.character20Prompt = character20Prompt;
    }

    public String getCharacter21Prompt() {
        return this.character21Prompt;
    }

    public void setCharacter21Prompt(String character21Prompt) {
        this.character21Prompt = character21Prompt;
    }

    public String getCharacter22Prompt() {
        return this.character22Prompt;
    }

    public void setCharacter22Prompt(String character22Prompt) {
        this.character22Prompt = character22Prompt;
    }

    public String getCharacter23Prompt() {
        return this.character23Prompt;
    }

    public void setCharacter23Prompt(String character23Prompt) {
        this.character23Prompt = character23Prompt;
    }

    public String getCharacter24Prompt() {
        return this.character24Prompt;
    }

    public void setCharacter24Prompt(String character24Prompt) {
        this.character24Prompt = character24Prompt;
    }

    public String getCharacter25Prompt() {
        return this.character25Prompt;
    }

    public void setCharacter25Prompt(String character25Prompt) {
        this.character25Prompt = character25Prompt;
    }

    public String getCharacter26Prompt() {
        return this.character26Prompt;
    }

    public void setCharacter26Prompt(String character26Prompt) {
        this.character26Prompt = character26Prompt;
    }

    public String getCharacter27Prompt() {
        return this.character27Prompt;
    }

    public void setCharacter27Prompt(String character27Prompt) {
        this.character27Prompt = character27Prompt;
    }

    public String getCharacter28Prompt() {
        return this.character28Prompt;
    }

    public void setCharacter28Prompt(String character28Prompt) {
        this.character28Prompt = character28Prompt;
    }

    public String getCharacter29Prompt() {
        return this.character29Prompt;
    }

    public void setCharacter29Prompt(String character29Prompt) {
        this.character29Prompt = character29Prompt;
    }

    public String getCharacter30Prompt() {
        return this.character30Prompt;
    }

    public void setCharacter30Prompt(String character30Prompt) {
        this.character30Prompt = character30Prompt;
    }

    public String getItemNumberMfFlag() {
        return this.itemNumberMfFlag;
    }

    public void setItemNumberMfFlag(String itemNumberMfFlag) {
        this.itemNumberMfFlag = itemNumberMfFlag;
    }

    public String getTrxNumberMfFlag() {
        return this.trxNumberMfFlag;
    }

    public void setTrxNumberMfFlag(String trxNumberMfFlag) {
        this.trxNumberMfFlag = trxNumberMfFlag;
    }

    public String getTxnHeaderIDMfFlag() {
        return this.txnHeaderIDMfFlag;
    }

    public void setTxnHeaderIDMfFlag(String txnHeaderIDMfFlag) {
        this.txnHeaderIDMfFlag = txnHeaderIDMfFlag;
    }

    public String getOrganizationIDMfFlag() {
        return this.organizationIDMfFlag;
    }

    public void setOrganizationIDMfFlag(String organizationIDMfFlag) {
        this.organizationIDMfFlag = organizationIDMfFlag;
    }

    public String getSpecIDMfFlag() {
        return this.specIDMfFlag;
    }

    public void setSpecIDMfFlag(String specIDMfFlag) {
        this.specIDMfFlag = specIDMfFlag;
    }

    public String getTransactionIDMfFlag() {
        return this.transactionIDMfFlag;
    }

    public void setTransactionIDMfFlag(String transactionIDMfFlag) {
        this.transactionIDMfFlag = transactionIDMfFlag;
    }

    public String getDepartmentIDMfFlag() {
        return this.departmentIDMfFlag;
    }

    public void setDepartmentIDMfFlag(String departmentIDMfFlag) {
        this.departmentIDMfFlag = departmentIDMfFlag;
    }

    public String getToDepartmentIDMfFlag() {
        return this.toDepartmentIDMfFlag;
    }

    public void setToDepartmentIDMfFlag(String toDepartmentIDMfFlag) {
        this.toDepartmentIDMfFlag = toDepartmentIDMfFlag;
    }

    public String getResourceIDMfFlag() {
        return this.resourceIDMfFlag;
    }

    public void setResourceIDMfFlag(String resourceIDMfFlag) {
        this.resourceIDMfFlag = resourceIDMfFlag;
    }

    public String getQuantityMfFlag() {
        return this.quantityMfFlag;
    }

    public void setQuantityMfFlag(String quantityMfFlag) {
        this.quantityMfFlag = quantityMfFlag;
    }

    public String getUomMfFlag() {
        return this.uomMfFlag;
    }

    public void setUomMfFlag(String uomMfFlag) {
        this.uomMfFlag = uomMfFlag;
    }

    public String getRevisionMfFlag() {
        return this.revisionMfFlag;
    }

    public void setRevisionMfFlag(String revisionMfFlag) {
        this.revisionMfFlag = revisionMfFlag;
    }

    public String getSubinventoryMfFlag() {
        return this.subinventoryMfFlag;
    }

    public void setSubinventoryMfFlag(String subinventoryMfFlag) {
        this.subinventoryMfFlag = subinventoryMfFlag;
    }

    public String getLocatoridMfFlag() {
        return this.locatoridMfFlag;
    }

    public void setLocatoridMfFlag(String locatoridMfFlag) {
        this.locatoridMfFlag = locatoridMfFlag;
    }

    public String getLotNumberMfFlag() {
        return this.lotNumberMfFlag;
    }

    public void setLotNumberMfFlag(String lotNumberMfFlag) {
        this.lotNumberMfFlag = lotNumberMfFlag;
    }

    public String getSerialNumberMfFlag() {
        return this.serialNumberMfFlag;
    }

    public void setSerialNumberMfFlag(String serialNumberMfFlag) {
        this.serialNumberMfFlag = serialNumberMfFlag;
    }

    public String getCompItemIdMfFlag() {
        return this.compItemIdMfFlag;
    }

    public void setCompItemIdMfFlag(String compItemIdMfFlag) {
        this.compItemIdMfFlag = compItemIdMfFlag;
    }

    public String getCompUOMMfFlag() {
        return this.compUOMMfFlag;
    }

    public void setCompUOMMfFlag(String compUOMMfFlag) {
        this.compUOMMfFlag = compUOMMfFlag;
    }

    public String getCompRevisionMfFlag() {
        return this.compRevisionMfFlag;
    }

    public void setCompRevisionMfFlag(String compRevisionMfFlag) {
        this.compRevisionMfFlag = compRevisionMfFlag;
    }

    public String getCompSubinventoryMfFlag() {
        return this.compSubinventoryMfFlag;
    }

    public void setCompSubinventoryMfFlag(String compSubinventoryMfFlag) {
        this.compSubinventoryMfFlag = compSubinventoryMfFlag;
    }

    public String getCompLocatorIdMfFlag() {
        return this.compLocatorIdMfFlag;
    }

    public void setCompLocatorIdMfFlag(String compLocatorIdMfFlag) {
        this.compLocatorIdMfFlag = compLocatorIdMfFlag;
    }

    public String getCompLotNumberMfFlag() {
        return this.compLotNumberMfFlag;
    }

    public void setCompLotNumberMfFlag(String compLotNumberMfFlag) {
        this.compLotNumberMfFlag = compLotNumberMfFlag;
    }

    public String getCompSerialNumberMfFlag() {
        return this.compSerialNumberMfFlag;
    }

    public void setCompSerialNumberMfFlag(String compSerialNumberMfFlag) {
        this.compSerialNumberMfFlag = compSerialNumberMfFlag;
    }

    public String getWipEntityIdMfFlag() {
        return this.wipEntityIdMfFlag;
    }

    public void setWipEntityIdMfFlag(String wipEntityIdMfFlag) {
        this.wipEntityIdMfFlag = wipEntityIdMfFlag;
    }

    public String getLineIdMfFlag() {
        return this.lineIdMfFlag;
    }

    public void setLineIdMfFlag(String lineIdMfFlag) {
        this.lineIdMfFlag = lineIdMfFlag;
    }

    public String getFromOpSeqNumMfFlag() {
        return this.fromOpSeqNumMfFlag;
    }

    public void setFromOpSeqNumMfFlag(String fromOpSeqNumMfFlag) {
        this.fromOpSeqNumMfFlag = fromOpSeqNumMfFlag;
    }

    public String getToOpSeqNumMfFlag() {
        return this.toOpSeqNumMfFlag;
    }

    public void setToOpSeqNumMfFlag(String toOpSeqNumMfFlag) {
        this.toOpSeqNumMfFlag = toOpSeqNumMfFlag;
    }

    public String getVendorIDMfFlag() {
        return this.vendorIDMfFlag;
    }

    public void setVendorIDMfFlag(String vendorIDMfFlag) {
        this.vendorIDMfFlag = vendorIDMfFlag;
    }

    public String getReceiptNumMfFlag() {
        return this.receiptNumMfFlag;
    }

    public void setReceiptNumMfFlag(String receiptNumMfFlag) {
        this.receiptNumMfFlag = receiptNumMfFlag;
    }

    public String getPoNumberMfFlag() {
        return this.poNumberMfFlag;
    }

    public void setPoNumberMfFlag(String poNumberMfFlag) {
        this.poNumberMfFlag = poNumberMfFlag;
    }

    public String getPoLineNumberMfFlag() {
        return this.poLineNumberMfFlag;
    }

    public void setPoLineNumberMfFlag(String poLineNumberMfFlag) {
        this.poLineNumberMfFlag = poLineNumberMfFlag;
    }

    public String getPoReleaseIDMfFlag() {
        return this.poReleaseIDMfFlag;
    }

    public void setPoReleaseIDMfFlag(String poReleaseIDMfFlag) {
        this.poReleaseIDMfFlag = poReleaseIDMfFlag;
    }

    public String getPoShipmentNumMfFlag() {
        return this.poShipmentNumMfFlag;
    }

    public void setPoShipmentNumMfFlag(String poShipmentNumMfFlag) {
        this.poShipmentNumMfFlag = poShipmentNumMfFlag;
    }

    public String getCustomerIDMfFlag() {
        return this.customerIDMfFlag;
    }

    public void setCustomerIDMfFlag(String customerIDMfFlag) {
        this.customerIDMfFlag = customerIDMfFlag;
    }

    public String getSoHeaderIDMfFlag() {
        return this.soHeaderIDMfFlag;
    }

    public void setSoHeaderIDMfFlag(String soHeaderIDMfFlag) {
        this.soHeaderIDMfFlag = soHeaderIDMfFlag;
    }

    public String getRmaHeaderIDMfFlag() {
        return this.rmaHeaderIDMfFlag;
    }

    public void setRmaHeaderIDMfFlag(String rmaHeaderIDMfFlag) {
        this.rmaHeaderIDMfFlag = rmaHeaderIDMfFlag;
    }

    public String getTransactionDateMfFlag() {
        return this.transactionDateMfFlag;
    }

    public void setTransactionDateMfFlag(String transactionDateMfFlag) {
        this.transactionDateMfFlag = transactionDateMfFlag;
    }

    public String getStatusMfFlag() {
        return this.statusMfFlag;
    }

    public void setStatusMfFlag(String statusMfFlag) {
        this.statusMfFlag = statusMfFlag;
    }

    public String getProjectIDMfFlag() {
        return this.projectIDMfFlag;
    }

    public void setProjectIDMfFlag(String projectIDMfFlag) {
        this.projectIDMfFlag = projectIDMfFlag;
    }

    public String getTaskIDMfFlag() {
        return this.taskIDMfFlag;
    }

    public void setTaskIDMfFlag(String taskIDMfFlag) {
        this.taskIDMfFlag = taskIDMfFlag;
    }

    public String getXfrLpnIDMfFlag() {
        return this.xfrLpnIDMfFlag;
    }

    public void setXfrLpnIDMfFlag(String xfrLpnIDMfFlag) {
        this.xfrLpnIDMfFlag = xfrLpnIDMfFlag;
    }

    public String getContractIDMfFlag() {
        return this.contractIDMfFlag;
    }

    public void setContractIDMfFlag(String contractIDMfFlag) {
        this.contractIDMfFlag = contractIDMfFlag;
    }

    public String getContractLineIDMfFlag() {
        return this.contractLineIDMfFlag;
    }

    public void setContractLineIDMfFlag(String contractLineIDMfFlag) {
        this.contractLineIDMfFlag = contractLineIDMfFlag;
    }

    public String getDeliverableIDMfFlag() {
        return this.deliverableIDMfFlag;
    }

    public void setDeliverableIDMfFlag(String deliverableIDMfFlag) {
        this.deliverableIDMfFlag = deliverableIDMfFlag;
    }

    public String getAssetGroupIDMfFlag() {
        return this.assetGroupIDMfFlag;
    }

    public void setAssetGroupIDMfFlag(String assetGroupIDMfFlag) {
        this.assetGroupIDMfFlag = assetGroupIDMfFlag;
    }

    public String getAssetNumberMfFlag() {
        return this.assetNumberMfFlag;
    }

    public void setAssetNumberMfFlag(String assetNumberMfFlag) {
        this.assetNumberMfFlag = assetNumberMfFlag;
    }

    public String getAssetActivityIDMfFlag() {
        return this.assetActivityIDMfFlag;
    }

    public void setAssetActivityIDMfFlag(String assetActivityIDMfFlag) {
        this.assetActivityIDMfFlag = assetActivityIDMfFlag;
    }

    public String getFollowupActivityIDMfFlag() {
        return this.followupActivityIDMfFlag;
    }

    public void setFollowupActivityIDMfFlag(String followupActivityIDMfFlag) {
        this.followupActivityIDMfFlag = followupActivityIDMfFlag;
    }

    public String getWorkOrderIDMfFlag() {
        return this.workOrderIDMfFlag;
    }

    public void setWorkOrderIDMfFlag(String workOrderIDMfFlag) {
        this.workOrderIDMfFlag = workOrderIDMfFlag;
    }

    public String getCharacter1MfFlag() {
        return this.character1MfFlag;
    }

    public void setCharacter1MfFlag(String character1MfFlag) {
        this.character1MfFlag = character1MfFlag;
    }

    public String getCharacter2MfFlag() {
        return this.character2MfFlag;
    }

    public void setCharacter2MfFlag(String character2MfFlag) {
        this.character2MfFlag = character2MfFlag;
    }

    public String getCharacter3MfFlag() {
        return this.character3MfFlag;
    }

    public void setCharacter3MfFlag(String character3MfFlag) {
        this.character3MfFlag = character3MfFlag;
    }

    public String getCharacter4MfFlag() {
        return this.character4MfFlag;
    }

    public void setCharacter4MfFlag(String character4MfFlag) {
        this.character4MfFlag = character4MfFlag;
    }

    public String getCharacter5MfFlag() {
        return this.character5MfFlag;
    }

    public void setCharacter5MfFlag(String character5MfFlag) {
        this.character5MfFlag = character5MfFlag;
    }

    public String getCharacter6MfFlag() {
        return this.character6MfFlag;
    }

    public void setCharacter6MfFlag(String character6MfFlag) {
        this.character6MfFlag = character6MfFlag;
    }

    public String getCharacter7MfFlag() {
        return this.character7MfFlag;
    }

    public void setCharacter7MfFlag(String character7MfFlag) {
        this.character7MfFlag = character7MfFlag;
    }

    public String getCharacter8MfFlag() {
        return this.character8MfFlag;
    }

    public void setCharacter8MfFlag(String character8MfFlag) {
        this.character8MfFlag = character8MfFlag;
    }

    public String getCharacter9MfFlag() {
        return this.character9MfFlag;
    }

    public void setCharacter9MfFlag(String character9MfFlag) {
        this.character9MfFlag = character9MfFlag;
    }

    public String getCharacter10MfFlag() {
        return this.character10MfFlag;
    }

    public void setCharacter10MfFlag(String character10MfFlag) {
        this.character10MfFlag = character10MfFlag;
    }

    public String getCharacter11MfFlag() {
        return this.character11MfFlag;
    }

    public void setCharacter11MfFlag(String character11MfFlag) {
        this.character11MfFlag = character11MfFlag;
    }

    public String getCharacter12MfFlag() {
        return this.character12MfFlag;
    }

    public void setCharacter12MfFlag(String character12MfFlag) {
        this.character12MfFlag = character12MfFlag;
    }

    public String getCharacter13MfFlag() {
        return this.character13MfFlag;
    }

    public void setCharacter13MfFlag(String character13MfFlag) {
        this.character13MfFlag = character13MfFlag;
    }

    public String getCharacter14MfFlag() {
        return this.character14MfFlag;
    }

    public void setCharacter14MfFlag(String character14MfFlag) {
        this.character14MfFlag = character14MfFlag;
    }

    public String getCharacter15MfFlag() {
        return this.character15MfFlag;
    }

    public void setCharacter15MfFlag(String character15MfFlag) {
        this.character15MfFlag = character15MfFlag;
    }

    public String getCharacter16MfFlag() {
        return this.character16MfFlag;
    }

    public void setCharacter16MfFlag(String character16MfFlag) {
        this.character16MfFlag = character16MfFlag;
    }

    public String getCharacter17MfFlag() {
        return this.character17MfFlag;
    }

    public void setCharacter17MfFlag(String character17MfFlag) {
        this.character17MfFlag = character17MfFlag;
    }

    public String getCharacter18MfFlag() {
        return this.character18MfFlag;
    }

    public void setCharacter18MfFlag(String character18MfFlag) {
        this.character18MfFlag = character18MfFlag;
    }

    public String getCharacter19MfFlag() {
        return this.character19MfFlag;
    }

    public void setCharacter19MfFlag(String character19MfFlag) {
        this.character19MfFlag = character19MfFlag;
    }

    public String getCharacter20MfFlag() {
        return this.character20MfFlag;
    }

    public void setCharacter20MfFlag(String character20MfFlag) {
        this.character20MfFlag = character20MfFlag;
    }

    public String getCharacter21MfFlag() {
        return this.character21MfFlag;
    }

    public void setCharacter21MfFlag(String character21MfFlag) {
        this.character21MfFlag = character21MfFlag;
    }

    public String getCharacter22MfFlag() {
        return this.character22MfFlag;
    }

    public void setCharacter22MfFlag(String character22MfFlag) {
        this.character22MfFlag = character22MfFlag;
    }

    public String getCharacter23MfFlag() {
        return this.character23MfFlag;
    }

    public void setCharacter23MfFlag(String character23MfFlag) {
        this.character23MfFlag = character23MfFlag;
    }

    public String getCharacter24MfFlag() {
        return this.character24MfFlag;
    }

    public void setCharacter24MfFlag(String character24MfFlag) {
        this.character24MfFlag = character24MfFlag;
    }

    public String getCharacter25MfFlag() {
        return this.character25MfFlag;
    }

    public void setCharacter25MfFlag(String character25MfFlag) {
        this.character25MfFlag = character25MfFlag;
    }

    public String getCharacter26MfFlag() {
        return this.character26MfFlag;
    }

    public void setCharacter26MfFlag(String character26MfFlag) {
        this.character26MfFlag = character26MfFlag;
    }

    public String getCharacter27MfFlag() {
        return this.character27MfFlag;
    }

    public void setCharacter27MfFlag(String character27MfFlag) {
        this.character27MfFlag = character27MfFlag;
    }

    public String getCharacter28MfFlag() {
        return this.character28MfFlag;
    }

    public void setCharacter28MfFlag(String character28MfFlag) {
        this.character28MfFlag = character28MfFlag;
    }

    public String getCharacter29MfFlag() {
        return this.character29MfFlag;
    }

    public void setCharacter29MfFlag(String character29MfFlag) {
        this.character29MfFlag = character29MfFlag;
    }

    public String getCharacter30MfFlag() {
        return this.character30MfFlag;
    }

    public void setCharacter30MfFlag(String character30MfFlag) {
        this.character30MfFlag = character30MfFlag;
    }


    public void setAssetNumberPrompt(String assetNumberPrompt) {
        String oldAssetNumberPrompt = this.assetNumberPrompt;
        this.assetNumberPrompt = assetNumberPrompt;
        _propertyChangeSupport.firePropertyChange("assetNumberPrompt", oldAssetNumberPrompt, assetNumberPrompt);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.removePropertyChangeListener(l);
    }

    public String getAssetNumberPrompt() {
        return assetNumberPrompt;
    }
}
