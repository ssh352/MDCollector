/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setContent(String value) {
    ctpapiv6v3v11JNI.CThostFtdcNoticeField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return ctpapiv6v3v11JNI.CThostFtdcNoticeField_Content_get(swigCPtr, this);
  }

  public void setSequenceLabel(String value) {
    ctpapiv6v3v11JNI.CThostFtdcNoticeField_SequenceLabel_set(swigCPtr, this, value);
  }

  public String getSequenceLabel() {
    return ctpapiv6v3v11JNI.CThostFtdcNoticeField_SequenceLabel_get(swigCPtr, this);
  }

  public CThostFtdcNoticeField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcNoticeField(), true);
  }

}
