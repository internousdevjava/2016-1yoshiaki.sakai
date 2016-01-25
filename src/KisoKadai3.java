
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class KisoKadai3{


	  public static void main(String[] args) {
        System.out.print
        ("[メニュー]　1:新規作成　2.読み込み　3.書き込み　4.終了>");
      int menu = new Scanner(System.in).nextInt();
      switch (menu){
      case 1:
    	  System.out.println("新規作成します。");
    	  NewFile();
    	  break;


      case 2:
    	  System.out.println("読み込みます。");
    	  Yomikomi();
    	  break;


      case 3:
    	  System.out.println("書き込みます。");
    	  System.out.println("どちらにしますか。 1.追記　2.上書き");
    	  int menu2 = new Scanner(System.in).nextInt();
          switch (menu2){
          case 1:
        	  System.out.println("追記します。");
        	  tuiki();

          case 2:
        	  System.out.println("上書きします。");
        	  uwagaki();



      case 4:
    	  System.out.println("終了します。");







          }  }


        }

    	    public static void NewFile(){
    	      File newfile = new File("c:¥kisokadai3.txt");

    	      try{
    	        if (newfile.createNewFile()){
    	          System.out.println("ファイルの作成に成功しました");
    	        }else{
    	          System.out.println("ファイルの作成に失敗しました");
    	        }
    	      }catch(IOException e){
    	        System.out.println(e);
    	      }
    	    }



 	    public static void Yomikomi(){
 	      File newfile = new File("c:¥kisokadai3.txt");

 	     try{
 	    	  File file = new File("c:¥kisokadai3.txt");
 	    	  FileReader filereader = new FileReader(file);

 	    	  int ch = filereader.read();
 	    	  while(ch != -1){
 	    	    System.out.print((char)ch);

 	    	    ch = filereader.read();
 	    	  }
 	    	}catch(FileNotFoundException e){
 	    	  System.out.println(e);
 	    	}catch(IOException e){
 	    	  System.out.println(e);
        	}
           }





 	    public static void tuiki(){
 	      try{
 	        File file = new File("c:¥kisokadai3.txt");

 	        if (checkBeforeWritefile(file)){
 	          FileWriter filewriter = new FileWriter(file, true);

 	          filewriter.write("はい。元気です¥r¥n");
 	          filewriter.write("ではまた¥r¥n");

 	          filewriter.close();
 	        }else{
 	          System.out.println("ファイルに書き込めません");
 	        }
 	      }catch(IOException e){
 	        System.out.println(e);
 	      }
 	    }

 	   private static boolean checkBeforeWritefile(File file){
 		    if (file.exists()){
 		      if (file.isFile() && file.canWrite()){
 	          return true;
 	        }
 	      }

 	      return false;
 	    }






  public static void uwagaki(){
    try{
      File file = new File("c:¥kisokadai3.txt");

      if (checkBeforeWritefile(file)){
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write("こんにちは");
        bw.newLine();
        bw.write("お元気ですか？");
        bw.newLine();

        bw.close();
      }else{
        System.out.println("ファイルに書き込めません");
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}







