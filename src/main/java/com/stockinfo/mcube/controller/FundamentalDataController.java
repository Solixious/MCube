package com.stockinfo.mcube.controller;

import com.stockinfo.mcube.model.request.AlphaVantageRequest;
import com.stockinfo.mcube.model.response.FundamentalDataOverviewResponse;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import com.stockinfo.mcube.service.FundamentalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundamentalDataController {

  @Autowired
  private FundamentalDataService fundamentalDataService;

  @PostMapping("/company-overview")
  public FundamentalDataOverviewResponse companyOverview(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.companyOverview(request);
  }

  /*@PostMapping("/earnings")
  public TimeSeriesResponse earnings(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.earnings(request);
  }

  @PostMapping("/income-statement")
  public TimeSeriesResponse incomeStatement(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.incomeStatement(request);
  }

  @PostMapping("/balance-sheet")
  public TimeSeriesResponse balanceSheet(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.balanceSheet(request);
  }

  @PostMapping("/cash-flow")
  public TimeSeriesResponse cashFlow(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.cashFlow(request);
  }

  @PostMapping("/listing-status")
  public TimeSeriesResponse listingStatus(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.listingStatus(request);
  }

  @PostMapping("/earnings-calendar")
  public TimeSeriesResponse earningsCalendar(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.earningsCalendar(request);
  }

  @PostMapping("/ipo-calendar")
  public TimeSeriesResponse ipoCalendar(@RequestBody AlphaVantageRequest request) {
    return fundamentalDataService.ipoCalendar(request);
  }*/
}
