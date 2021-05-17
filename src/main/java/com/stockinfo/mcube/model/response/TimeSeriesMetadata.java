package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
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
}
