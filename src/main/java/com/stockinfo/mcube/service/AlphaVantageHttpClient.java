package com.stockinfo.mcube.service;

import com.stockinfo.mcube.model.properties.AlphaVantageProperties;
import com.stockinfo.mcube.model.request.TimeSeriesRequest;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AlphaVantageHttpClient {

  @Autowired
  private AlphaVantageProperties alphaVantageProperties;

  @Autowired
  private WebClient alphaVantageWebClient;

  public TimeSeriesResponse getTimeSeriesResponseMono(TimeSeriesRequest request) {
    request.setApiKey(alphaVantageProperties.getApiKey());
    Mono<TimeSeriesResponse> response =
        alphaVantageWebClient.get().uri("/query?" + request).retrieve()
            .bodyToMono(TimeSeriesResponse.class);
    return response.block();
  }
}
