package tw.org.iii;

public class Brad21 {

	public static void main(String[] args) {
		System.out.println(TWid.isCheckOK("M100985992"));
		
		TWid id1 = new TWid();
		TWid id2 = new TWid(1);
		TWid id3 = new TWid(false);
		TWid id4 = new TWid(true, 12);
		System.out.println();
		//TWid id1 = new TWid("A123456789");
		//System.out.println(id1.gerId());
		//if (id1.isFemale()){
			//System.out.println("女生");
		//}else{
			//System.out.println("男生");
		//}
	}

}
