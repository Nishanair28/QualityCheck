package com.deloitte.inv.mobile;

import com.deloitte.inv.application.model.PlanElementDbAdapterOutput;
import com.deloitte.inv.mobile.rest.RestURIs;
import com.deloitte.inv.mobile.rest.ServiceManager;
import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.json.JSONObject;

public class CreateResult {
    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);
    PlanElementDbAdapterOutput pd = new PlanElementDbAdapterOutput();
    
    public CreateResult() {
        super();
    }
    private String itemNumber;
    private String collectionID;
    private String transactionNumber;
    private String rowID;
    private String occurence;
    private String userName;
    private String txnHeaderID;
    private String organizationID;
    private String planID;
    private String specID;
    private String transactionID;
    private String departmentID;
    private String toDepartmentID;
    private String resourceID;
    private String quantity;
    private String itemName;
    private String uom;
    private String revision;
    private String subinventory;
    private String locatorID;
    private String lotNumber;
    private String serialNumber;
    private String compItemID;
    private String compUOM;
    private String compRevision;
    private String compSubinventory;
    private String compLocatorID;
    private String compLotNumber;
    private String compSerialNumber;
    private String wipEntityID;
    private String lineID;
    private String toOpSeqNum;
    private String fromOpSeqNum;
    private String vendorID;
    private String receiptNum;
    private String poNumber;
    private String poLineNumber;
    private String poReleaseID;
    private String poShipmentNum;
    private String customerID;
    private String soHeaderID;
    private String rmaHeaderID;
    private String transactionDate;
    private String status;
    private String projectID;
    private String taskID;
    private String lpnID;
    private String xfrLpnID;
    private String contractID;
    private String contractLineID;
    private String deliverableID;
    private String assetGroupID;
    private String assetNumber;
    private String assetActivityID;
    private String followupActivityID;
    private String workOrderID;
    private String character1;
    private String character2;
    private String character3;
    private String character4;
    private String character5;
    private String character6;
    private String character7;
    private String character8;
    private String character9;
    private String character10;
    private String character11;
    private String character12;
    private String character13;
    private String character14;
    private String character15;
    private String character16;
    private String character17;
    private String character18;
    private String character19;
    private String character20;
    private String character21;
    private String character22;
    private String character23;
    private String character24;
    private String character25;
    private String character26;
    private String character27;
    private String character28;
    private String character29;
    private String character30;
    private String methodCode;

    public void setCreateResults(){

            itemNumber =AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNumberCR}").toString();
            if (itemNumber == null){
                itemNumber = "-999";
                }
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionNumberCR}") != null){                     
            transactionNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionNumberCR}").toString();}
            else{
            transactionNumber = "-999";
            }
            rowID = "-999";
            collectionID = "-999";
            occurence ="-999";
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.userNameCR}") != null){
            userName = AdfmfJavaUtilities.getELValue("#{pageFlowScope.userNameCR}").toString();}
            else{
              userName = "SYSADMIN";
            }
            txnHeaderID= "-999";
            organizationID = pd.getOrganizationId().toString();
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedLov}") != null){
            planID = AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedLov}").toString();}
	    else{
              planID = "120";
            }
            specID = "-999";
            transactionID= "-999";
            departmentID = "-999";
            toDepartmentID = "-999";
            resourceID = "-999";
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.quantityCR}") != null){
            quantity=AdfmfJavaUtilities.getELValue("#{pageFlowScope.quantityCR}").toString();}
            else{
              quantity = "-999";
            }
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNameCR}") != null){
            itemName=AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNameCR}").toString();}
			else{
              itemName = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.uomCR}") != null){
            uom=AdfmfJavaUtilities.getELValue("#{pageFlowScope.uomCR}").toString();}
			if (uom == null){
              uom = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.revisionCR}") != null){
            revision=AdfmfJavaUtilities.getELValue("#{pageFlowScope.revisionCR}").toString();}
			else{
              revision = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.subinventoryCR}") != null){
            subinventory = AdfmfJavaUtilities.getELValue("#{pageFlowScope.subinventoryCR}").toString();}
			else{
              subinventory = "-999";
            }
            locatorID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.lotNumberCR}") != null){
            lotNumber=AdfmfJavaUtilities.getELValue("#{pageFlowScope.lotNumberCR}").toString();}
			else{
              lotNumber = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.serialNumberCR}") != null){
            serialNumber=AdfmfJavaUtilities.getELValue("#{pageFlowScope.serialNumberCR}").toString();}
			else{
              serialNumber = "-999";
            }
            compItemID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compUOMCR}") != null){
            compUOM=AdfmfJavaUtilities.getELValue("#{pageFlowScope.compUOMCR}").toString();}
			else{
              compUOM = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compRevisionCR}") != null){
            compRevision=AdfmfJavaUtilities.getELValue("#{pageFlowScope.compRevisionCR}").toString();}
			else{
              compRevision = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSubinventoryCR}") != null){
            compSubinventory=AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSubinventoryCR}").toString();}
			else{
              compSubinventory = "-999";
            }
            compLocatorID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compLotNumberCR}") != null){
            compLotNumber=AdfmfJavaUtilities.getELValue("#{pageFlowScope.compLotNumberCR}").toString();}
			else{
              compLotNumber = "-999";
            }
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSerialNumberCR}") != null){
            compSerialNumber=AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSerialNumberCR}").toString();}
            else{
              compSerialNumber = "-999";
            }
            wipEntityID= "-999";
            lineID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.toOpSeqNumCR}") != null){
            toOpSeqNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.toOpSeqNumCR}").toString();}
			else{
              toOpSeqNum = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.fromOpSeqNumCR}") != null){
            fromOpSeqNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.fromOpSeqNumCR}").toString();}
			else{
              fromOpSeqNum = "-999";
            }
            vendorID= "-999";
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.receiptNumCR}") != null){
            receiptNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.receiptNumCR}").toString();}
			else{
              receiptNum = "-999";
            }
	    if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poNumberCR}") != null){
            poNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poNumberCR}").toString();}
			else{
              poNumber = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poLineNumberCR}") != null){
            poLineNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poLineNumberCR}").toString();}
			else{
              poLineNumber = "-999";
            }
            poReleaseID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poShipmentNumCR}") != null){
            poShipmentNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poShipmentNumCR}").toString();}
			else{
              poShipmentNum = "-999";
            }
            customerID= "-999";
            soHeaderID= "-999";
            rmaHeaderID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionDateCR}") != null){
            transactionDate = AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionDateCR}").toString();}
			else{
              transactionDate = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.statusCR}") != null){
            status = AdfmfJavaUtilities.getELValue("#{pageFlowScope.statusCR}").toString();}
			else{
              status = "-999";
            }
            projectID= "-999";
            taskID = "-999";
            lpnID= "-999";
            xfrLpnID= "-999";
            contractID = "-999";
            contractLineID = "-999";
            deliverableID= "-999";
            assetGroupID= "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.assetNumberCR}") != null){
            assetNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.assetNumberCR}").toString();}
			else{
              assetNumber = "-999";
            }
            assetActivityID= "-999";
            followupActivityID= "-999";
            workOrderID = "-999";
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character1CR}") != null){
            character1 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character1CR}").toString();}
			else{
              character1 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character2CR}") != null){
            character2 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character2CR}").toString();}
			else{
              character2 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character3CR}") != null){
            character3 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character3CR}").toString();}
			else{
              character3 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character4CR}") != null){
            character4 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character4CR}").toString();}
			else{
              character4 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character5CR}") != null){
            character5 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character5CR}").toString();}
			else{
              character5 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character6CR}") != null){
            character6 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character6CR}").toString();}
			else{
              character6 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character7CR}") != null){
            character7 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character7CR}").toString();}
			else{
              character7 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character8CR}") != null){
            character8 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character8CR}").toString();}
			else{
              character8 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character9CR}") != null){
            character9 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character9CR}").toString();}
			else{
              character9 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character10CR}") != null){
            character10 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character10CR}").toString();}
			else{
              character10 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character11CR}") != null){
            character11 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character11CR}").toString();}
			else{
              character11 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character12CR}") != null){
            character12 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character12CR}").toString();}
            else{
              character12 = "-999";
            }
            if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character13CR}") != null){
            character13 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character13CR}").toString();}
            else{
              character13 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character14CR}") != null){
            character14 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character14CR}").toString();}
			else{
              character14 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character15CR}") != null){
            character15 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character15CR}").toString();}
			else{
              character15 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character16CR}") != null){
            character16 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character16CR}").toString();}
			else{
              character16 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character17CR}") != null){
            character17 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character17CR}").toString();}
			if (character17 == null){
              character17 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character18CR}") != null){
            character18 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character18CR}").toString();}
			else{
              character18 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character19CR}") != null){
            character19 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character19CR}").toString();}
			else{
              character19 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character20CR}") != null){
            character20 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character20CR}").toString();}
			else{
              character20 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character21CR}") != null){
            character21 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character21CR}").toString();}
			else{
              character21 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character22CR}") != null){
            character22 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character22CR}").toString();}
			else{
              character22 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character23CR}") != null){
            character23 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character23CR}").toString();}
			else{
              character23 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character24CR}") != null){
            character24 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character24CR}").toString();}
			else{
              character24 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character25CR}") != null){
            character25 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character25CR}").toString();}
			else{
              character25 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character26CR}") != null){
            character26 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character26CR}").toString();}
			else{
              character26 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character27CR}") != null){
            character27 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character27CR}").toString();}
			else{
              character27 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character28CR}") != null){
            character28 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character28CR}").toString();}
			else{
              character28 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character29CR}") != null){
            character29 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character29CR}").toString();}
			else{
              character29 = "-999";
            }
			if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character30CR}") != null){
            character30 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character30CR}").toString();}
			else{
              character30 = "-999";
            }
            methodCode = "INSERT";
            ServiceManager sm = new  ServiceManager();
            String restURI = RestURIs.getCreateResultURI();
            
            System.out.println("UserName-->"+userName);
            System.out.println("itemNum-->"+itemNumber);
            System.out.println("transactionNumber-->"+transactionNumber);
            System.out.println("orgId-->"+organizationID);
            System.out.println("lotNumber-->"+lotNumber);
            System.out.println("serialNumber-->"+serialNumber);
            System.out.println("quantity-->"+quantity);
            
            

            String payload = "{  \n" + "\"P_ROWID\" : \"" + rowID + "\"," +
                                "\n" + "\"P_COLLECTION_ID\" : \"" + collectionID + "\"," +
                                "\n" + "\"P_OCCURRENCE\" : \"" + occurence + "\"," +
                                "\n" + "\"P_USER_NAME\" : \"" + userName + "\"," +
                                "\n" + "\"P_TRANSACTION_NUMBER\" : \"" + transactionNumber + "\"," +
                                "\n" + "\"P_TXN_HEADER_ID\" : \"" + txnHeaderID + "\"," +
                                "\n" + "\"P_ORGANIZATION_ID\" : \"" + organizationID + "\"," +
                                "\n" + "\"P_PLAN_ID\" : \"" + planID + "\"," +
                                "\n" + "\"P_SPEC_ID\" : \"" + specID + "\"," +
                                "\n" + "\"P_TRANSACTION_ID\" : \"" + transactionID + "\"," +
                                "\n" + "\"P_DEPARTMENT_ID\" : \"" + departmentID + "\"," +
                                "\n" + "\"P_TO_DEPARTMENT_ID\" : \"" + toDepartmentID + "\"," +
                                "\n" + "\"P_RESOURCE_ID\" : \"" + resourceID + "\"," +
                                "\n" + "\"P_QUANTITY\" : \"" + quantity + "\"," +
                                "\n" + "\"P_ITEM_NAME\" : \"" + itemName + "\"," +
                                "\n" + "\"P_UOM\" : \"" + uom + "\"," +
                                "\n" + "\"P_REVISION\" : \"" + revision + "\"," +
                                "\n" + "\"P_SUBINVENTORY\" : \"" + quantity + "\"," +
                                "\n" + "\"P_LOCATOR_ID\" : \"" + locatorID + "\"," +
                                "\n" + "\"P_LOT_NUMBER\" : \"" + lotNumber + "\"," +
                                "\n" + "\"P_SERIAL_NUMBER\" : \"" + serialNumber + "\"," +
                                "\n" + "\"P_COMP_ITEM_ID\" : \"" + compItemID + "\"," +
                                "\n" + "\"P_COMP_UOM\" : \"" + compUOM + "\"," +
                                "\n" + "\"P_COMP_REVISION\" : \"" + compRevision + "\"," +
                                "\n" + "\"P_COMP_SUBINVENTORY\" : \"" + compSubinventory + "\"," +
                                "\n" + "\"P_COMP_LOCATOR_ID\" : \"" + compLocatorID + "\"," +
                                "\n" + "\"P_COMP_LOT_NUMBER\" : \"" + compLotNumber + "\"," +
                                "\n" + "\"P_COMP_SERIAL_NUMBER\" : \"" + compSerialNumber + "\"," +
                                "\n" + "\"P_WIP_ENTITY_ID\" : \"" + wipEntityID + "\"," +
                                "\n" + "\"P_LINE_ID\" : \"" + lineID + "\"," +
                                "\n" + "\"P_TO_OP_SEQ_NUM\" : \"" + toOpSeqNum + "\"," +
                                "\n" + "\"P_FROM_OP_SEQ_NUM\" : \"" + fromOpSeqNum + "\"," +
                                "\n" + "\"P_VENDOR_ID\" : \"" + vendorID + "\"," +
                                "\n" + "\"P_RECEIPT_NUM\" : \"" + receiptNum + "\"," +
                                "\n" + "\"P_PO_NUMBER\" : \"" + poNumber + "\"," +
                                "\n" + "\"P_PO_LINE_NUM\" : \"" + poLineNumber + "\"," +
                                "\n" + "\"P_PO_RELEASE_ID\" : \"" + poReleaseID + "\"," +
                                "\n" + "\"P_PO_SHIPMENT_NUM\" : \"" + poShipmentNum + "\"," +
                                "\n" + "\"P_CUSTOMER_ID\" : \"" + customerID + "\"," +
                                "\n" + "\"P_SO_HEADER_ID\" : \"" + soHeaderID + "\"," +
                                "\n" + "\"P_RMA_HEADER_ID\" : \"" + rmaHeaderID + "\"," +
                                "\n" + "\"P_TRANSACTION_DATE\" : \"" + transactionDate + "\"," +
                                "\n" + "\"P_STATUS\" : \"" + status + "\"," +
                                "\n" + "\"P_PROJECT_ID\" : \"" + projectID + "\"," +
                                "\n" + "\"P_TASK_ID\" : \"" + taskID + "\"," +
                                "\n" + "\"P_LPN_ID\" : \"" + lpnID + "\"," +
                                "\n" + "\"P_XFR_LPN_ID\" : \"" + xfrLpnID + "\"," +
                                "\n" + "\"P_CONTRACT_ID\" : \"" + contractID + "\"," +
                                "\n" + "\"P_CONTRACT_LINE_ID\" : \"" + contractLineID + "\"," +
                                "\n" + "\"P_DELIVERABLE_ID\" : \"" + deliverableID + "\"," +
                                "\n" + "\"P_ASSET_GROUP_ID\" : \"" + assetGroupID + "\"," +
                                "\n" + "\"P_ASSET_NUMBER\" : \"" + assetNumber + "\"," +
                                "\n" + "\"P_ASSET_ACTIVITY_ID\" : \"" + assetActivityID + "\"," +
                                "\n" + "\"P_FOLLOWUP_ACTIVITY_ID\" : \"" + followupActivityID + "\"," +
                                "\n" + "\"P_WORK_ORDER_ID\" : \"" + workOrderID + "\"," +
                                "\n" + "\"P_CHARACTER1\" : \"" + character1 + "\"," +
                                "\n" + "\"P_CHARACTER2\" : \"" + character2 + "\"," +
                                "\n" + "\"P_CHARACTER3\" : \"" + character3 + "\"," +
                                "\n" + "\"P_CHARACTER4\" : \"" + character4 + "\"," +
                                "\n" + "\"P_CHARACTER5\" : \"" + character5 + "\"," +
                                "\n" + "\"P_CHARACTER6\" : \"" + character6 + "\"," +
                                "\n" + "\"P_CHARACTER7\" : \"" + character7 + "\"," +
                                "\n" + "\"P_CHARACTER8\" : \"" + character8 + "\"," +
                                "\n" + "\"P_CHARACTER9\" : \"" + character9 + "\"," +
                                "\n" + "\"P_CHARACTER10\" : \"" + character10 + "\"," +
                                "\n" + "\"P_CHARACTER11\" : \"" + character11 + "\"," +
                                "\n" + "\"P_CHARACTER12\" : \"" + character12 + "\"," +
                                "\n" + "\"P_CHARACTER13\" : \"" + character13 + "\"," +
                                "\n" + "\"P_CHARACTER14\" : \"" + character14 + "\"," +
                                "\n" + "\"P_CHARACTER15\" : \"" + character15 + "\"," +
                                "\n" + "\"P_CHARACTER16\" : \"" + character16 + "\"," +
                                "\n" + "\"P_CHARACTER17\" : \"" + character17 + "\"," +
                                "\n" + "\"P_CHARACTER18\" : \"" + character18 + "\"," +
                                "\n" + "\"P_CHARACTER19\" : \"" + character19 + "\"," +
                                "\n" + "\"P_CHARACTER20\" : \"" + character20 + "\"," +
                                "\n" + "\"P_CHARACTER21\" : \"" + character21 + "\"," +
                                "\n" + "\"P_CHARACTER22\" : \"" + character22 + "\"," +
                                "\n" + "\"P_CHARACTER23\" : \"" + character23 + "\"," +
                                "\n" + "\"P_CHARACTER24\" : \"" + character24 + "\"," +
                                "\n" + "\"P_CHARACTER25\" : \"" + character25 + "\"," +
                                "\n" + "\"P_CHARACTER26\" : \"" + character26 + "\"," +
                                "\n" + "\"P_CHARACTER27\" : \"" + character27 + "\"," +
                                "\n" + "\"P_CHARACTER28\" : \"" + character28 + "\"," +
                                "\n" + "\"P_CHARACTER29\" : \"" + character29 + "\"," +
                                "\n" + "\"P_CHARACTER30\" : \"" + character30 + "\"," +
                                "\n" + "\"P_METHOD_CODE\" : \"" + methodCode + "\"\n" + "}";
            System.out.println("payload is " + payload);
             String jsonArrayAsString = sm.invokeUPDATE(restURI,payload).toString();
             System.out.println("jsonArrayAsString-->"+jsonArrayAsString);
    

    }

    public void create(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("Inside Create Result:");
        setCreateResults();
    }
}
