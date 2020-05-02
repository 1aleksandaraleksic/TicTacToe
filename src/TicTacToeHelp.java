import java.util.Scanner;


public class TicTacToeHelp {

	public int input,inputXO;
	char [][] matrix;
	boolean winner;
	
	
	
	public char [][] giveAEmptyMatrix(){
					
				matrix = new char [3][3];
				
				for(int i=0; i<matrix.length;i++) {
					for(int j=0; j<matrix[i].length;j++) {
						System.out.print("["+(3*i+j+1)+"]"+"  "+matrix[i][j]+"  ");
						matrix [i][j] = '.';
						
					}
					System.out.println();
				}
				System.out.println();

				return matrix;
	}

	public int chooseAField() {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Izaberite polje u koje zelite da odigrate: ");
			input = scanner.nextInt();
			
		return input;
	}

	public int chooseAValue() {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Broj 1 za X ili broj 2 za O");
		System.out.println("Unesite vrednost polja: ");
		inputXO = scanner.nextInt();
		
		return inputXO;
	}
	
	public void selectedField() {
		
		switch(input) {
		case 1:
				if (inputXO == 0) {
					matrix[0][0] = '.';
				}
				else if(inputXO ==1) {
					matrix[0][0] = 'X';
				}
				else if(inputXO ==2) {
					matrix[0][0] = 'O';
				}
			break;
		case 2:		
				if (inputXO == 0) {
					matrix[0][1] = '.';
				}
				if(inputXO ==1) {
					matrix[0][1] = 'X';
				}
				if(inputXO ==2) {
					matrix[0][1] = 'O';
				}
			break;
		case 3:
				if (inputXO == 0) {
					matrix[0][2] = '.';
				}
				if(inputXO ==1) {
					matrix[0][2] = 'X';
				}
				if(inputXO ==2) {
					matrix[0][2] = 'O';
				}
			break;
		case 4:
				if (inputXO == 0) {
					matrix[1][0] = '.';
				}
				if(inputXO ==1) {
					matrix[1][0] = 'X';
				}
				if(inputXO ==2) {
					matrix[1][0] = 'O';
				}
			break;
		case 5:
				if (inputXO == 0) {
					matrix[1][1] = '.';
				}
				if(inputXO ==1) {
					matrix[1][1] = 'X';
				}
				if(inputXO ==2) {
					matrix[1][1] = 'O';
				}
			break;
		case 6:
				if (inputXO == 0) {
					matrix[1][2] = '.';
				}
				if(inputXO ==1) {
					matrix[1][2] = 'X';
				}
				if(inputXO ==2) {
					matrix[1][2] = 'O';
				}
			break;
		case 7:
				if (inputXO == 0) {
					matrix[2][0] = '.';
				}
				if(inputXO ==1) {
					matrix[2][0] = 'X';
				}
				if(inputXO ==2) {
					matrix[2][0] = 'O';
				}
			break;
		case 8:
				if (inputXO == 0) {
					matrix[2][1] = '.';
				}
				if(inputXO ==1) {
					matrix[2][1] = 'X';
				}
				if(inputXO ==2) {
					matrix[2][1] = 'O';
				}
			break;
		case 9:
				if (inputXO == 0) {
					matrix[2][2] = '.';
				}
				if(inputXO ==1) {
					matrix[2][2] = 'X';
				}
				if(inputXO ==2) {
					matrix[2][2] = 'O';
				}
			break;
		}
	}

	public char [][] writeMatrix(){
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print("["+(3*i+j+1)+"]"+"  "+matrix[i][j]+"  ");
			}
			System.out.println();
		}
	return matrix;
	}

	public char [][] checkTheMatrixField(){

		switch(input) {
		case 1:
			if (matrix[0][0] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 2:		
			if (matrix[0][1] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 3:
			if (matrix[0][2] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 4:
			if (matrix[1][0] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 5:
			if (matrix[1][1] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 6:
			if (matrix[1][2] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 7:
			if (matrix[2][0] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 8:
			if (matrix[2][1] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;
		case 9:
			if (matrix[2][2] == '.') {
				selectedField();
			}
			else {
				System.out.println("Polje je popunjeno, izaberite drugo polje! ");
				chooseAField();
			}
			break;

		}
		return writeMatrix();
	} 
	
	public void checkTheWinner() {
		
		//pobednik X
		if(matrix[0][0]== 'X' && matrix[0][1]== 'X' && matrix[0][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[1][0]== 'X' && matrix[1][1]== 'X' && matrix[1][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[2][0]== 'X' && matrix[2][1]== 'X' && matrix[2][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[0][0]=='X' && matrix[1][0]== 'X' && matrix[2][0]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[0][1]== 'X' && matrix[1][1]== 'X' && matrix[2][1]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[0][2]== 'X' && matrix[1][2]== 'X' && matrix[2][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[0][0]== 'X' && matrix[1][1]== 'X' && matrix[2][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		if  (matrix[2][0]== 'X' && matrix[1][1]== 'X' && matrix[0][2]== 'X') {
			System.out.println("Pobednik je igrac X!");
			winner = true;
		}else {
			winner = false;
		}
		
		//pobednik O
				if(matrix[0][0]== 'O' && matrix[0][1]=='O' && matrix[0][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[1][0]== 'O' && matrix[1][1]=='O' && matrix[1][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[2][0]== 'O' && matrix[2][1]=='O' && matrix[2][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[0][0]== 'O' && matrix[1][0]=='O' && matrix[2][0]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[0][1]== 'O' && matrix[1][1]=='O' && matrix[2][1]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[0][2]== 'O' && matrix[1][2]=='O' && matrix[2][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[0][0]== 'O' && matrix[1][1]=='O' && matrix[2][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
				if  (matrix[2][0]== 'O' && matrix[1][1]=='O' && matrix[0][2]=='O') {
					System.out.println("Pobednik je igrac O!");
					winner = true;
				}else {
					winner = false;
				}
		
	}
}
