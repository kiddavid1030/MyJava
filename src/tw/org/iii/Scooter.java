package tw.org.iii;

public class Scooter extends Bike {  //繼承BIKE的特性
	Scooter(){
		//super(); 不指定 就用super(); 會追溯到源頭:會吃記憶體
		System.out.println("Scouter()");
	}
    void upSpeed(){
    	super.upspeed(); //先用爸爸的功能,再強化功能
    	speed = (speed<1)?1.5:(speed*3.2); //存取修飾字   //本來兩招 取代1昭還是2招
    	//改變名稱可以增加招數
    }
}
