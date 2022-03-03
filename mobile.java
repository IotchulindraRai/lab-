package hello;

public class mobile {
	   
    String brand;
    String color; 
     int camera;

public static void main(String[] args){

  mobile Chulindra = new mobile();
  Chulindra.brand="iphone";
  Chulindra.color="Blue";
  Chulindra.camera=23;
mobile Yoona =new mobile();
Yoona.brand="samsung";
Yoona.color="red";
Yoona.camera=13;

System.out.println("Chulindra's mobile is of  " + Chulindra.brand+  Chulindra.color);
System.out.println("Yoona's mobile is cool of"+ Yoona.brand+Yoona.camera);
}
}

