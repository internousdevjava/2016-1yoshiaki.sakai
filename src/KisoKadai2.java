

public class KisoKadai2{
	public static void main(String[] args) {
    System.out.println("【数あてゲーム】");
int ans=new java.util.Random().nextInt(100);
 for(int a=1;a<=100;a++){
 System.out.println("1～100の数字を入力してください");
int num=new java.util.Scanner(System.in).nextInt();
 if(num==ans){
 System.out.println("アタリ！");
break;
 }if(num<=ans){
 System.out.println("違います。もっと大きいです。");
 }if(num>=ans){
 System.out.println("違います。もっと小さいです。"); }
 }
 System.out.println("これでゲームを終了します");
}
}
