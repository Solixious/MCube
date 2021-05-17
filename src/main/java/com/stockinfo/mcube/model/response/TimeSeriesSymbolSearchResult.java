package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
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
}
