package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
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
}
