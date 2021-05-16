package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeSeriesEntry {

  @JsonSetter("1. open")
  private String open;

  @JsonSetter("2. high")
  private String high;

  @JsonSetter("3. low")
  private String low;

  @JsonSetter("4. close")
  private String close;

  @JsonSetter("5. volume")
  private String volume;

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

  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }
}
