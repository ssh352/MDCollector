/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcFutureSignIOField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcFutureSignIOField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureSignIOField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcFutureSignIOField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpapiv6v3v11JNI.CThostFtdcFutureSignIOField_TID_get(swigCPtr, this);
  }

  public CThostFtdcFutureSignIOField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcFutureSignIOField(), true);
  }

}
