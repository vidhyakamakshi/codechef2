import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    long t=Long.parseLong(br.readLine());
		    while(t-->0){
		        String n=br.readLine();
		        long s=0;
		        int l=n.length();
		        for(int i=0;i<l;i++){
		            int ascii=(int)n.charAt(i);
		            if((ascii>=48)&&(ascii<=57)){
		                s+=(ascii-48);
		            }
		        }
		        System.out.println(s);
		    }
	}
}
