package com.deloitte.inv.mobile;

import java.util.ArrayList;
import java.util.List;

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
        List pnames = new ArrayList();
        List params = new ArrayList();
        List ptypes = new ArrayList();
        try {
        AdfmfJavaUtilities.invokeDataControlMethod("QualityPlandetailsOutputService", null, "findAllQualityPlandetailsOutputRemote", pnames, params, ptypes);
            AdfmfJavaUtilities.flushDataChangeEvent();
                     //   providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");     
        } catch (Exception e) {
                    e.getMessage();
                }
        System.out.println("Org passed : "+valueChangeEvent.getNewValue());
    }
    public void lovSelected(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        valueChangeEvent.getNewValue();
        AdfmfJavaUtilities.setELValue("#{pageFlowScope.selectedLov}", valueChangeEvent.getNewValue());
        //providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");
        List pnames = new ArrayList();
        List params = new ArrayList();
        List ptypes = new ArrayList();
        try {
        AdfmfJavaUtilities.invokeDataControlMethod("QualityResultsDBOutputService", null, "findAllQualityResultsDBOutputRemote", pnames, params, ptypes);
            AdfmfJavaUtilities.flushDataChangeEvent();
                     //   providerChangeSupport.fireProviderRefresh("qualityResultsDBOutput");     
        } catch (Exception e) {
                    e.getMessage();
                }
        System.out.println("Plan 1234 : "+valueChangeEvent.getNewValue());
    }
    private transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this); 
    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
        }
        public void removeProviderChangeListener(ProviderChangeListener l) {
            providerChangeSupport.removeProviderChangeListener(l);
            }
}
