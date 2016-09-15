



 
 
 



 
 
 



 
 
 



 
 
 



 
 
 


 CREATE TABLE QUALITY_RESULTS_DBOUTPUT 
(
      PLAN_NAME VARCHAR ,
      DESCRIPTION VARCHAR ,
      QUANTITY NUMERIC ,
      ITEM_NUMBER VARCHAR ,
      LOT_NUMBER VARCHAR ,
      SUPPLIER VARCHAR ,
      PO_NUMBER VARCHAR ,
      SO_NUMBER VARCHAR ,
      CUST_ACCOUNT_NUMBER VARCHAR ,
      CHARACTER1 VARCHAR ,
      CHARACTER2 VARCHAR ,
      CHARACTER3 VARCHAR ,
      CHARACTER4 VARCHAR ,
      CHARACTER5 VARCHAR ,
      CHARACTER6 VARCHAR ,
      CHARACTER7 VARCHAR ,
      CHARACTER8 VARCHAR ,
      CHARACTER9 VARCHAR ,
      CHARACTER10 VARCHAR ,
      COLLECTION_ID NUMERIC ,
      OCCURRENCE NUMERIC  NOT NULL,
      LAST_UPDATE_DATE VARCHAR ,
      QA_LAST_UPDATE_DATE VARCHAR ,
      TXN_HEADER_ID NUMERIC ,
      ORGANIZATION_ID NUMERIC ,
      PLAN_ID NUMERIC ,
      SPEC_ID NUMERIC ,
      ITEM_ID NUMERIC ,
      QA_LAST_UPDATED_BY_NAME VARCHAR ,
      QA_CREATED_BY_NAME VARCHAR ,
      QA_CREATION_DATE VARCHAR ,
      PROMPT1 VARCHAR ,
      PROMPT2 VARCHAR ,
      PROMPT3 VARCHAR ,
      PROMPT4 VARCHAR ,
      PROMPT5 VARCHAR ,
      PROMPT6 VARCHAR ,
      PROMPT7 VARCHAR ,
      PROMPT8 VARCHAR ,
      PROMPT9 VARCHAR ,
      PROMPT10 VARCHAR ,
      MF1PROMPT VARCHAR ,
      MF2PROMPT VARCHAR ,
      MF3PROMPT VARCHAR ,
      MF4PROMPT VARCHAR ,
      MF1VALUE VARCHAR ,
      MF2VALUE VARCHAR ,
      MF3VALUE VARCHAR ,
      MF4VALUE VARCHAR ,
      PROMPT11 VARCHAR ,
      PROMPT12 VARCHAR ,
      PROMPT13 VARCHAR ,
      PROMPT14 VARCHAR ,
      PROMPT15 VARCHAR ,
      PROMPT16 VARCHAR ,
      PROMPT17 VARCHAR ,
      PROMPT18 VARCHAR ,
      PROMPT19 VARCHAR ,
      PROMPT20 VARCHAR ,
      PROMPT21 VARCHAR ,
      PROMPT22 VARCHAR ,
      PROMPT23 VARCHAR ,
      PROMPT24 VARCHAR ,
      PROMPT25 VARCHAR ,
      PROMPT26 VARCHAR ,
      PROMPT27 VARCHAR ,
      PROMPT28 VARCHAR ,
      PROMPT29 VARCHAR ,
      PROMPT30 VARCHAR ,
      CHARACTER11 VARCHAR ,
      CHARACTER12 VARCHAR ,
      CHARACTER13 VARCHAR ,
      CHARACTER14 VARCHAR ,
      CHARACTER15 VARCHAR ,
      CHARACTER16 VARCHAR ,
      CHARACTER17 VARCHAR ,
      CHARACTER18 VARCHAR ,
      CHARACTER19 VARCHAR ,
      CHARACTER20 VARCHAR ,
      CHARACTER21 VARCHAR ,
      CHARACTER22 VARCHAR ,
      CHARACTER23 VARCHAR ,
      CHARACTER24 VARCHAR ,
      CHARACTER25 VARCHAR ,
      CHARACTER26 VARCHAR ,
      CHARACTER27 VARCHAR ,
      CHARACTER28 VARCHAR ,
      CHARACTER29 VARCHAR ,
      CHARACTER30 VARCHAR ,
    CONSTRAINT QUALITY_RESULTS_DBOUTPUT_PK PRIMARY KEY(OCCURRENCE)
);
  CREATE TABLE QUALITY_PLANDETAILS_OUTPUT 
(
      PLAN_NAME VARCHAR ,
      PLAN_ID NUMERIC  NOT NULL,
    CONSTRAINT QUALITY_PLANDETAILS_OUTPUT_PK PRIMARY KEY(PLAN_ID)
);
  CREATE TABLE INVENTORY_DETAIL_BSOUTPUT 
(
      ORGANIZATION_ID NUMERIC  NOT NULL,
      ORGANIZATION_CODE VARCHAR ,
    CONSTRAINT INVENTORY_DETAIL_BSOUTPUT_PK PRIMARY KEY(ORGANIZATION_ID)
);
 

CREATE TABLE DATA_SYNCH_ACTIONS 
(
      ID NUMERIC NOT NULL,
      SERVICE_CLASS_NAME VARCHAR NOT NULL,
      ENTITY_CLASS_NAME VARCHAR NOT NULL,
      JSON_PAYLOAD VARCHAR ,
      ACTION VARCHAR NOT NULL,
      DATE_CREATED DATE NOT NULL,
      DATE_LAST_SYNCH DATE NOT NULL,
      LAST_SYNCH_ERROR VARCHAR,
      CUSTOM_METHOD_NAME VARCHAR,
    CONSTRAINT DSA_PK PRIMARY KEY(SERVICE_CLASS_NAME ,ID)
);

CREATE TABLE WEB_SERVICE_CALL 
(
      ID NUMERIC  NOT NULL,
      CONNECTION VARCHAR ,
      REQUEST VARCHAR ,
      METHOD VARCHAR ,
      REQUEST_HEADERS VARCHAR ,
      DURATION NUMERIC ,
      REQUEST_PAYLOAD VARCHAR ,
      RESPONSE_PAYLOAD VARCHAR ,
      ERROR_MESSAGE VARCHAR ,
      TIMESTAMP DATE ,
    CONSTRAINT WEB_SERVICE_CALL_PK PRIMARY KEY(ID)
);
