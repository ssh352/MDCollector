/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcSyncingInstrumentTradingRightField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentTradingRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcSyncingInstrumentTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingRight(char value) {
    ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_set(swigCPtr, this, value);
  }

  public char getTradingRight() {
    return ctpapiv6v3v11JNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentTradingRightField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcSyncingInstrumentTradingRightField(), true);
  }

}
