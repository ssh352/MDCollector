/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQrySyncDelaySwapField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQrySyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySyncDelaySwapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQrySyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setDelaySwapSeqNo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return ctpapiv6v3v11JNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public CThostFtdcQrySyncDelaySwapField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQrySyncDelaySwapField(), true);
  }

}
