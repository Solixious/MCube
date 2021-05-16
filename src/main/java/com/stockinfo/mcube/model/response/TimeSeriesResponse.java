package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;
import java.util.Map;

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

  public TimeSeriesMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TimeSeriesMetadata metadata) {
    this.metadata = metadata;
  }

  public Map<String, TimeSeriesEntry> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(Map<String, TimeSeriesEntry> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TimeSeriesGlobalQuote getGlobalQuote() {
    return globalQuote;
  }

  public void setGlobalQuote(TimeSeriesGlobalQuote globalQuote) {
    this.globalQuote = globalQuote;
  }

  public List<TimeSeriesSymbolSearchResult> getSymbolSearchResults() {
    return symbolSearchResults;
  }

  public void setSymbolSearchResults(List<TimeSeriesSymbolSearchResult> symbolSearchResults) {
    this.symbolSearchResults = symbolSearchResults;
  }
}
