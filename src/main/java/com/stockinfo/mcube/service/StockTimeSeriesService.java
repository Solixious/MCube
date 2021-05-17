package com.stockinfo.mcube.service;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.model.request.AlphaVantageRequest;
import com.stockinfo.mcube.model.response.AlphaVantageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTimeSeriesService {

  @Autowired
  private AlphaVantageHttpClient alphaVantageHttpClient;

  public AlphaVantageResponse intraDay(final AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_INTRADAY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse daily(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse dailyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse weekly(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse weeklyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse monthly(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse monthlyAdjusted(AlphaVantageRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY_ADJUSTED);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse quote(AlphaVantageRequest request) {
    request.setFunction(Function.GLOBAL_QUOTE);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }

  public AlphaVantageResponse search(AlphaVantageRequest request) {
    request.setFunction(Function.SYMBOL_SEARCH);
    return alphaVantageHttpClient.getTimeSeriesResponseMono(request);
  }
}
