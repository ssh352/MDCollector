/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcInvestorWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcInvestorWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public CThostFtdcInvestorWithdrawAlgorithmField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcInvestorWithdrawAlgorithmField(), true);
  }

}
