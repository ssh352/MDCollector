/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcTradingNoticeInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcTradingNoticeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SendTime_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_FieldContent_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_SequenceNo_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcTradingNoticeInfoField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeInfoField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcTradingNoticeInfoField(), true);
  }

}
