/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcOptionInstrDeltaField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcOptionInstrDeltaField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrDeltaField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcOptionInstrDeltaField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_InvestorID_get(swigCPtr, this);
  }

  public void setDelta(double value) {
    ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_Delta_set(swigCPtr, this, value);
  }

  public double getDelta() {
    return ctpapiv6v3v11JNI.CThostFtdcOptionInstrDeltaField_Delta_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrDeltaField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcOptionInstrDeltaField(), true);
  }

}
