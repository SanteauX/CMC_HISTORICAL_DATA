public class HistoricalObserver {
  
    public static void ObserveHistoricalCurrency(String url){
      try {
        int iterator = 1;
        final Document coinMarketCapCurrencies = Jsoup.connect(url).get();
        for(Element row: coinMarketCapCurrencies.select(".cmc-tab-historical-data tr"))
        {	
          if(iterator > 4) {
            String date = row.select(".cmc-table__cell--sticky.cmc-table__cell").text();
            String priceOpen = row.select(".cmc-table__cell:nth-of-type(2)").text();
            String priceClose = row.select(".cmc-table__cell:nth-of-type(3)").text();
            String dayHigh = row.select(".cmc-table__cell:nth-of-type(4)").text();
            String dayLow = row.select(".cmc-table__cell:nth-of-type(5)").text();
            String volumeTradedUSD = row.select(".cmc-table__cell:nth-of-type(6)").text();
            String marketCapUSD =  row.select(".cmc-table__cell:nth-of-type(7)").text();
          Historics Historic = new Historics("Ripple", date, priceOpen, priceClose, dayHigh, dayLow, volumeTradedUSD, marketCapUSD);
          System.out.println(Historic.toString());
            }
          iterator++;
          }
        } catch(Exception exception) {exception.printStackTrace(); }	
      }
    }
