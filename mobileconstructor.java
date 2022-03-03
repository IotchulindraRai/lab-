package hello;

public class mobileconstructor {
	 String brand;
	    String color; 
	     int camera;
    mobileconstructor(String b,String c,int ca){
    	brand=b;
    	color=c;
    	camera=ca;
    }
	public static void main(String[] args){

	  mobileconstructor Chulindra = new mobileconstructor("iphone","Gold",13);
	  System.out.println( "Chulindra's mobile is of " + Chulindra.brand);
	/*  Chulindra.brand="iphone";
	  Chulindra.color="Blue";
	  Chulindra.camera=23;
	mobileconstructor Yoona =new mobileconstructor();
	Yoona.brand="samsung";
	Yoona.color="red";
	Yoona.camera=13;

	System.out.println("Chulindra's mobile is of " + Chulindra.brand +  Chulindra.color);
	System.out.println("Yoona's mobile is of "+ Yoona.brand + Yoona.camera);
	*/
	}
	}


