/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcSecAgentCheckModeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSecAgentCheckModeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSecAgentCheckModeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcSecAgentCheckModeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_BrokerID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public void setCheckSelfAccount(int value) {
    ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_CheckSelfAccount_set(swigCPtr, this, value);
  }

  public int getCheckSelfAccount() {
    return ctpapiv6v3v11JNI.CThostFtdcSecAgentCheckModeField_CheckSelfAccount_get(swigCPtr, this);
  }

  public CThostFtdcSecAgentCheckModeField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcSecAgentCheckModeField(), true);
  }

}
