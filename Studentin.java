package hello;
class students{
	String name;
	int  USN;
	int Age;
	void info(){
		System.out.println("Student Name="+ name);
		System.out.println(" student USN="+ USN);
		System.out.println("Student age="+ Age);
	}
	
}
public class Studentin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 students iot=new students();
 iot.info();
 iot.name=" chulindra";
 iot.USN= 20;
 iot.Age=22;
 iot.info();
	}

}
