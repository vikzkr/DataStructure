package Miscellanous;

public class EqualMarble {
	 static int result=0;
	 public static void main(String[] args)
	 {
		
		 int bagA=1;
		 int bagB=1;
		 int bagC=1;
		 int bagD=1;
		 int bagE=6;
		 int sum = bagA+bagB+bagC+bagD+bagE;
		 int totalbag =5;
		 int bagContent=sum/totalbag;
		 if(sum%totalbag==0) {
		 difference(bagContent,bagA);
		 difference(bagContent,bagB);
		 difference(bagContent,bagC);
		 difference(bagContent,bagD);
		 difference(bagContent,bagE);
		 System.out.println(Math.abs(result));}
		 else
		 {
			 result=-1;
			 System.out.println(result);
		 } 
	} 
	 static void difference(int sum, int b)
	 {
		 int diff= sum-b;
		 if(diff<0)
		 {
			 result=result+diff;	 
		 } 
	 }

}
