/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryProductGroupField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryProductGroupField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductGroupField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryProductGroupField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryProductGroupField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryProductGroupField_ProductID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryProductGroupField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryProductGroupField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductGroupField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryProductGroupField(), true);
  }

}
