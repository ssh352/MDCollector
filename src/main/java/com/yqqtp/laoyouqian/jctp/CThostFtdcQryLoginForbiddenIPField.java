/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryLoginForbiddenIPField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryLoginForbiddenIPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryLoginForbiddenIPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryLoginForbiddenIPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryLoginForbiddenIPField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcQryLoginForbiddenIPField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcQryLoginForbiddenIPField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryLoginForbiddenIPField(), true);
  }

}