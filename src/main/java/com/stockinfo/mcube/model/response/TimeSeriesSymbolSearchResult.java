package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeSeriesSymbolSearchResult {

  @JsonSetter("1. symbol")
  private String symbol;

  @JsonSetter("2. name")
  private String name;

  @JsonSetter("3. type")
  private String type;

  @JsonSetter("4. region")
  private String region;

  @JsonSetter("5. marketOpen")
  private String marketOpen;

  @JsonSetter("6. marketClose")
  private String marketClose;

  @JsonSetter("7. timezone")
  private String timeZone;

  @JsonSetter("8. currency")
  private String currency;

  @JsonSetter("9. matchScore")
  private String matchScore;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getMarketOpen() {
    return marketOpen;
  }

  public void setMarketOpen(String marketOpen) {
    this.marketOpen = marketOpen;
  }

  public String getMarketClose() {
    return marketClose;
  }

  public void setMarketClose(String marketClose) {
    this.marketClose = marketClose;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(String matchScore) {
    this.matchScore = matchScore;
  }
}
