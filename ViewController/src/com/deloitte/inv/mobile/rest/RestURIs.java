package com.deloitte.inv.mobile.rest;



import java.math.BigDecimal;

import java.time.Period;

public class RestURIs {
    private static final String CREATE_RESULTS_REPORT =
        "XXInsertRowDetails/XxInsertRowDetailsRS/insertRow";
    private static final String ItemLOV = "XxItemNumber/XxItemNumberRS";
    private static final String uomLOV = "/XxUOM/XxUOMRS";
    private static final String deptLOV = "/XxdepartmentID/XxDepratmentIDRS";
    private static final String toDeptLOV = "/XxTodepartmentID/XxTodepartmentIDRS";
    private static final String ResIdLOV = "/XxResourceId/XxResourseIdRS";
    private static final String POHeaderIdLOV = "/XxGetPOHeaderId/XxGetPoHeaderRS";
    private static final String POLineNumLOV = "/XxGetPOLineNum/XxGetPOLineNumRS";
    private static final String custIdLOV = "/XxGetCustomerId/XxGetCustomerIdRS";
    private static final String SOHeaderIdLOV = "/XxGetSoHeaderID/XxGetSoHeaderRS";
    private static final String RMAHeaderLOV = "/XxGetRmaHeaderId/XcGetRmaHeaderRS";
    private static final String RevLOV = "/XxREVISION/XxRevisionRS";
    private static final String subinvLOV = "/XxGetSubinventory/XxGetSubInventoryRS";
	
	
    public RestURIs() {
        super();
    }
    public static String getCreateResultURI() {
           return CREATE_RESULTS_REPORT ;
       }
    
    public static String getItemLov(String org_id, String ItemNumber){
        return ItemLOV + "/" + org_id + "/" + ItemNumber;
    }
    public static String getUomLov(){
        return uomLOV + "/" + 1;
    }
	public static String getDeptLov(String org_id){
        return deptLOV + "/" + org_id  ;
    }
	public static String getToDeptLov(String orgId){
        return toDeptLOV + "/" + orgId  ;
    }
	public static String getResIdLov(String orgId){
        return ResIdLOV + "/" + orgId  ;
    }
	public static String getPOHeaderIDLov(String orgId, String poNumber){
        return POHeaderIdLOV + "/" + orgId + "/" + poNumber ;
    }
	public static String getPOLineNumLov(String poHeaderId){
        return POLineNumLOV + "/" + poHeaderId  ;
    }
	public static String getCustIdLov(){
        return custIdLOV;
    }
	public static String getSOHeaderIdLov(){
        return SOHeaderIdLOV;
    }
	public static String getRMAHeaderLov(){
        return RMAHeaderLOV;
    }
	public static String getRevIdLov(String org_id, String item_id){
        return RevLOV + "/" + item_id + "/" + org_id;
    }
        public static String getSubinvLov(String orgId, String subinvName){
    return subinvLOV + "/" + orgId + "/" + subinvName;
    }
}
