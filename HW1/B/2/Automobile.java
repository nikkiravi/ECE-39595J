public class Automobile{
	private int id; //vehicle identification number
	private float miles; //miles driven
	private String date; //date of last maintenance 
	private int day; //day in int type
	private int month; //month in int type
	private int year; //year in int type

	public Automobile(int _id, float _miles, int _day, int _month, int _year){
		id = _id;
		miles = _miles;
		day = _day;
		month = _month;
		year = _year;
	}

	public int getDay(){
		return day;
	}

	public void setDayAsString(int _day){
		day = _day;
	}

	public int getMonth(){
		return month;
	}

	public void setMonthAsString(int _month){
		month = _month;
	}

	public int getYear(){
		return year;
	}

	public void setYearAsString(int _year){
		year = _year;
	}

	public String form_date(){
		date = ""+month+"/"+day+"/"+year;
		return date; 
	}

	public void print_values(){
		System.out.println("Vehicle Identification Number: " + id);
		System.out.println("Miles driven: " + miles);
	}
}

