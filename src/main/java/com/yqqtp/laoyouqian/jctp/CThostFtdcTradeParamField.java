/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcTradeParamField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradeParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcTradeParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradeParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcTradeParamField_BrokerID_get(swigCPtr, this);
  }

  public void setTradeParamID(char value) {
    ctpapiv6v3v11JNI.CThostFtdcTradeParamField_TradeParamID_set(swigCPtr, this, value);
  }

  public char getTradeParamID() {
    return ctpapiv6v3v11JNI.CThostFtdcTradeParamField_TradeParamID_get(swigCPtr, this);
  }

  public void setTradeParamValue(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradeParamField_TradeParamValue_set(swigCPtr, this, value);
  }

  public String getTradeParamValue() {
    return ctpapiv6v3v11JNI.CThostFtdcTradeParamField_TradeParamValue_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradeParamField_Memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return ctpapiv6v3v11JNI.CThostFtdcTradeParamField_Memo_get(swigCPtr, this);
  }

  public CThostFtdcTradeParamField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcTradeParamField(), true);
  }

}
