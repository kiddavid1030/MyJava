package tw.org.iii;  //不定個數

public class Brad053 {

	public static void main(String[] args) {
		sayYa("Brad","Peter");
    }
	static void sayYa(String name){
    	System.out.println("Ya," + name);
    }
	static void sayYa(String name1, String name2){
    	System.out.println("Ya," + name1);
        System.out.println("Ya," + name2);
	}
	static void sayYa(String... name){
		//name =>String[] => {"Brad", "Peter"}
		for (String name : names){
			System.out.println("Ya, " + name);
		}
	}
}	