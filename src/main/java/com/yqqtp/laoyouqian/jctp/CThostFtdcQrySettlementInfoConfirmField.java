/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQrySettlementInfoConfirmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQrySettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySettlementInfoConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQrySettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySettlementInfoConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQrySettlementInfoConfirmField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQrySettlementInfoConfirmField(), true);
  }

}
