package tw.org.iii;

public class Brad22 {

	public static void main(String[] args) {
		String id = "M100985992";
        System.out.println(id.matches("^[A-Za-z][12][0-9]{8}$")); 
        //要配合尾巴$
        //"^M100985992$" >> "[ABC]100985992 >> [A-Z]100985992 ;[A-Zxyz]
        //>>"[A-Z][12]" >> "^[A-Za-z][12][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$"
        //>> "^[A-Za-z][12][0-9]{1,4}$"最少出現1次或最多 4次
        //>>"^[A-Za-z][12][0-9]{4,}$"出現 4次以上
        // **^[^A-Z] :  [^  ]表示反集合
	}

}
