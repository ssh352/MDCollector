/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcVerifyFuturePasswordField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcVerifyFuturePasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_SessionID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_Password_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_InstallID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_TID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcVerifyFuturePasswordField(), true);
  }

}
