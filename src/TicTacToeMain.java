import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		int option =0;
		
		do {
			
			TicTacToeHelp xoHelp = new TicTacToeHelp();		
			xoHelp.giveAEmptyMatrix();
			
			for (int i =0; i<9;i++) {
				xoHelp.chooseAField();
				xoHelp.chooseAValue();
				xoHelp.checkTheMatrixField();
				xoHelp.checkTheWinner();
					if(xoHelp.winner == true) {
						System.out.println("Igra je zavrsena!!! ");
						break;
					}else {
						continue;
					}
			}	
			System.out.println("Unesite 1 da ponovo igrate igru, a 0 da zavrsite sa igrom:");
			option = scanner.nextInt();
		} while(option !=0);
		
		scanner.close();

	}

}
