/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryProductField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    ctpapiv6v3v11JNI.CThostFtdcQryProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return ctpapiv6v3v11JNI.CThostFtdcQryProductField_ProductClass_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryProductField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryProductField(), true);
  }

}
