/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcRspQueryTradeResultBySerialField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRspQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspQueryTradeResultBySerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcRspQueryTradeResultBySerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_get(swigCPtr, this);
  }

  public void setReference(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
  }

  public int getReference() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
  }

  public void setRefrenceIssureType(char value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
  }

  public char getRefrenceIssureType() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
  }

  public void setRefrenceIssure(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
  }

  public String getRefrenceIssure() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
  }

  public void setOriginReturnCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginReturnCode() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_get(swigCPtr, this);
  }

  public void setOriginDescrInfoForReturnCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginDescrInfoForReturnCode() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpapiv6v3v11JNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcRspQueryTradeResultBySerialField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcRspQueryTradeResultBySerialField(), true);
  }

}
