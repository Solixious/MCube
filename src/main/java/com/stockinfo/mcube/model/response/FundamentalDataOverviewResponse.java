package com.stockinfo.mcube.model.response;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
public class FundamentalDataOverviewResponse {

  @JsonSetter("Symbol")
  private String symbol;

  @JsonSetter("AssetType")
  private String assetType;

  @JsonSetter("Name")
  private String name;

  @JsonSetter("Description")
  private String description;

  @JsonSetter("CIK")
  private String cik;

  @JsonSetter("Exchange")
  private String exchange;

  @JsonSetter("Currency")
  private String currency;

  @JsonSetter("Country")
  private String country;

  @JsonSetter("Sector")
  private String sector;

  @JsonSetter("Industry")
  private String industry;

  @JsonSetter("Address")
  private String address;

  @JsonSetter("FullTimeEmployees")
  private String fullTimeEmployees;

  @JsonSetter("FiscalYearEnd")
  private String fiscalYearEnd;

  @JsonSetter("LatestQuarter")
  private String latestQuarter;

  @JsonSetter("MarketCapitalization")
  private String marketCapitalization;

  @JsonSetter("EBITDA")
  private String ebitda;

  @JsonSetter("PERatio")
  private String peRatio;

  @JsonSetter("PEGRatio")
  private String pegRatio;

  @JsonSetter("BookValue")
  private String bookValue;

  @JsonSetter("DividendPerShare")
  private String dividendPerShare;

  @JsonSetter("DividendYield")
  private String dividendYield;

  @JsonSetter("EPS")
  private String eps;

  @JsonSetter("RevenuePerShareTTM")
  private String revenuePerShareTtm;

  @JsonSetter("ProfitMargin")
  private String profitMargin;

  @JsonSetter("OperatingMarginTTM")
  private String operatingMarginTtm;

  @JsonSetter("ReturnOnAssetsTTM")
  private String returnOnAssetsTtm;

  @JsonSetter("ReturnOnEquityTTM")
  private String returnOnEquityTtm;

  @JsonSetter("RevenueTTM")
  private String revenueTtm;

  @JsonSetter("GrossProfitTTM")
  private String grossProfitTtm;

  @JsonSetter("DilutedEPSTTM")
  private String dilutedEpsTtm;
  
  @JsonSetter("QuarterlyEarningsGrowthYOY")
  private String quarterlyEarningsGrowthYoy;

  @JsonSetter("QuarterlyRevenueGrowthYOY")
  private String quarterlyRevenueGrowthYoy;

  @JsonSetter("AnalystTargetPrice")
  private String analystTargetPrice;

  @JsonSetter("TrailingPE")
  private String trailingPe;

  @JsonSetter("ForwardPE")
  private String forwardPe;

  @JsonSetter("PriceToSalesRatioTTM")
  private String priceToSalesRatioTtm;

  @JsonSetter("PriceToBookRatio")
  private String priceToBookRatio;

  @JsonSetter("EVToRevenue")
  private String evToRevenue;

  @JsonSetter("EVToEBITDA")
  private String evToBitda;

  @JsonSetter("Beta")
  private String beta;

  @JsonSetter("52WeekHigh")
  private String fiftyTwoWeekHigh;

  @JsonSetter("52WeekLow")
  private String fiftyTwoWeekLow;

  @JsonSetter("50DayMovingAverage")
  private String fiftyDayMovingAverage;

  @JsonSetter("200DayMovingAverage")
  private String twoHundredDayMovingAverage;

  @JsonSetter("SharesOutstanding")
  private String sharesOutstanding;

  @JsonSetter("SharesFloat")
  private String sharesFloat;

  @JsonSetter("SharesShort")
  private String sharesShort;

  @JsonSetter("SharesShortPriorMonth")
  private String sharesShortPriorMonth;

  @JsonSetter("ShortRatio")
  private String shortRatio;

  @JsonSetter("ShortPercentOutstanding")
  private String shortPercentOutstanding;

  @JsonSetter("ShortPercentFloat")
  private String shortPercentFloat;

  @JsonSetter("PercentInsiders")
  private String percentInsiders;

  @JsonSetter("PercentInstitutions")
  private String percentInstitutions;

  @JsonSetter("ForwardAnnualDividendRate")
  private String forwardAnnualDividendRate;

  @JsonSetter("ForwardAnnualDividendYield")
  private String forwardAnnualDividendYield;

  @JsonSetter("PayoutRatio")
  private String payoutRatio;

  @JsonSetter("DividendDate")
  private String dividendDate;

  @JsonSetter("ExDividendDate")
  private String exDividendDate;

  @JsonSetter("LastSplitFactor")
  private String lastSplitFactor;

  @JsonSetter("LastSplitDate")
  private String lastSplitDate;
}
