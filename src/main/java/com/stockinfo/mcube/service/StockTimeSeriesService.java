package com.stockinfo.mcube.service;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.model.request.AlphaVantageRequest;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTimeSeriesService {

  @Autowired
  private AlphaVantageHttpClient alphaVantageHttpClient;

  public TimeSeriesResponse intraDay(final AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_INTRADAY);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse daily(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse dailyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY_ADJUSTED);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse weekly(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse weeklyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY_ADJUSTED);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse monthly(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse monthlyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY_ADJUSTED);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse quote(AlphaVantageRequest request) {
    request.setFunction(Function.GLOBAL_QUOTE);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse search(AlphaVantageRequest request) {
    request.setFunction(Function.SYMBOL_SEARCH);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }
}
