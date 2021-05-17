package com.stockinfo.mcube.service;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.model.request.AlphaVantageRequest;
import com.stockinfo.mcube.model.response.FundamentalDataOverviewResponse;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundamentalDataService {

  @Autowired
  private AlphaVantageHttpClient alphaVantageHttpClient;

  public FundamentalDataOverviewResponse companyOverview(AlphaVantageRequest request) {
    request.setFunction(Function.OVERVIEW);
    return (FundamentalDataOverviewResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, FundamentalDataOverviewResponse.class);
  }

  /*public TimeSeriesResponse earnings(AlphaVantageRequest request) {
    request.setFunction(Function.EARNINGS);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse incomeStatement(AlphaVantageRequest request) {
    request.setFunction(Function.INCOME_STATEMENT);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse balanceSheet(AlphaVantageRequest request) {
    request.setFunction(Function.BALANCE_SHEET);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse cashFlow(AlphaVantageRequest request) {
    request.setFunction(Function.CASH_FLOW);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse listingStatus(AlphaVantageRequest request) {
    request.setFunction(Function.LISTING_STATUS);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse earningsCalendar(AlphaVantageRequest request) {
    request.setFunction(Function.EARNINGS_CALENDAR);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }

  public TimeSeriesResponse ipoCalendar(AlphaVantageRequest request) {
    request.setFunction(Function.IPO_CALENDAR);
    return (TimeSeriesResponse) alphaVantageHttpClient.getAlphaVantageResponse(request, TimeSeriesResponse.class);
  }*/
}
