/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcOptionSelfCloseField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionSelfCloseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InstrumentID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SettlementID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerOptionSelfCloseSeq(int value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BrokerOptionSelfCloseSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOptionSelfCloseSeq() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BrokerOptionSelfCloseSeq_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcOptionSelfCloseField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcOptionSelfCloseField(), true);
  }

}
