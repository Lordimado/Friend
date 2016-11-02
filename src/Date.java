
public class Date {
	
		private int Day;
		private int Month;
		private int Year;
		
		public int getDay(){
			return Day;
		}
		
		public int getMonth(){
			return Month;
		}
		
		public int getYear(){
			return Year;
		}
		
		public void setDay(int Day){
			this.Day=Day;
		}
		
		public void setMonth(int Month){
			this.Month=Month;
		}
		
		public void setYear(int Year){
			this.Year=Year;
		}
		
		public String toSting(){
			return this.Day+"/"+this.Month+"/"+this.Year; 
		}
		
}
