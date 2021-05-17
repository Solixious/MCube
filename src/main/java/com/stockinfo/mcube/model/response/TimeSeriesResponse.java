package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TimeSeriesResponse {

  @JsonSetter("Meta Data")
  private TimeSeriesMetadata metadata;

  @JsonAlias({"Time Series (1min)",
      "Time Series (5min)",
      "Time Series (15min)",
      "Time Series (30min)",
      "Time Series (60min)",
      "Time Series (Daily)",
      "Weekly Time Series",
      "Weekly Adjusted Time Series",
      "Monthly Time Series",
      "Monthly Adjusted Time Series"
  })
  private Map<String, TimeSeriesEntry> timeSeries;

  @JsonSetter("Global Quote")
  private TimeSeriesGlobalQuote globalQuote;

  @JsonSetter("bestMatches")
  private List<TimeSeriesSymbolSearchResult> symbolSearchResults;

  @JsonSetter("Error Message")
  private String errorMessage;
}
