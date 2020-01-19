
public class Historics {
	
	String currencyName;
	String date;
	String monthStr;
	int day;
	int month;
	int year;
	double priceOpen;
	double priceClose;
	double dayHigh;
	double dayLow;
	double volumeTraded;
	double marketCap;

	public Historics(String currencyName, String date, String priceOpen, String priceClose, String dayHigh, String dayLow, String volumeTradedUSD, String marketCapUSD) {
	setCurrencyName(currencyName);
	parseDate(date);
	setPriceOpen(priceOpen);
	setPriceClose(priceClose);
	setDayHigh(dayHigh);
	setDayLow(dayLow);
	setVolumeTraded(volumeTradedUSD);
	setMarketCap(marketCapUSD);
	}
	
	//////////// PARSER
	
	public void parseDate(String dateString) {
		String date [] = dateString.split("");
		String month = "";
		String year = "";
		String day = "";
		for(int i = 0; i < date.length; i++) {
			if(i < 3) {
				month+= date[i];
			} else if((i > 3)&&(i < 6)){
				day+= date[i];
			}else if(i > 7) {
				year+= date[i];
			}
		}
		setDate(dateString);
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	//////////// SETTERS
	
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDay(String stringDay) {
		int day = Integer.parseInt(stringDay.trim());
		this.day = day;
	}
	public void setMonth(String month) {
		this.monthStr = month;
		if(monthStr.equals("Jan")) {
			this.month = 1;
		} else if(monthStr.equals("Feb")) {
			this.month = 2;
		} else if(monthStr.equals("Mar")) {
			this.month = 3;
		} else if(monthStr.equals("Apr")) {
			this.month = 4;
		} else if(monthStr.equals("May")) {
			this.month = 5;
		} else if(monthStr.equals("Jun")) {
			this.month = 6;
		} else if(monthStr.equals("Jul")) {
			this.month = 7;
		} else if(monthStr.equals("Aug")) {
			this.month = 8;
		} else if(monthStr.equals("Sep")) {
			this.month = 9;
		} else if(monthStr.equals("Oct")) {
			this.month = 10;
		} else if(monthStr.equals("Nov")) {
			this.month = 11;
		} else if(monthStr.equals("Dec")) {
			this.month = 12;
		}
	}
	public void setYear(String stringYear) {
		int year = Integer.parseInt(stringYear);
		this.year = year;
	}
	public void setPriceOpen(String stringPriceOpen) {
		double priceOpen = Double.parseDouble(stringPriceOpen.replace(",", "."));
		this.priceOpen = priceOpen;
	}
	public void setPriceClose(String strignPriceClose) {
		double priceClose = Double.parseDouble(strignPriceClose.replace(",", "."));
		this.priceClose = priceClose;
	}
	public void setDayHigh(String stringDayHigh) {
		double dayHigh = Double.parseDouble(stringDayHigh.replace(",", "."));
		this.dayHigh = dayHigh;
	}
	public void setDayLow(String stringDayLow) {
		double dayLow = Double.parseDouble(stringDayLow.replace(",", "."));
		this.dayLow = dayLow;
	}
	public void setVolumeTraded(String stringVolumeTraded) {
		double volumeTraded = Double.parseDouble(stringVolumeTraded.replace(",", ""));
		this.volumeTraded = volumeTraded;
	}
	public void setMarketCap(String stringMarketCap) {
		int marketCap = Integer.parseInt(stringMarketCap.replace(",", ""));
		this.marketCap = marketCap;
	}
	
	//////////// GETTERS

	public String getCurrencyName() {
		return currencyName;
	}
	public String getDate() {
		return date;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public String getMonthStr() {
		return monthStr;
	}
	public int getYear() {
		return year;
	}
	public double getPriceOpen() {
		return priceOpen;
	}
	public double getPriceClose() {
		return priceClose;
	}
	public double getDayHigh() {
		return dayHigh;
	}
	public double getDayLow() {
		return dayLow;
	}
	public double getVolumeTraded() {
		return volumeTraded;
	}
	public double getMarketCap() {
		return marketCap;
	}	


	public String toString() {
		String result = "Currency name: "+getCurrencyName();
		result+="\nDate: "+getDate();
		result+="\nDay: "+getDay();
		result+="\nMonth: "+getMonth();
		result+="\nYear: "+getYear();
		result+="\nOpens at: "+getPriceOpen();
		result+="$\nCloses at: "+getPriceClose();
		result+="$\nHighest at: "+getDayHigh();
		result+="$\nLowest at: "+getDayLow();
		result+="$\nVolume Traded: "+getVolumeTraded();
		result+="$\nMarket Cap: "+getMarketCap()+"\n\n";
		return result;
	}
}
