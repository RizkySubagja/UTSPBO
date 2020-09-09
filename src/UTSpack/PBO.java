package UTSpack;

public class PBO {

	//Muhammad Rizky Subagja
	public static void main(String[] args) {
		
		String abjad="ABCDEFGHIJKLMNOPQRSTUVWXYZ-";
		
		System.out.println(
				//MUHAMMAD
		abjad.substring(12, 13)+abjad.substring(20, 21)+abjad.substring(7, 8)
		+abjad.substring(0, 1)+abjad.substring(12, 13)+abjad.substring(12, 13)
		+abjad.substring(0, 1)+abjad.substring(3, 4)
				//-
		+abjad.substring(26, 27)
				//RIZKY
		+abjad.substring(17, 18)+abjad.substring(8, 9)+abjad.substring(25, 26)
		+abjad.substring(10, 11)+abjad.substring(24, 25)
				//-
		+abjad.substring(26, 27)
				//SUBAGJA	
		+abjad.substring(18, 19)+abjad.substring(20, 21)+abjad.substring(1, 2)
		+abjad.substring(0, 1)+abjad.substring(6, 7)+abjad.substring(9, 10)
		+abjad.substring(0, 1)
		);
		

	}

}
