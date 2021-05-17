package com.stockinfo.mcube.model.request;

import com.stockinfo.mcube.enums.Function;
import com.stockinfo.mcube.enums.Interval;
import lombok.Data;

@Data
public class AlphaVantageRequest {

  private Function function;
  private String symbol;
  private String keywords;
  private Interval interval;
  private String apiKey;

  public String toString() {
    StringBuffer sb = new StringBuffer();
    if(function != null) {
      sb.append("function=").append(function.name());
    }
    if(symbol != null && !symbol.equals("")) {
      sb.append("&symbol=").append(symbol);
    }
    if(interval != null) {
      sb.append("&interval=").append(interval.getInterval());
    }
    if(apiKey != null && !apiKey.equals("")) {
      sb.append("&apikey=").append(apiKey);
    }
    if(keywords != null && !keywords.equals("")) {
      sb.append("&keywords=").append(keywords);
    }
    return new String(sb);


  }
}

