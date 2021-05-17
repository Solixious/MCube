package com.stockinfo.mcube.controller;

import com.stockinfo.mcube.model.request.AlphaVantageRequest;
import com.stockinfo.mcube.model.response.TimeSeriesResponse;
import com.stockinfo.mcube.service.StockTimeSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockTimeSeriesController {

  @Autowired
  private StockTimeSeriesService stockTimeSeriesService;

  @PostMapping("/intra-day")
  public TimeSeriesResponse intraDay(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.intraDay(request);
  }

  @PostMapping("/daily")
  public TimeSeriesResponse daily(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.daily(request);
  }

  @PostMapping("/daily-adjusted")
  public TimeSeriesResponse dailyAdjusted(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.dailyAdjusted(request);
  }

  @PostMapping("/weekly")
  public TimeSeriesResponse weekly(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.weekly(request);
  }

  @PostMapping("/weekly-adjusted")
  public TimeSeriesResponse weeklyAdjusted(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.weeklyAdjusted(request);
  }

  @PostMapping("/monthly")
  public TimeSeriesResponse monthly(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.monthly(request);
  }

  @PostMapping("/monthly-adjusted")
  public TimeSeriesResponse monthlyAdjusted(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.monthlyAdjusted(request);
  }

  @PostMapping("/quote")
  public TimeSeriesResponse quote(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.quote(request);
  }

  @PostMapping(value = "/search")
  public TimeSeriesResponse search(@RequestBody AlphaVantageRequest request) {
    return stockTimeSeriesService.search(request);
  }
}
