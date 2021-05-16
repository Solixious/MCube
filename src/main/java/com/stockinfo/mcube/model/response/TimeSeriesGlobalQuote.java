package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeSeriesGlobalQuote {

  @JsonSetter("01. symbol")
  private String symbol;

  @JsonSetter("02. open")
  private String open;

  @JsonSetter("03. high")
  private String high;

  @JsonSetter("04. low")
  private String low;

  @JsonSetter("05. price")
  private String price;

  @JsonSetter("06. volume")
  private String volume;

  @JsonSetter("07. latest trading day")
  private String latestTradingDay;

  @JsonSetter("08. previous close")
  private String previousClose;

  @JsonSetter("09. change")
  private String change;

  @JsonSetter("10. change percent")
  private String changePercent;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getOpen() {
    return open;
  }

  public void setOpen(String open) {
    this.open = open;
  }

  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public String getLatestTradingDay() {
    return latestTradingDay;
  }

  public void setLatestTradingDay(String latestTradingDay) {
    this.latestTradingDay = latestTradingDay;
  }

  public String getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(String previousClose) {
    this.previousClose = previousClose;
  }

  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public String getChangePercent() {
    return changePercent;
  }

  public void setChangePercent(String changePercent) {
    this.changePercent = changePercent;
  }
}
