package com.hp.shankar.fresco;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());//input 
        
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
        for(int i=0;i<n;i++)
        {
            
            String str = reader.readLine();
            String strMap[] = str.split(" ");
            int key = Integer.parseInt(strMap[0]);
            String value = strMap[1];
            map.put(key,value);
             
        }
        //System.out.println(map);
        int find = Integer.parseInt(reader.readLine());
        
        
            if(map.containsKey(find)== true)
        {
           System.out.println(map.get(find));
        }
        else
        {
             System.out.println("-1");
        }  
    //System.out.println(m.getKey()+" "+m.getValue());    
   
        
    }
}

/* o/p
 
 2
 101 shankar
 102 amit
 103
 -1
 
 */
