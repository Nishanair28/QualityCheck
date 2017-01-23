package com.deloitte.inv.mobile;

import com.deloitte.inv.mobile.rest.RestURIs;
import com.deloitte.inv.mobile.rest.ServiceManager;

import java.math.BigDecimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.amx.event.ValueChangeEvent;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.json.JSONArray;
import oracle.adfmf.json.JSONException;
import oracle.adfmf.json.JSONObject;

public class CreateResult {
    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);
  //  PlanElementDbAdapterOutput pd = new PlanElementDbAdapterOutput();

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
    private String POHeaderID;
    private String POLineID;
 
    private String service_msg = null;
    
    public void initPlanDet(ActionEvent actionEvent) {
        // Add event code here...
        List pnames = new ArrayList();
        List params = new ArrayList();
        List ptypes = new ArrayList();
        String planID = AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedLov}").toString();
        System.out.println("Plan Id" + planID);
        try {
            AdfmfJavaUtilities.invokeDataControlMethod("PlanElementDbAdapterOutputService", null,
                                                       "findAllPlanElementDbAdapterOutputRemote", pnames, params, ptypes);
           // AdfmfJavaUtilities.flushDataChangeEvent();
            //providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void itemNumberChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();

        String org_id = AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}").toString();
        String itemNumber = valueChangeEvent.getNewValue().toString();
        System.out.println("itemNumber-->" + itemNumber);
        String restURI = RestURIs.getItemLov(org_id, itemNumber);

        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("getIntemNumberDBAdapterOutput");
            int size = nodeArray.length();
            if (size > 1)
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.itemValidationMessage}",
                                              "Multiple Items found with same Number.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.itemValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue("#{bindings.itemId.inputValue}", temp.getString("item_id"));
                }
            }

        } catch (Exception ex) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.itemValidationMessage}", "Invalid Item Number");
            System.out.println("Error:" + ex.getLocalizedMessage());
        }
    }
    public void uomChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();

        String uom = valueChangeEvent.getNewValue().toString();
        String restURI = RestURIs.getUomLov();

        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("getUOMdbAdapterOutput");
            int size = nodeArray.length();
            if (size > 1)
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.uomValidationMessage}",
                                              "Multiple uoms found.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.uomValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue("#{bindings.uom.inputValue}", temp.getString("uom"));
                }
            }

        } catch (Exception ex) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.uomValidationMessage}", "Invalid UOM");
            System.out.println("Error:" + ex.getLocalizedMessage());
        }
    }
    public void poNumberChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();
        String orgId = AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}").toString();
        String poNumber = valueChangeEvent.getNewValue().toString();
        String restURI = RestURIs.getPOHeaderIDLov(orgId,poNumber);


        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("PoHeader");
            int size = nodeArray.length();
            if (size > 1)
            System.out.println("Multiple PO Headers found.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.poHeaderValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue(POHeaderID, temp.getString("HeaderId"));
                }
            }

        } catch (Exception ex) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.poHeaderValidationMessage}", "Invalid PO Number");
            System.out.println("Error:" + ex.getLocalizedMessage());
        }
    }    
    
    public void subinvChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();
        String orgId = AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}").toString();
        String subinventory = valueChangeEvent.getNewValue().toString();
        String restURI = RestURIs.getSubinvLov(orgId,subinventory);


        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("SubInventory");
            int size = nodeArray.length();
            if (size > 1)
            System.out.println("Multiple Subinventory found.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.subinvValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue(POHeaderID, temp.getString("HeaderId"));
                }
            }

        } catch (Exception ex) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.subinvValidationMessage}", "Invalid Subinventory");
            System.out.println("Error:" + ex.getLocalizedMessage());
        }
    }    
    
    
    public void poLineNumChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();
        String orgId = AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}").toString();
        String poNumber = valueChangeEvent.getNewValue().toString();
        String restURI = RestURIs.getPOLineNumLov(POHeaderID);

        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("PoLine");
            int size = nodeArray.length();
            if (size > 1)
            System.out.println("Multiple PO Headers found.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.poLineValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue(POLineID, temp.getString("HeaderId"));
                }
            }

        } catch (Exception ex) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.poLineValidationMessage}", "Invalid PO Number");
            System.out.println("Error:" + ex.getLocalizedMessage());
        }
    }    
    
    public void setCreateResults() throws JSONException {
       /* this.itemNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNumberCR}").toString();
        if (this.itemNumber == null) {
            this.itemNumber = "-999";
        }*/
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionNumberCR}") != null) {
            this.transactionNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionNumberCR}").toString();
        } else {
            this.transactionNumber = "-999";
        }
        this.rowID = "-999";
        this.collectionID = "-999";
        this.occurence = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.userNameCR}") != null) {
            this.userName = AdfmfJavaUtilities.getELValue("#{pageFlowScope.userNameCR}").toString();
        } else {
            this.userName = "SYSADMIN";
        }
        this.txnHeaderID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}") != null){
        this.organizationID = AdfmfJavaUtilities.getELValue("#{pageFlowScope.orgIDCR}").toString();}
        else{
            this.organizationID = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedLov}") != null) {
            this.planID = AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedLov}").toString();
        } else {
            this.planID = "-999";
        }
        this.specID = "-999";
        this.transactionID = "-999";
        this.departmentID = "-999";
        ServiceManager sm = new ServiceManager();
        String deptrestURI = RestURIs.getDeptLov(organizationID);

        String jsonArrayAsString = sm.invokeREAD(deptrestURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        JSONObject jsonObject = new JSONObject(jsonArrayAsString);
        JSONArray nodeArray = jsonObject.getJSONArray("getDeptdbAdapterOutput");
            int size = nodeArray.length();
            if (size > 1)
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.deptIDValidationMessage}",
                                              "Multiple uoms found.");
            else {
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.deptIDValidationMessage}", null);

                for (int i = 0; i < size; i++) {
                    JSONObject temp = nodeArray.getJSONObject(i);
                    AdfmfJavaUtilities.setELValue(departmentID, temp.getString("departmentId"));
                }
            }
        this.toDepartmentID = "-999";
        this.resourceID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.quantityCR}") != null) {
            this.quantity = AdfmfJavaUtilities.getELValue("#{pageFlowScope.quantityCR}").toString();
        } else {
            this.quantity = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNameCR}") != null) {
            this.itemName = AdfmfJavaUtilities.getELValue("#{pageFlowScope.itemNameCR}").toString();
        } else {
            this.itemName = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.uomCR}") != null) {
            uom = AdfmfJavaUtilities.getELValue("#{pageFlowScope.uomCR}").toString();
        }
        if (uom == null) {
            uom = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.revisionCR}") != null) {
            this.revision = AdfmfJavaUtilities.getELValue("#{pageFlowScope.revisionCR}").toString();
        } else {
            this.revision = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.subinventoryCR}") != null) {
            this.subinventory = AdfmfJavaUtilities.getELValue("#{pageFlowScope.subinventoryCR}").toString();
        } else {
            this.subinventory = "-999";
        }
        locatorID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.lotNumberCR}") != null) {
            this.lotNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.lotNumberCR}").toString();
        } else {
            this.lotNumber = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.serialNumberCR}") != null) {
            this.serialNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.serialNumberCR}").toString();
        } else {
            this.serialNumber = "-999";
        }
        this.compItemID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compUOMCR}") != null) {
            this.compUOM = AdfmfJavaUtilities.getELValue("#{pageFlowScope.compUOMCR}").toString();
        } else {
            this.compUOM = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compRevisionCR}") != null) {
            this.compRevision = AdfmfJavaUtilities.getELValue("#{pageFlowScope.compRevisionCR}").toString();
        } else {
            this.compRevision = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSubinventoryCR}") != null) {
            this.compSubinventory = AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSubinventoryCR}").toString();
        } else {
            this.compSubinventory = "-999";
        }
        this.compLocatorID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compLotNumberCR}") != null) {
            this.compLotNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.compLotNumberCR}").toString();
        } else {
            this.compLotNumber = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSerialNumberCR}") != null) {
            this.compSerialNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.compSerialNumberCR}").toString();
        } else {
            this.compSerialNumber = "-999";
        }
        this.wipEntityID = "-999";
        this.lineID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.toOpSeqNumCR}") != null) {
            this.toOpSeqNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.toOpSeqNumCR}").toString();
        } else {
            this.toOpSeqNum = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.fromOpSeqNumCR}") != null) {
            this.fromOpSeqNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.fromOpSeqNumCR}").toString();
        } else {
            this.fromOpSeqNum = "-999";
        }
        this.vendorID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.receiptNumCR}") != null) {
            this.receiptNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.receiptNumCR}").toString();
        } else {
            this.receiptNum = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poNumberCR}") != null) {
            this.poNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poNumberCR}").toString();
        } else {
            this.poNumber = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poLineNumberCR}") != null) {
            this.poLineNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poLineNumberCR}").toString();
        } else {
            this.poLineNumber = "-999";
        }
        this.poReleaseID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.poShipmentNumCR}") != null) {
            this.poShipmentNum = AdfmfJavaUtilities.getELValue("#{pageFlowScope.poShipmentNumCR}").toString();
        } else {
            this.poShipmentNum = "-999";
        }
        this.customerID = "-999";
        this.soHeaderID = "-999";
        this.rmaHeaderID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionDateCR}") != null) {
            String truncDate;
            SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            SimpleDateFormat destinationFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
            truncDate = AdfmfJavaUtilities.getELValue("#{pageFlowScope.transactionDateCR}").toString();
            try {
                Date date = sourceFormat.parse(truncDate);
                System.out.println(date);
                System.out.println(destinationFormat.format(date));
                truncDate = destinationFormat.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.transactionDate = truncDate;
        } else {
            this.transactionDate = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.statusCR}") != null) {
            this.status = AdfmfJavaUtilities.getELValue("#{pageFlowScope.statusCR}").toString();
        } else {
            this.status = "-999";
        }
        this.projectID = "-999";
        this.taskID = "-999";
        this.lpnID = "-999";
        this.xfrLpnID = "-999";
        this.contractID = "-999";
        this.contractLineID = "-999";
        this.deliverableID = "-999";
        this.assetGroupID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.assetNumberCR}") != null) {
            this.assetNumber = AdfmfJavaUtilities.getELValue("#{pageFlowScope.assetNumberCR}").toString();
        } else {
            this.assetNumber = "-999";
        }
        this.assetActivityID = "-999";
        this.followupActivityID = "-999";
        this.workOrderID = "-999";
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character1CR}") != null) {
            this.character1 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character1CR}").toString();
        } else {
            this.character1 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character2CR}") != null) {
            this.character2 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character2CR}").toString();
        } else {
            this.character2 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character3CR}") != null) {
            this.character3 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character3CR}").toString();
        } else {
            this.character3 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character4CR}") != null) {
            this.character4 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character4CR}").toString();
        } else {
            this.character4 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character5CR}") != null) {
            this.character5 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character5CR}").toString();
        } else {
            this.character5 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character6CR}") != null) {
            this.character6 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character6CR}").toString();
        } else {
            this.character6 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character7CR}") != null) {
            this.character7 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character7CR}").toString();
        } else {
            this.character7 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character8CR}") != null) {
            this.character8 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character8CR}").toString();
        } else {
            this.character8 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character9CR}") != null) {
            this.character9 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character9CR}").toString();
        } else {
            this.character9 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character10CR}") != null) {
            this.character10 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character10CR}").toString();
        } else {
            this.character10 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character11CR}") != null) {
            this.character11 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character11CR}").toString();
        } else {
            this.character11 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character12CR}") != null) {
            this.character12 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character12CR}").toString();
        } else {
            this.character12 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character13CR}") != null) {
            this.character13 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character13CR}").toString();
        } else {
            this.character13 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character14CR}") != null) {
            this.character14 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character14CR}").toString();
        } else {
            this.character14 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character15CR}") != null) {
            this.character15 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character15CR}").toString();
        } else {
            this.character15 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character16CR}") != null) {
            this.character16 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character16CR}").toString();
        } else {
            this.character16 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character17CR}") != null) {
            this.character17 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character17CR}").toString();
        }
        if (this.character17 == null) {
            this.character17 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character18CR}") != null) {
            this.character18 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character18CR}").toString();
        } else {
            this.character18 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character19CR}") != null) {
            this.character19 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character19CR}").toString();
        } else {
            this.character19 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character20CR}") != null) {
            this.character20 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character20CR}").toString();
        } else {
            this.character20 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character21CR}") != null) {
            this.character21 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character21CR}").toString();
        } else {
            this.character21 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character22CR}") != null) {
            this.character22 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character22CR}").toString();
        } else {
            this.character22 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character23CR}") != null) {
            this.character23 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character23CR}").toString();
        } else {
            this.character23 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character24CR}") != null) {
            this.character24 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character24CR}").toString();
        } else {
            character24 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character25CR}") != null) {
            this.character25 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character25CR}").toString();
        } else {
            this.character25 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character26CR}") != null) {
            this.character26 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character26CR}").toString();
        } else {
            this.character26 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character27CR}") != null) {
            this.character27 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character27CR}").toString();
        } else {
            this.character27 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character28CR}") != null) {
            this.character28 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character28CR}").toString();
        } else {
            this.character28 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character29CR}") != null) {
            this.character29 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character29CR}").toString();
        } else {
            this.character29 = "-999";
        }
        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.character30CR}") != null) {
            this.character30 = AdfmfJavaUtilities.getELValue("#{pageFlowScope.character30CR}").toString();
        } else {
            this.character30 = "-999";
        }
        this.methodCode = "INSERT";

        invokeService();
    }

    public void invokeService() {
        ServiceManager sm = new ServiceManager();
        String restURI = RestURIs.getCreateResultURI();
        JSONObject poObject = new JSONObject();
        String payload;
        this.service_msg = null;
        try {
            poObject.put("P_ROWID", this.rowID);
            poObject.put("P_COLLECTION_ID", this.collectionID);
            poObject.put("P_OCCURRENCE", this.occurence);
            poObject.put("P_USER_NAME", this.userName);
            poObject.put("P_TRANSACTION_NUMBER", this.transactionNumber);
            poObject.put("P_TXN_HEADER_ID", this.txnHeaderID);
            poObject.put("P_ORGANIZATION_ID", this.organizationID);
            poObject.put("P_PLAN_ID", this.planID);
            poObject.put("P_SPEC_ID", this.specID);
            poObject.put("P_TRANSACTION_ID", this.transactionID);
            poObject.put("P_DEPARTMENT_ID", this.departmentID);
            poObject.put("P_TO_DEPARTMENT_ID", this.toDepartmentID);
            poObject.put("P_RESOURCE_ID", this.resourceID);
            poObject.put("P_QUANTITY", this.quantity);
            poObject.put("P_ITEM_NAME", this.itemName);
            poObject.put("P_UOM", this.uom);
            poObject.put("P_REVISION", this.revision);
            poObject.put("P_SUBINVENTORY", this.subinventory);
            poObject.put("P_LOCATOR_ID", this.locatorID);
            poObject.put("P_LOT_NUMBER", this.lotNumber);
            poObject.put("P_SERIAL_NUMBER", this.serialNumber);
            poObject.put("P_COMP_ITEM_ID", this.compItemID);
            poObject.put("P_COMP_UOM", this.compUOM);
            poObject.put("P_COMP_REVISION", this.compRevision);
            poObject.put("P_COMP_SUBINVENTORY", this.compSubinventory);
            poObject.put("P_COMP_LOCATOR_ID", this.compLocatorID);
            poObject.put("P_COMP_LOT_NUMBER", this.compLotNumber);
            poObject.put("P_COMP_SERIAL_NUMBER", this.compSerialNumber);
            poObject.put("P_WIP_ENTITY_ID", this.wipEntityID);
            poObject.put("P_LINE_ID", this.lineID);
            poObject.put("P_TO_OP_SEQ_NUM", this.toOpSeqNum);
            poObject.put("P_FROM_OP_SEQ_NUM", this.fromOpSeqNum);
            poObject.put("P_VENDOR_ID", this.vendorID);
            poObject.put("P_RECEIPT_NUM", this.receiptNum);
            poObject.put("P_PO_NUMBER", this.poNumber);
            poObject.put("P_PO_LINE_NUM", this.poLineNumber);
            poObject.put("P_PO_RELEASE_ID", this.poReleaseID);
            poObject.put("P_PO_SHIPMENT_NUM", this.poShipmentNum);
            poObject.put("P_CUSTOMER_ID", this.customerID);
            poObject.put("P_SO_HEADER_ID", this.soHeaderID);
            poObject.put("P_RMA_HEADER_ID", this.rmaHeaderID);
            poObject.put("P_TRANSACTION_DATE", this.transactionDate);
            poObject.put("P_STATUS", this.status);
            poObject.put("P_PROJECT_ID", this.projectID);
            poObject.put("P_TASK_ID", this.taskID);
            poObject.put("P_LPN_ID", this.lpnID);
            poObject.put("P_XFR_LPN_ID", this.xfrLpnID);
            poObject.put("P_CONTRACT_ID", this.contractID);
            poObject.put("P_CONTRACT_LINE_ID", this.contractLineID);
            poObject.put("P_DELIVERABLE_ID", this.deliverableID);
            poObject.put("P_ASSET_GROUP_ID", this.assetGroupID);
            poObject.put("P_ASSET_NUMBER", this.assetNumber);
            poObject.put("P_ASSET_ACTIVITY_ID", this.assetActivityID);
            poObject.put("P_FOLLOWUP_ACTIVITY_ID", this.followupActivityID);
            poObject.put("P_WORK_ORDER_ID", this.workOrderID);
            poObject.put("P_CHARACTER1", this.character1);
            poObject.put("P_CHARACTER2", this.character2);
            poObject.put("P_CHARACTER3", this.character3);
            poObject.put("P_CHARACTER4", this.character4);
            poObject.put("P_CHARACTER5", this.character5);
            poObject.put("P_CHARACTER6", this.character6);
            poObject.put("P_CHARACTER7", this.character7);
            poObject.put("P_CHARACTER8", this.character8);
            poObject.put("P_CHARACTER9", this.character9);
            poObject.put("P_CHARACTER10", this.character10);
            poObject.put("P_CHARACTER11", this.character11);
            poObject.put("P_CHARACTER12", this.character12);
            poObject.put("P_CHARACTER13", this.character13);
            poObject.put("P_CHARACTER14", this.character14);
            poObject.put("P_CHARACTER15", this.character15);
            poObject.put("P_CHARACTER16", this.character16);
            poObject.put("P_CHARACTER17", this.character17);
            poObject.put("P_CHARACTER18", this.character18);
            poObject.put("P_CHARACTER19", this.character19);
            poObject.put("P_CHARACTER20", this.character20);
            poObject.put("P_CHARACTER21", this.character21);
            poObject.put("P_CHARACTER22", this.character22);
            poObject.put("P_CHARACTER23", this.character23);
            poObject.put("P_CHARACTER24", this.character24);
            poObject.put("P_CHARACTER25", this.character25);
            poObject.put("P_CHARACTER26", this.character26);
            poObject.put("P_CHARACTER27", this.character27);
            poObject.put("P_CHARACTER28", this.character28);
            poObject.put("P_CHARACTER29", this.character29);
            poObject.put("P_CHARACTER30", this.character30);
            poObject.put("P_METHOD_CODE", this.methodCode);


        } catch (Exception ex) {
            System.out.println("error stack:" + ex.getStackTrace());
        }
        /* String payload =
            "{  \n" + "\"P_ROWID\" : \"" + this.rowID + "\"," + "\n" + "\"P_COLLECTION_ID\" : \"" + this.collectionID +
            "\"," + "\n" + "\"P_OCCURRENCE\" : \"" + this.occurence + "\"," + "\n" + "\"P_USER_NAME\" : \"" +
            this.userName + "\"," + "\n" + "\"P_TRANSACTION_NUMBER\" : \"" + this.transactionNumber + "\"," + "\n" +
            "\"P_TXN_HEADER_ID\" : \"" + txnHeaderID + "\"," + "\n" + "\"P_ORGANIZATION_ID\" : \"" + organizationID +
            "\"," + "\n" + "\"P_PLAN_ID\" : \"" + planID + "\"," + "\n" + "\"P_SPEC_ID\" : \"" + specID + "\"," + "\n" +
            "\"P_TRANSACTION_ID\" : \"" + transactionID + "\"," + "\n" + "\"P_DEPARTMENT_ID\" : \"" + departmentID +
            "\"," + "\n" + "\"P_TO_DEPARTMENT_ID\" : \"" + toDepartmentID + "\"," + "\n" + "\"P_RESOURCE_ID\" : \"" +
            resourceID + "\"," + "\n" + "\"P_QUANTITY\" : \"" + quantity + "\"," + "\n" + "\"P_ITEM_NAME\" : \"" +
            itemName + "\"," + "\n" + "\"P_UOM\" : \"" + uom + "\"," + "\n" + "\"P_REVISION\" : \"" + revision + "\"," +
            "\n" + "\"P_SUBINVENTORY\" : \"" + quantity + "\"," + "\n" + "\"P_LOCATOR_ID\" : \"" + locatorID + "\"," +
            "\n" + "\"P_LOT_NUMBER\" : \"" + lotNumber + "\"," + "\n" + "\"P_SERIAL_NUMBER\" : \"" + serialNumber +
            "\"," + "\n" + "\"P_COMP_ITEM_ID\" : \"" + compItemID + "\"," + "\n" + "\"P_COMP_UOM\" : \"" + compUOM +
            "\"," + "\n" + "\"P_COMP_REVISION\" : \"" + compRevision + "\"," + "\n" + "\"P_COMP_SUBINVENTORY\" : \"" +
            compSubinventory + "\"," + "\n" + "\"P_COMP_LOCATOR_ID\" : \"" + compLocatorID + "\"," + "\n" +
            "\"P_COMP_LOT_NUMBER\" : \"" + compLotNumber + "\"," + "\n" + "\"P_COMP_SERIAL_NUMBER\" : \"" +
            compSerialNumber + "\"," + "\n" + "\"P_WIP_ENTITY_ID\" : \"" + wipEntityID + "\"," + "\n" +
            "\"P_LINE_ID\" : \"" + lineID + "\"," + "\n" + "\"P_TO_OP_SEQ_NUM\" : \"" + toOpSeqNum + "\"," + "\n" +
            "\"P_FROM_OP_SEQ_NUM\" : \"" + fromOpSeqNum + "\"," + "\n" + "\"P_VENDOR_ID\" : \"" + vendorID + "\"," +
            "\n" + "\"P_RECEIPT_NUM\" : \"" + receiptNum + "\"," + "\n" + "\"P_PO_NUMBER\" : \"" + poNumber + "\"," +
            "\n" + "\"P_PO_LINE_NUM\" : \"" + poLineNumber + "\"," + "\n" + "\"P_PO_RELEASE_ID\" : \"" + poReleaseID +
            "\"," + "\n" + "\"P_PO_SHIPMENT_NUM\" : \"" + poShipmentNum + "\"," + "\n" + "\"P_CUSTOMER_ID\" : \"" +
            customerID + "\"," + "\n" + "\"P_SO_HEADER_ID\" : \"" + soHeaderID + "\"," + "\n" +
            "\"P_RMA_HEADER_ID\" : \"" + rmaHeaderID + "\"," + "\n" + "\"P_TRANSACTION_DATE\" : \"" + transactionDate +
            "\"," + "\n" + "\"P_STATUS\" : \"" + status + "\"," + "\n" + "\"P_PROJECT_ID\" : \"" + projectID + "\"," +
            "\n" + "\"P_TASK_ID\" : \"" + taskID + "\"," + "\n" + "\"P_LPN_ID\" : \"" + lpnID + "\"," + "\n" +
            "\"P_XFR_LPN_ID\" : \"" + xfrLpnID + "\"," + "\n" + "\"P_CONTRACT_ID\" : \"" + contractID + "\"," + "\n" +
            "\"P_CONTRACT_LINE_ID\" : \"" + contractLineID + "\"," + "\n" + "\"P_DELIVERABLE_ID\" : \"" +
            deliverableID + "\"," + "\n" + "\"P_ASSET_GROUP_ID\" : \"" + assetGroupID + "\"," + "\n" +
            "\"P_ASSET_NUMBER\" : \"" + assetNumber + "\"," + "\n" + "\"P_ASSET_ACTIVITY_ID\" : \"" + assetActivityID +
            "\"," + "\n" + "\"P_FOLLOWUP_ACTIVITY_ID\" : \"" + followupActivityID + "\"," + "\n" +
            "\"P_WORK_ORDER_ID\" : \"" + workOrderID + "\"," + "\n" + "\"P_CHARACTER1\" : \"" + character1 + "\"," +
            "\n" + "\"P_CHARACTER2\" : \"" + character2 + "\"," + "\n" + "\"P_CHARACTER3\" : \"" + character3 + "\"," +
            "\n" + "\"P_CHARACTER4\" : \"" + character4 + "\"," + "\n" + "\"P_CHARACTER5\" : \"" + character5 + "\"," +
            "\n" + "\"P_CHARACTER6\" : \"" + character6 + "\"," + "\n" + "\"P_CHARACTER7\" : \"" + character7 + "\"," +
            "\n" + "\"P_CHARACTER8\" : \"" + character8 + "\"," + "\n" + "\"P_CHARACTER9\" : \"" + character9 + "\"," +
            "\n" + "\"P_CHARACTER10\" : \"" + character10 + "\"," + "\n" + "\"P_CHARACTER11\" : \"" + character11 +
            "\"," + "\n" + "\"P_CHARACTER12\" : \"" + character12 + "\"," + "\n" + "\"P_CHARACTER13\" : \"" +
            character13 + "\"," + "\n" + "\"P_CHARACTER14\" : \"" + character14 + "\"," + "\n" +
            "\"P_CHARACTER15\" : \"" + character15 + "\"," + "\n" + "\"P_CHARACTER16\" : \"" + character16 + "\"," +
            "\n" + "\"P_CHARACTER17\" : \"" + character17 + "\"," + "\n" + "\"P_CHARACTER18\" : \"" + character18 +
            "\"," + "\n" + "\"P_CHARACTER19\" : \"" + character19 + "\"," + "\n" + "\"P_CHARACTER20\" : \"" +
            character20 + "\"," + "\n" + "\"P_CHARACTER21\" : \"" + character21 + "\"," + "\n" +
            "\"P_CHARACTER22\" : \"" + character22 + "\"," + "\n" + "\"P_CHARACTER23\" : \"" + character23 + "\"," +
            "\n" + "\"P_CHARACTER24\" : \"" + character24 + "\"," + "\n" + "\"P_CHARACTER25\" : \"" + character25 +
            "\"," + "\n" + "\"P_CHARACTER26\" : \"" + character26 + "\"," + "\n" + "\"P_CHARACTER27\" : \"" +
            character27 + "\"," + "\n" + "\"P_CHARACTER28\" : \"" + character28 + "\"," + "\n" +
            "\"P_CHARACTER29\" : \"" + character29 + "\"," + "\n" + "\"P_CHARACTER30\" : \"" + character30 + "\"," +
            "\n" + "\"P_METHOD_CODE\" : \"" + methodCode + "\"\n" + "}";
*/
        payload = poObject.toString();
        System.out.println("payload is " + payload);
        String jsonArrayAsString = sm.invokeUPDATE(restURI, payload).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            String returnStatus = jsonObject.getString("P_MESSAGE_OUT");
            if (returnStatus != null)
                this.service_msg = returnStatus;

        } catch (Exception ex) {
            System.out.println("exception:" + ex.getLocalizedMessage());
            service_msg = "Exception:" + ex.getLocalizedMessage();
        }
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.message}", service_msg);
        if (service_msg != null) {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.showMessage}", "Y");
        } else {
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.showMessage}", "N");
        }


    }

    public void create(ActionEvent actionEvent) throws JSONException {
        // Add event code here...
        System.out.println("Inside Create Result:");
        setCreateResults();
    }
    
    

    public void updateQualityData(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("Inside updateQualityData start");
        try {
            this.itemNumber = AdfmfJavaUtilities.getELValue("#{bindings.itemNumber.inputValue}").toString();
            if (this.itemNumber == null || this.itemNumber.length() == 0)
                this.itemNumber = "-999";

            System.out.println("itemNumber" + itemNumber);
            this.collectionID = AdfmfJavaUtilities.getELValue("#{bindings.collectionId.inputValue}").toString();
            if (this.collectionID == null || this.collectionID.length() == 0)
                this.collectionID = "-999";

            System.out.println("collectionID" + collectionID);

            this.transactionNumber = "-999";
            this.rowID = "-999";

            this.occurence = AdfmfJavaUtilities.getELValue("#{bindings.occurrence.inputValue}").toString();
            if (this.occurence == null || this.occurence.length() == 0)
                this.occurence = "-999";

            System.out.println("occurence" + occurence);

            this.userName = AdfmfJavaUtilities.getELValue("#{securityContext.userName}").toString();
            System.out.println("userName" + userName);

            this.txnHeaderID = AdfmfJavaUtilities.getELValue("#{bindings.txnHeaderId.inputValue}").toString();
            if (txnHeaderID == null || txnHeaderID.length() == 0)
                txnHeaderID = "-999";
            System.out.println("txnHeaderID" + txnHeaderID);


            this.organizationID = AdfmfJavaUtilities.getELValue("#{bindings.organizationId.inputValue}").toString();
            if (organizationID == null || organizationID.length() == 0)
                organizationID = "-999";
            System.out.println("organizationID" + organizationID);


            this.planID = AdfmfJavaUtilities.getELValue("#{bindings.planId.inputValue}").toString();
            if (planID == null || planID.length() == 0)
                planID = "-999";
            System.out.println("planID" + planID);


            this.specID = AdfmfJavaUtilities.getELValue("#{bindings.specId.inputValue}").toString();
            if (specID == null || specID.length() == 0)
                specID = "-999";
            System.out.println("specID" + specID);


            this.transactionID = "-999";
            this.departmentID = "-999";
            this.toDepartmentID = "-999";
            this.resourceID = "-999";

            this.quantity = AdfmfJavaUtilities.getELValue("#{bindings.quantity.inputValue}").toString();
            if (quantity == null || quantity.length() == 0)
                quantity = "-999";
            System.out.println("quantity" + quantity);


            this.itemName = "-999";
            this.uom = "-999";
            this.revision = "-999";
            this.subinventory = "-999";
            this.locatorID = "-999";

            this.lotNumber = AdfmfJavaUtilities.getELValue("#{bindings.lotNumber.inputValue}").toString();
            if (lotNumber == null || lotNumber.length() == 0 || lotNumber.equals("0"))
                lotNumber = "-999";
            System.out.println("lotNumber" + lotNumber);


            this.serialNumber = "-999";
            this.compItemID = "-999";
            this.compUOM = "-999";
            this.compRevision = "-999";
            this.compSubinventory = "-999";
            this.compLocatorID = "-999";
            this.compLotNumber = "-999";
            this.compSerialNumber = "-999";
            this.wipEntityID = "-999";
            this.lineID = "-999";
            this.toOpSeqNum = "-999";
            this.fromOpSeqNum = "-999";
            this.vendorID = "-999";
            this.receiptNum = "-999";

            this.poNumber = AdfmfJavaUtilities.getELValue("#{bindings.poNumber.inputValue}").toString();
            if (poNumber == null || poNumber.length() == 0 || poNumber.equals("0"))
                poNumber = "-999";
            System.out.println("poNumber" + poNumber);

            this.poLineNumber = "-999";
            this.poReleaseID = "-999";
            this.poShipmentNum = "-999";
            this.customerID = "-999";
            this.soHeaderID = "-999";
            this.rmaHeaderID = "-999";
            this.transactionDate = "-999";
            this.status = "-999";
            this.projectID = "-999";
            this.taskID = "-999";
            this.lpnID = "-999";
            this.xfrLpnID = "-999";
            this.contractID = "-999";
            this.contractLineID = "-999";
            this.deliverableID = "-999";
            this.assetGroupID = "-999";

            this.assetNumber = "-999";
            this.assetActivityID = "-999";
            this.followupActivityID = "-999";
            this.workOrderID = "-999";

            this.character1 = AdfmfJavaUtilities.getELValue("#{bindings.character1.inputValue}").toString();
            if (character1 == null || character1.length() == 0)
                character1 = "-999";
            this.character2 = AdfmfJavaUtilities.getELValue("#{bindings.character2.inputValue}").toString();
            if (character2 == null || character2.length() == 0)
                character2 = "-999";
            this.character3 = AdfmfJavaUtilities.getELValue("#{bindings.character3.inputValue}").toString();
            if (character3 == null || character3.length() == 0)
                character3 = "-999";
            this.character4 = AdfmfJavaUtilities.getELValue("#{bindings.character4.inputValue}").toString();
            if (character4 == null || character4.length() == 0)
                character4 = "-999";

            this.character5 = AdfmfJavaUtilities.getELValue("#{bindings.character5.inputValue}").toString();
            if (character5 == null || character5.length() == 0)
                character5 = "-999";

            this.character6 = AdfmfJavaUtilities.getELValue("#{bindings.character6.inputValue}").toString();
            if (character6 == null || character6.length() == 0)
                character6 = "-999";

            this.character7 = AdfmfJavaUtilities.getELValue("#{bindings.character7.inputValue}").toString();
            if (character7 == null || character7.length() == 0)
                character7 = "-999";
            this.character8 = AdfmfJavaUtilities.getELValue("#{bindings.character8.inputValue}").toString();
            if (character8 == null || character8.length() == 0)
                character8 = "-999";
            this.character9 = AdfmfJavaUtilities.getELValue("#{bindings.character9.inputValue}").toString();
            if (character9 == null || character9.length() == 0)
                character9 = "-999";
            this.character10 = AdfmfJavaUtilities.getELValue("#{bindings.character10.inputValue}").toString();
            if (character10 == null || character10.length() == 0)
                character10 = "-999";
            this.character11 = AdfmfJavaUtilities.getELValue("#{bindings.character11.inputValue}").toString();
            if (character11 == null || character11.length() == 0)
                character11 = "-999";
            this.character12 = AdfmfJavaUtilities.getELValue("#{bindings.character12.inputValue}").toString();
            if (character12 == null || character12.length() == 0)
                character12 = "-999";
            this.character13 = AdfmfJavaUtilities.getELValue("#{bindings.character13.inputValue}").toString();
            if (character13 == null || character13.length() == 0)
                character13 = "-999";
            this.character14 = AdfmfJavaUtilities.getELValue("#{bindings.character14.inputValue}").toString();
            if (character14 == null || character14.length() == 0)
                character14 = "-999";
            this.character15 = AdfmfJavaUtilities.getELValue("#{bindings.character15.inputValue}").toString();
            if (character15 == null || character15.length() == 0)
                character15 = "-999";
            this.character16 = AdfmfJavaUtilities.getELValue("#{bindings.character16.inputValue}").toString();
            if (character16 == null || character16.length() == 0)
                character16 = "-999";
            this.character17 = AdfmfJavaUtilities.getELValue("#{bindings.character17.inputValue}").toString();
            if (character17 == null || character17.length() == 0)
                character17 = "-999";
            this.character18 = AdfmfJavaUtilities.getELValue("#{bindings.character18.inputValue}").toString();
            if (character18 == null || character18.length() == 0)
                character18 = "-999";
            this.character19 = AdfmfJavaUtilities.getELValue("#{bindings.character19.inputValue}").toString();
            if (character19 == null || character19.length() == 0)
                character19 = "-999";
            this.character20 = AdfmfJavaUtilities.getELValue("#{bindings.character20.inputValue}").toString();
            if (character20 == null || character20.length() == 0)
                character20 = "-999";
            this.character21 = AdfmfJavaUtilities.getELValue("#{bindings.character21.inputValue}").toString();
            if (character21 == null || character21.length() == 0)
                character21 = "-999";
            this.character22 = AdfmfJavaUtilities.getELValue("#{bindings.character22.inputValue}").toString();
            if (character22 == null || character22.length() == 0)
                character22 = "-999";
            this.character23 = AdfmfJavaUtilities.getELValue("#{bindings.character23.inputValue}").toString();
            if (character23 == null || character23.length() == 0)
                character23 = "-999";
            this.character24 = AdfmfJavaUtilities.getELValue("#{bindings.character24.inputValue}").toString();
            if (character24 == null || character24.length() == 0)
                character24 = "-999";
            this.character25 = AdfmfJavaUtilities.getELValue("#{bindings.character25.inputValue}").toString();
            if (character25 == null || character25.length() == 0)
                character25 = "-999";
            this.character26 = AdfmfJavaUtilities.getELValue("#{bindings.character26.inputValue}").toString();
            if (character26 == null || character26.length() == 0)
                character26 = "-999";
            this.character27 = AdfmfJavaUtilities.getELValue("#{bindings.character27.inputValue}").toString();
            if (character27 == null || character27.length() == 0)
                character27 = "-999";
            this.character28 = AdfmfJavaUtilities.getELValue("#{bindings.character28.inputValue}").toString();
            if (character28 == null || character28.length() == 0)
                character28 = "-999";
            this.character29 = AdfmfJavaUtilities.getELValue("#{bindings.character29.inputValue}").toString();
            if (character29 == null || character29.length() == 0)
                character29 = "-999";
            this.character30 = AdfmfJavaUtilities.getELValue("#{bindings.character30.inputValue}").toString();
            if (character30 == null || character30.length() == 0)
                character30 = "-999";

            this.methodCode = "UPDATE";
            invokeService();
        } catch (Exception ex) {
            System.out.println("error stack:" + ex.getStackTrace());
        }
        System.out.println("Inside updateQualityData end");
    }
}
