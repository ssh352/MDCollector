/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcMarketDataStaticField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataStaticField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataStaticField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcMarketDataStaticField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOpenPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_LowestPrice_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_ClosePrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return ctpapiv6v3v11JNI.CThostFtdcMarketDataStaticField_CurrDelta_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataStaticField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcMarketDataStaticField(), true);
  }

}
