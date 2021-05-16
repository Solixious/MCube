package com.stockinfo.mcube.enums;

public enum Interval {

  MIN_1("1min"),
  MIN_5("5min"),
  MIN_15("15min"),
  MIN_30("30min"),
  MIN_60("60min");

  private String interval;

  Interval(final String size) {
    this.interval = size;
  }

  public String getInterval() {
    return this.interval;
  }
}
