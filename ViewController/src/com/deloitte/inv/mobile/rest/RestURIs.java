package com.deloitte.inv.mobile.rest;



import java.math.BigDecimal;

import java.time.Period;

public class RestURIs {
    private static final String CREATE_RESULTS_REPORT =
        "XXInsertRowDetails/XxInsertRowDetailsRS/insertRow";
    private static final String ItemLOV = "XxItemNumber/XxItemNumberRS";
    
    public RestURIs() {
        super();
    }
    public static String getCreateResultURI() {
           return CREATE_RESULTS_REPORT ;
       }
    
    public static String getItemLov(String org_id, String ItemNumber){
        return ItemLOV + "/" + org_id + "/" + ItemNumber;
    }
}
