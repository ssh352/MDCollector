/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcCombInstrumentGuardField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCombInstrumentGuardField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombInstrumentGuardField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcCombInstrumentGuardField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_InstrumentID_get(swigCPtr, this);
  }

  public void setGuarantRatio(double value) {
    ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_GuarantRatio_set(swigCPtr, this, value);
  }

  public double getGuarantRatio() {
    return ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_GuarantRatio_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombInstrumentGuardField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcCombInstrumentGuardField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcCombInstrumentGuardField(), true);
  }

}