package com.hp.shankar.fresco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharSearchSolution {

	 public static int charSearch(String str,char ch){
	        //complete the function
	        char charArray[]=str.toCharArray();
	        int count=0;
	        for(int i=0;i<charArray.length;i++)
	        {
	            if(charArray[i]==ch)
	            {
	               count++; 
	            }
	        }
	        if(count==0)
	        return 0;
	        else
	        return count;
	    }
	 public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        String str = reader.readLine();//Shankarrao
	        char ch = (char)reader.read();//r
	        
	        System.out.println(charSearch(str,ch));
	        
	        

	    }

}
