public class toothbrush {
	public String colour;
    public static float weight  ;
	public String workingMode;
	private int timer;
	private String indicatorOFacum;
	protected int price;
	protected int numberOfnozzles;
	
    public toothbrush() {}
    
	public toothbrush(String colour, String workingMode,  int timer, String indicatorOFacum ) {
		this.colour=colour;
		this.workingMode=workingMode;
		this.timer=timer;
		this.indicatorOFacum = indicatorOFacum;
		}
	public toothbrush(String colour, String workingMode, int timer,
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
	            int time,
	            String indicatorOFacum,
	            int price,
	            int numberOfnozzles) 
	    {
		 this.colour=colour;
		 this.weight=weight;
		 this.workingMode=workingMode;
		 this.indicatorOFacum =indicatorOFacum;
		 this.price=price;
		 this.numberOfnozzles=numberOfnozzles;
		 this.timer=timer;
	    }
	      
	      public  void printWeight() 
              {
	              System.out.println("Weight: "+weight);
              }
	      public static void printStaticWeight() 
	          {
			      System.out.println("Weight: "+weight);
	          }
	      public String toString() {
	          return "Colour :" + this.colour + "\n"
	                  + "Working Mode: " + this.workingMode + "\n"
	                  + "Indicator OF Acum" + this.indicatorOFacum;
	      }
	  void setColour (String colour){
		  this.colour=colour;  
	  }
	void setWeight (float weight){
		  this.weight=weight;
	  }
	  void setWorkingmode(String workingmode) {
		  this.workingMode=workingMode;
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
		     return workingMode;
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
		toothbrush Colgate = new toothbrush() {}; 
		toothbrush Oral_B = new toothbrush("Yellow ", "Vibro_n ", 30, "Yes" );
		toothbrush Synsodyne = new toothbrush("Red", "Vibro_m",35, "No"); 
		System.out.println(Colgate);
		System.out.println(Oral_B);
		System.out.println(Synsodyne);
		toothbrush.printStaticWeight();
	}
		
} 
	
	
	    
	

