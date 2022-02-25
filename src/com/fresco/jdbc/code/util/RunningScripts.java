package com.fresco.jdbc.code.util;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.Reader;
import java.sql.Connection;

//import org.apache.ibatis.jdbc.ScriptRunner;


public class RunningScripts {
  	Connection con;
	public RunningScripts() {
		con = DbUtil.getConnection();
	}
   public void runDbScript() throws Exception {
      
       //Initialize the script runner
//      ScriptRunner sr = new ScriptRunner(con);
      //Creating a reader object
//	Reader reader = new BufferedReader(new FileReader("db.sql"));
      //Running the script
//      sr.runScript(reader);
   }
   public static void main(String[] args) {
	   RunningScripts rs=new RunningScripts();
	   
}
}
