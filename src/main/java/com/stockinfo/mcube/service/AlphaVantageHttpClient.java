package com.stockinfo.mcube.service;

import com.stockinfo.mcube.model.properties.AlphaVantageProperties;
import com.stockinfo.mcube.model.request.AlphaVantageRequest;
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

  public Object getAlphaVantageResponse(AlphaVantageRequest request, Class clasz) {
    request.setApiKey(alphaVantageProperties.getApiKey());
    Object response =  alphaVantageWebClient.get().uri("/query?" + request).retrieve()
        .bodyToMono(clasz).block();
    return response;
  }
}
