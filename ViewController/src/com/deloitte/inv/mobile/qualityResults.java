package com.deloitte.inv.mobile;

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

        if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDate}") == null ) {
            System.out.println("Date : is null");
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", "-999");
            System.out.println("Date :"+AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDate}").toString());
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
      /*  if (AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDate}") != null &&
            AdfmfJavaUtilities.getELValue("#{pageFlowScope.selectedDate}").toString().equals("-999")) {
            System.out.println("Date : setting to null");
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", null);
        }
*/
    }

    public void dateSelected(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getNewValue();
        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat destinationFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
        try {
            date = sourceFormat.parse(valueChangeEvent.getNewValue().toString());
            System.out.println(date);
            System.out.println(destinationFormat.format(date));
            AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedDate}", destinationFormat.format(date));

            System.out.println("Date : " + destinationFormat.format(date));
        } catch (Exception ex) {
            System.out.println("Error " + ex.getLocalizedMessage());
        }
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
}
