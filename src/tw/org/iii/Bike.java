package tw.org.iii;

public class Bike extends Object{
	double speed;
	int a;	// a = 0
	static int counter;	// b = 0
	
	Bike(){
		this(0);
		System.out.println("Bike()");
	}
	Bike(int s){
		this(s*1f);
	}
	Bike(float s){
		this(s*1.0);
	}
	Bike(double s){
		speed = s;
		a++; counter++;
		System.out.println("Bike:Bike()");
	}
	void upSpeed(){
		speed = (speed<1)?1:(speed*1.2);
	}
	void upSpeed(int gear){
		speed = (speed<1)?1:(speed*(1.2+gear));
	}
	void downSpeed(){
		speed *= 0.7;
	}
	double getSpeed(){
		return speed;
	}
}


//package tw.org.iii;
//
//public class Bike {
//	double speed;
//	int a; // a = 0
//	static int counter; //差別在static
//	//private 把屬性封裝起來 需要靠方法來改變屬性 
//  //也可以用int 但是double準度高
//	  Bike(){
//		  System.out.println("Bike:Bike()v1");
//	  }
//	   Bike(double s){
//		   speed = s;
//		   a++;conter++;
//		   System.out.println("Bike:Bike()v2");
//	   }
//    void upspeed(){
//    	speed= (speed<1)?1:(speed*1.2);    	
//    // Verd prep smallwhite
//    	//speed 在小於1 當1  加速都1.2
//    }
//    void upspeed(int gear){
//    	speed= (speed<1)?1:(speed*1.2+gear);  
//    }	
//    void downSpeed(){
//    	speed*= 0.7;
//    }
//    double getSpeed(){
//    	return speed;
//    }
//}
