import java.util.*;

public class Solution {
    static boolean flag = false;
    static int B, H;
    static{
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        if(B>0 && H>0){ //according to problem give area only if both B and H are >0, so B>=0 and H>=0 fails
            flag = true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
  public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

