package com.stockinfo.mcube.model.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:alpha-vantage.properties")
public class AlphaVantageProperties {

  @Value("${api.key}")
  private String apiKey;

  @Value("${api.base.url}")
  private String baseUrl;

  @Value("${api.connect-time-out}")
  private int connectTimeOut;

  @Value("${api.read-time-out}")
  private int readTimeOut;

  @Value("${api.write-time-out}")
  private int writeTimeOut;

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public int getConnectTimeOut() {
    return connectTimeOut;
  }

  public void setConnectTimeOut(int connectTimeOut) {
    this.connectTimeOut = connectTimeOut;
  }

  public int getReadTimeOut() {
    return readTimeOut;
  }

  public void setReadTimeOut(int readTimeOut) {
    this.readTimeOut = readTimeOut;
  }

  public int getWriteTimeOut() {
    return writeTimeOut;
  }

  public void setWriteTimeOut(int writeTimeOut) {
    this.writeTimeOut = writeTimeOut;
  }
}
