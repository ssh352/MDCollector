/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcForQuoteField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setForQuoteLocalID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteLocalID_set(swigCPtr, this, value);
  }

  public String getForQuoteLocalID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setForQuoteStatus(char value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteStatus_set(swigCPtr, this, value);
  }

  public char getForQuoteStatus() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ForQuoteStatus_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerForQutoSeq(int value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_BrokerForQutoSeq_set(swigCPtr, this, value);
  }

  public int getBrokerForQutoSeq() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_BrokerForQutoSeq_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcForQuoteField(), true);
  }

}
