/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcTransferFutureToBankReqField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTransferFutureToBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferFutureToBankReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcTransferFutureToBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpapiv6v3v11JNI.CThostFtdcTransferFutureToBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferFutureToBankReqField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcTransferFutureToBankReqField(), true);
  }

}