package TicTacto;

public class Exam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=-11;
	Pro p1=new Pro(10);
	Pro p2=new Pro();
	System.out.println(p1.number1);
	System.out.println(""+p2.number1);
	System.out.println(k%2);
	}

}
class Pro{
	int number1;
	int number2;
	Pro(){
		
	}
	Pro(int n){
		number1=n;
		number2=n;
	}
}
