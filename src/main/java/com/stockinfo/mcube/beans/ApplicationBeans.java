package com.stockinfo.mcube.beans;

import com.stockinfo.mcube.model.properties.AlphaVantageProperties;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Component
public class ApplicationBeans {

  @Autowired
  private AlphaVantageProperties alphaVantageProperties;

  @Bean
  public WebClient alphaVantageWebClient() {

    HttpClient httpClient = HttpClient.create()
        .tcpConfiguration(client ->
            client.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, alphaVantageProperties.getConnectTimeOut())
                .doOnConnected(conn -> conn
                    .addHandlerLast(new ReadTimeoutHandler(alphaVantageProperties.getReadTimeOut()))
                    .addHandlerLast(new WriteTimeoutHandler(alphaVantageProperties.getWriteTimeOut()))));

    ClientHttpConnector connector = new ReactorClientHttpConnector(httpClient);

    WebClient webClient = WebClient.builder()
        .baseUrl(alphaVantageProperties.getBaseUrl())
        .clientConnector(connector)
        .build();
    return webClient;
  }
}
