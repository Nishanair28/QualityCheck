package com.deloitte.inv.mobile.rest;



import java.math.BigDecimal;

import java.time.Period;

public class RestURIs {
    private static final String CREATE_RESULTS_REPORT =
        "XXInsertRowDetails/XxInsertRowDetailsRS/insertRow";
    public RestURIs() {
        super();
    }
    public static String getCreateResultURI() {
           return CREATE_RESULTS_REPORT ;
       }
}
