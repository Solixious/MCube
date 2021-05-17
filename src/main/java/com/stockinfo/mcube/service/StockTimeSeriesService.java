package com.stockinfo.mcube.service;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.model.request.TimeSeriesRequest;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTimeSeriesService {

  @Autowired
  private AlphaVantageHttpClient alphaVantageHttpClient;

  public TimeSeriesResponse intraDay(final TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_INTRADAY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse daily(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse dailyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse weekly(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse weeklyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse monthly(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse monthlyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse quote(TimeSeriesRequest request) {
    request.setFunction(Function.GLOBAL_QUOTE);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse search(TimeSeriesRequest request) {
    request.setFunction(Function.SYMBOL_SEARCH);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }
}
