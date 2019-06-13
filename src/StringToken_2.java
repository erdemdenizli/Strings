import java.util.Scanner;

public class StringToken_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String[] items = s.trim().split("[ !,?.\\_'@]+");

        if(s.length()<=0){
           System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
           System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }
        
        scan.close();

	}

}
