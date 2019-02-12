package laba1_Batih;

public class Toothbrush {
	public static int numberOfbrush;
	public String colour;
    public  float weight  ;
	public String workingmode;
	private int timer;
	private String indicatorOFacum;
	protected int price ;
	protected int numberOfnozzles;
	
    public Toothbrush() {numberOfbrush++;}
    
	public Toothbrush(String colour, String workingMode,  int timer, String indicatorOFacum )
	{   this();
		this.colour=colour;
		this.workingmode=workingMode;
		this.timer=timer;
		this.indicatorOFacum = indicatorOFacum;
		}
	public Toothbrush(String colour, String workingMode, int timer,
			String indicatorOFacum, float weight,  int price, 
			int numberOfnozzles )
	{
		this(colour, workingMode, timer, indicatorOFacum );
		this.price=price;
		this.numberOfnozzles=numberOfnozzles; 
	}
	
	
	
	 public void resetValues(
	            String colour,
	            float weight ,
	            String workingMode,
	            int timer,
	            String indicatorOFacum,
	            int price,
	            int numberOfnozzles) 
	    {
		 this.colour=colour;
		 this.weight=weight;
		 this.workingmode=workingMode;
		 this.indicatorOFacum =indicatorOFacum;
		 this.price=price;
		 this.numberOfnozzles=numberOfnozzles;
		 this.timer=timer;
	    }
	      
	      public  void printNumber() 
              {
	              System.out.println("Number Of brush: "+numberOfbrush);
              }
	      public static void printStaticNumber() 
	          {
			      System.out.println("Number Of brush: "+numberOfbrush);
	          }
	      public String toString() {
	          return "Colour : " + this.colour + "\n"
	                  + "Working Mode: " + this.workingmode + "\n"
	                  + "Indicator OF Acum : " + this.indicatorOFacum+ "\n" 
	                  + "Timer: " +this.timer+ "\n"
	          		  + "Weight: "+this.weight + "\n"
	          		  + " Number of Nozzles: "+this.numberOfnozzles+ "\n"
	          		  + "Price: "+this.price+ "\n";
	          		  
	          
	      }
	  void setColour (String colour){
		  this.colour=colour;  
	  }
	void setWeight (float weight){
		  this.weight=weight;
	  }
	  void setWorkingmode(String workingmode) {
		  this.workingmode=workingmode;
	  }
	  
	  void setIndicatorofacum(String indicatorOFacum) {
	  this.indicatorOFacum =indicatorOFacum;
	  }
	  void setPrice (int price){
		  this.price=price;  
	  }
	  void setNumberOfnozzles(int numberOfnozzles){
		  this.numberOfnozzles=numberOfnozzles;  
	  }
	  void setTimer(int timer){
		  this.timer=timer;  
	  }
	     String getColour() {
	     return colour;
	     }	
	     float getWeight() {
		     return weight;
		     }	
	     String getWorkingMode() {
		     return workingmode;
		     }	
	     int getTimer() {
		     return timer;
		     }	
	     String getIndicatorOFacum() {
		     return indicatorOFacum;
		     }	
	     int getPrice() {
		     return price;
		     }	
	      int getNumberOfnozzles() {
		     return numberOfnozzles;
		     }
	     

	public static void main (String args[]) 
	{
		Toothbrush colgate = new Toothbrush() ; 
		Toothbrush oral_B = new Toothbrush("Yellow ", "Vibro_n ", 30, "Yes" );
		Toothbrush synsodyne = new Toothbrush("Red", "Vibro_m", 45, "No", 40, 25, 6); 
		System.out.println(colgate);
		System.out.println(oral_B);
		System.out.println(synsodyne);
		Toothbrush.printStaticNumber();
	}
		
} 
	
	
	    
	

