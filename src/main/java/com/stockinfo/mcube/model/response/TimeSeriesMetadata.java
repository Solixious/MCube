package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeSeriesMetadata {

  @JsonSetter("1. Information")
  private String information;

  @JsonSetter("2. Symbol")
  private String symbol;

  @JsonSetter("3. Last Refreshed")
  private String lastRefreshed;

  @JsonSetter("4. Interval")
  private String interval;

  @JsonAlias({"4. Output Size", "5. Output Size"})
  private String outputSize;

  @JsonAlias({"4. Time Zone", "5. Time Zone", "6. Time Zone"})
  private String timeZone;

  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(String lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public String getOutputSize() {
    return outputSize;
  }

  public void setOutputSize(String outputSize) {
    this.outputSize = outputSize;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }
}
