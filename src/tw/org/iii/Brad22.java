package tw.org.iii;

public class Brad22 {

	public static void main(String[] args) {
		String id = "M100985992";
        System.out.println(id.matches("^[A-Za-z][12][0-9]{8}$")); 
        //�n�t�X����$
        //"^M100985992$" >> "[ABC]100985992 >> [A-Z]100985992 ;[A-Zxyz]
        //>>"[A-Z][12]" >> "^[A-Za-z][12][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$"
        //>> "^[A-Za-z][12][0-9]{1,4}$"�̤֥X�{1���γ̦h 4��
        //>>"^[A-Za-z][12][0-9]{4,}$"�X�{ 4���H�W
        // **^[^A-Z] :  [^  ]��ܤ϶��X
	}

}
