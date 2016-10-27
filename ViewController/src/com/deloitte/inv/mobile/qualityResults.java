package com.deloitte.inv.mobile;

import com.deloitte.inv.mobile.rest.RestURIs;
import com.deloitte.inv.mobile.rest.ServiceManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.amx.event.ValueChangeEvent;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.framework.exception.AdfInvocationException;
import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;
import oracle.adfmf.json.JSONObject;
import oracle.adfmf.json.JSONArray;

public class qualityResults {
    public qualityResults() {
    }

    public void orgSelected(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        valueChangeEvent.getNewValue();
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedOrg}", valueChangeEvent.getNewValue());
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedLov}", "0");
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", null);
        List pnames = new ArrayList();
        List params = new ArrayList();
        List ptypes = new ArrayList();
        try {
            AdfmfJavaUtilities.invokeDataControlMethod("QualityPlandetailsOutputService", null,
                                                       "findAllQualityPlandetailsOutputRemote", pnames, params, ptypes);
            AdfmfJavaUtilities.flushDataChangeEvent();
            //providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Org passed : " + valueChangeEvent.getNewValue());
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.goClicked}", "false");
    }

    public void lovSelected(ValueChangeEvent valueChangeEvent) {

        valueChangeEvent.getNewValue();
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedLov}", valueChangeEvent.getNewValue());
        System.out.println("Plan 1234 : " + valueChangeEvent.getNewValue());
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.goClicked}", "false");
    }
    private transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);

    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
    }

    public void removeProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.removeProviderChangeListener(l);
    }

    public void buttonClicked(ActionEvent actionEvent) {

        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDateDisplay}") == null) {
            System.out.println("Date : is null");
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", "-999");
            System.out.println("Date :" + AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDate}").toString());
        } else {
            SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            SimpleDateFormat destinationFormat = new SimpleDateFormat("dd-MMM-yyyy");
            Date date = null;
            try {
                date =
                    sourceFormat.parse(AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDateDisplay}").toString());
                System.out.println(date);
                System.out.println(destinationFormat.format(date));

                AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", destinationFormat.format(date));
                System.out.println("Date : " + destinationFormat.format(date));
            } catch (Exception ex) {
                System.out.println("Error " + ex.getLocalizedMessage());
            }
        }

        List pnames = new ArrayList();
        List params = new ArrayList();
        List ptypes = new ArrayList();
        try {
            AdfmfJavaUtilities.invokeDataControlMethod("QualityResultsDBOutputService", null,
                                                       "findAllQualityResultsDBOutputRemote", pnames, params, ptypes);
            AdfmfJavaUtilities.flushDataChangeEvent();

            //   providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");
        } catch (Exception e) {
            e.getMessage();
        }
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.goClicked}", "true");

    }

    public void dateSelected(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getNewValue();
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDateDisplay}", valueChangeEvent.getNewValue());

        /*SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat destinationFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
        try {
            date = sourceFormat.parse(valueChangeEvent.getNewValue().toString());
            System.out.println(date);
            System.out.println(destinationFormat.format(date));

            AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDateDisplay}", destinationFormat.format(date));
            System.out.println("Date : " + destinationFormat.format(date));
        } catch (Exception ex) {
            System.out.println("Error " + ex.getLocalizedMessage());
        }
        */
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.goClicked}", "false");

    }

    public void downLinkClicked(ActionEvent actionEvent) {
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.linkShow}", null);
        System.out.println("down clicked");
    }

    public void upLinkClicked(ActionEvent actionEvent) {
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.linkShow}", "down");
        System.out.println("up clicked");
    }

    public void ApplyLink(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void itemNumberChanged(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ServiceManager sm = new ServiceManager();

        String org_id = AdfmfJavaUtilities.getELValue("#{bindings.organizationId.inputValue}").toString();
        String itemNumber = valueChangeEvent.getNewValue().toString();
        String restURI = RestURIs.getItemLov(org_id, itemNumber);

        String jsonArrayAsString = sm.invokeREAD(restURI).toString();
        System.out.println("jsonArrayAsString-->" + jsonArrayAsString);

        try {
            JSONObject jsonObject = new JSONObject(jsonArrayAsString);
            JSONArray nodeArray = jsonObject.getJSONArray("getIntemNumberDBAdapterOutput");
            int size = nodeArray.length();
            if (size > 1)
                AdfmfJavaUtilities.setELValue("#{pageFlowScope.itemValidationMessage}",
                                              "Mulitple Items found with same Number.");
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
}
