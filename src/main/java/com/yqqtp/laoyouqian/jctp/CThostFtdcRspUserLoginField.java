/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcRspUserLoginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRspUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLoginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcRspUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return ctpapiv6v3v11JNI.CThostFtdcRspUserLoginField_INETime_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLoginField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcRspUserLoginField(), true);
  }

}
