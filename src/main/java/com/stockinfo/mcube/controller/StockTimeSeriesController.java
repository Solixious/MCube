package com.stockinfo.mcube.controller;

import com.stockinfo.mcube.model.request.TimeSeriesRequest;
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
  public TimeSeriesResponse intraDay(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.intraDay(request);
  }

  @PostMapping("/daily")
  public TimeSeriesResponse daily(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.daily(request);
  }

  @PostMapping("/daily-adjusted")
  public TimeSeriesResponse dailyAdjusted(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.dailyAdjusted(request);
  }

  @PostMapping("/weekly")
  public TimeSeriesResponse weekly(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.weekly(request);
  }

  @PostMapping("/weekly-adjusted")
  public TimeSeriesResponse weeklyAdjusted(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.weeklyAdjusted(request);
  }

  @PostMapping("/monthly")
  public TimeSeriesResponse monthly(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.monthly(request);
  }

  @PostMapping("/monthly-adjusted")
  public TimeSeriesResponse monthlyAdjusted(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.monthlyAdjusted(request);
  }

  @PostMapping("/quote")
  public TimeSeriesResponse quote(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.quote(request);
  }

  @PostMapping(value = "/search")
  public TimeSeriesResponse search(@RequestBody TimeSeriesRequest request) {
    return stockTimeSeriesService.search(request);
  }
}
