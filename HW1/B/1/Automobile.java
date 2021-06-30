public class Automobile{
	private int id; //vehicle identification number
	private float miles; //miles driven
	private int day; //maintenance day
	private int month; //maintenance month
	private int year; //maintenance year
	private String date; //date of last maintenance 

	public Automobile(int _id, float _miles, int day, int month, int year){
		id = _id;
		miles = _miles;


		date = ""+month+"/"+day+"/"+year;
	}

	public int getDay(){
		return day;
	}

	public void setDay(int _day){
		day = _day;
	}

	public int getMonth(){
		return month;
	}

	public void setMonth(int _month){
		month = _month;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int _year){
		year = _year;
	}

	public void print_values(){
		System.out.println("Vehicle Identification Number: " + id);
		System.out.println("Miles driven: " + miles);
		System.out.println("Date of last maintenance: " + date);
	}
}

