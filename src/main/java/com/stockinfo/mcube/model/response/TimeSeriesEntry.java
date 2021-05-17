package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
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
}
