/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcCurrentTimeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCurrentTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrentTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcCurrentTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrDate_set(swigCPtr, this, value);
  }

  public String getCurrDate() {
    return ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrDate_get(swigCPtr, this);
  }

  public void setCurrTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrTime_set(swigCPtr, this, value);
  }

  public String getCurrTime() {
    return ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrTime_get(swigCPtr, this);
  }

  public void setCurrMillisec(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrMillisec_set(swigCPtr, this, value);
  }

  public int getCurrMillisec() {
    return ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_CurrMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return ctpapiv6v3v11JNI.CThostFtdcCurrentTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcCurrentTimeField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcCurrentTimeField(), true);
  }

}
