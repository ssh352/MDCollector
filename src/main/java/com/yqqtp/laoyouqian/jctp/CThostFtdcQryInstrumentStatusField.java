/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryInstrumentStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentStatusField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryInstrumentStatusField(), true);
  }

}