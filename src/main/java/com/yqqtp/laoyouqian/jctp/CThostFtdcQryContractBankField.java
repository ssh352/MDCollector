/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryContractBankField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryContractBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public CThostFtdcQryContractBankField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryContractBankField(), true);
  }

}
