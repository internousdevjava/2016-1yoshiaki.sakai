
public class KisoKadai1{

	  public static void main(String args[])
	  {
		    System.out.println("九九の表");

	    	System.out.println("Xを入力してください。");
		int X= new java.util.Scanner(System.in ).nextInt();

		System.out.println("Yを入力してください。");
		int Y= new java.util.Scanner(System.in ).nextInt();
		    // 九九の結果を表示。
		    for( int i=1; i<=X; i++ ){
		      for( int j=1; j<=Y; j++ ){
		    	  System.out.print (i*j+" ");
		      }
		      	  System.out.println();
		    }
	  }
}


