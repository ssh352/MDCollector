/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcExchangeTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcExchangeTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcExchangeTradeField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcExchangeTradeField(), true);
  }

}
