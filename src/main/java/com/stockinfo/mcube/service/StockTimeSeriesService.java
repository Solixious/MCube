package com.stockinfo.mcube.service;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.model.properties.AlphaVantageProperties;
import com.stockinfo.mcube.model.request.TimeSeriesRequest;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StockTimeSeriesService {

  @Autowired
  private WebClient alphaVantageWebClient;

  @Autowired
  private AlphaVantageProperties alphaVantageProperties;

  public TimeSeriesResponse intraDay(final TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_INTRADAY);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse daily(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse dailyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_DAILY_ADJUSTED);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse weekly(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse weeklyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_WEEKLY_ADJUSTED);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse monthly(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse monthlyAdjusted(TimeSeriesRequest request) {
    request.setFunction(Function.TIME_SERIES_MONTHLY_ADJUSTED);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse quote(TimeSeriesRequest request) {
    request.setFunction(Function.GLOBAL_QUOTE);
    return getTimeSeriesResponseMono(request);
  }

  public TimeSeriesResponse search(TimeSeriesRequest request) {
    request.setFunction(Function.SYMBOL_SEARCH);
    return getTimeSeriesResponseFlux(request);
  }

  private TimeSeriesResponse getTimeSeriesResponseFlux(TimeSeriesRequest request) {
    request.setApiKey(alphaVantageProperties.getApiKey());
    Flux<TimeSeriesResponse> response = alphaVantageWebClient.get()
        .uri("/query?" + request)
        .retrieve()
        .bodyToFlux(TimeSeriesResponse.class);
    return response.blockFirst();
  }

  private TimeSeriesResponse getTimeSeriesResponseMono(TimeSeriesRequest request) {
    request.setApiKey(alphaVantageProperties.getApiKey());
    Mono<TimeSeriesResponse> response =
        alphaVantageWebClient.get().uri("/query?" + request).retrieve()
            .bodyToMono(TimeSeriesResponse.class);
    return response.block();
  }
}
