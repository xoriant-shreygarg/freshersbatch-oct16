class Date{
	private int day,month,year;
	public Date(){
		day = 11;
		month = 9;
		year = 2014;
	}
	public Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void printDate(){
		System.out.println(""+day+"-"+month+"-"+year);
	}
	public void swapDates(Date[] dateArray){
		/*int tempDay = d1.day,tempMonth = d1.month,tempYear = d1.year;
		d1.day = d2.day;
		d1.month = d2.month;
		d1.year = d2.year;
		d2.day = tempDay;
		d2.month = tempMonth;
		d2.year = tempYear;*/
		
		/*Date dateArray = new Date[2];
		dateArray = d2;
		dateArray = d1;
		return dateArray;*/
		
		Date tempDate = dateArray[0];
		dateArray[0] = dateArray[1];
		dateArray[1] = tempDate;
		
	}
	public static void main(String args[]){
		Date d1 = new Date();
		Date d2 = new Date(17,10,2016);
		d1.printDate();
		d2.printDate();
		System.out.println("Set d1 day to 21 : ");
		d1.setDay(21);
		d1.printDate();
		Date[] dateArray = new Date[2];
		dateArray[0] = d1;
		dateArray[1] = d2;
		System.out.println("Before swapping : ");
		for(int i = 0;i<dateArray.length;i++){
			dateArray[i].printDate();
		}
		d1.swapDates(dateArray);
		System.out.println("After swapping : ");
		for(int i = 0;i<dateArray.length;i++){
			dateArray[i].printDate();
		}
	}
}