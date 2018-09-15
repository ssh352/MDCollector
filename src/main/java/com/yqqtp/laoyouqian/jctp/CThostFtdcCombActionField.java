/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcCombActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombActionRef(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_CombActionRef_set(swigCPtr, this, value);
  }

  public String getCombActionRef() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_CombActionRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_UserID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_MacAddress_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_ComTradeID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombActionField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcCombActionField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcCombActionField(), true);
  }

}
