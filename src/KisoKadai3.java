 import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


 class KisoKadai3{




 public static void main(String args[]){


 int x = 1;
 	while (x ==1) {
 	  System.out.println
 		("[メニュー] 1:読み込み 2:新規作成 3:追記 4:上書き 5:終了");
 	    int selected = new java.util.Scanner(System.in).nextInt();
 switch (selected) {
 case 1:
 	x = 1;
 	Read();
 	break;
 case 2:
 	x = 1;
 	Newfile();
 	break;

 case 3:
 	x = 1;
 	Write1();
      break;

 case 4:
	x = 1;
	 Write2();
	      break;

 case 5:
		x =2;
		System.out.println("終了します");
		break;
	}}


       }

 public static void Read(){
     System.out.println( "ファイル名を入力してください。\n拡張子を必ずつけてください。(例: text.txt");
     String file = new java.util.Scanner(System.in).nextLine();
      try{  FileReader filereader = new FileReader("C:\\Users\\internous/\\" + file);


       int i;
       System.out.println( "ファイルの読み込みに成功しました。");
        while((i = filereader.read()) != -1){
          System.out.print((char)i);
        }
        System.out.println();
        filereader.close();
      }catch(FileNotFoundException e){
        System.out.println(e);
      }catch(IOException e){
        System.out.println(e);
      }
  }






 public static void Newfile(){
     System.out.println( "ファイルを作成します。\nファイル名を入力してください。\n拡張子を必ずつけてください。(例: text.txt");

     String file = new java.util.Scanner(System.in).nextLine();

    File newfile = new File("C:\\Users\\internous\\" + file);


  try{
    if (newfile.createNewFile()){
      System.out.println("ファイルの作成に成功しました。\nC:\\Users\\internousにファイルが作成されました。");
    }else{
      System.out.println("ファイルの作成に失敗しました");
    }
  }catch(IOException e){
    System.out.println(e);
    }
  }





public static void Write1(){//3追記

  try{
	  System.out.println( "ファイルに追記します。\nファイル名を入力してください。\n拡張子を必ずつけてください。(例: text.txt");

	  String ファイル名 = new Scanner(System.in).nextLine();

	  File file = new File("C:\\Users\\internous\\" + ファイル名 );

	  checkBeforeWritefile(file);

       if (checkBeforeWritefile(file)){
         FileWriter filewriter = new FileWriter(file,true);

         System.out.println("内容を入力して下さい");

         String kubo =new Scanner(System.in).nextLine();
         filewriter.write(kubo);
         System.out.println();
         filewriter.close();
         System.out.println("書き込み終了しました");

       }else{
         System.out.println("ファイルに書き込めません");
       }
     }catch(IOException e){
       System.out.println(e);
     }
   }
public static void Write2(){//4:上書き

	  try{
		  System.out.println( "ファイルに追記します。\nファイル名を入力してください。\n拡張子を必ずつけてください。(例: text.txt");

		  String ファイル名 = new Scanner(System.in).nextLine();

		  File file = new File("C:\\Users\\internous\\" + ファイル名 );


		  checkBeforeWritefile(file);

	       if (checkBeforeWritefile(file)){
	         FileWriter filewriter = new FileWriter(file);

	         System.out.println("内容を入力して下さい");

	         String kubo =new Scanner(System.in).nextLine();
	         filewriter.write(kubo);
             System.out.println();
	         filewriter.close();
	         System.out.println("書き込み終了しました");
	       }else{
	         System.out.println("ファイルに書き込めません");
	       }
	     }catch(IOException e){
	       System.out.println(e);
	     }}





//ファイルの状態チェック

	private static boolean checkBeforeWritefile(File file){
		if (file.exists()){
		if (file.isFile() && file.canWrite()){
				return true;
		}
		}
		return false;
  }
}









