/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcManualSyncBrokerUserOTPField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcManualSyncBrokerUserOTPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcManualSyncBrokerUserOTPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcManualSyncBrokerUserOTPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_get(swigCPtr, this);
  }

  public void setFirstOTP(String value) {
    ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_set(swigCPtr, this, value);
  }

  public String getFirstOTP() {
    return ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_get(swigCPtr, this);
  }

  public void setSecondOTP(String value) {
    ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_set(swigCPtr, this, value);
  }

  public String getSecondOTP() {
    return ctpapiv6v3v11JNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_get(swigCPtr, this);
  }

  public CThostFtdcManualSyncBrokerUserOTPField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcManualSyncBrokerUserOTPField(), true);
  }

}
