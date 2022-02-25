package com.hp.shankar.fresco;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fresco.jdbc.code.util.DbUtil;

public class DbOperations {
	Connection con;
	public DbOperations() {
		con = DbUtil.getConnection();
	}
	public boolean insertSubject(String name) throws SQLException {
    final String QUERY = "insert into subject(name) values('"+name+"')";
    Statement st = con.createStatement();
    int m = st.executeUpdate(QUERY);
if (m==1)
    return true;
else
    	return false;
	
	}
	public ArrayList getSubjectById(int id) throws SQLException {
     final String QUERY = "SELECT * FROM subject where id="+id+"";
     Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
         ArrayList<String> list=new ArrayList<String>();
         list.clear();
         list.add(String.valueOf(id));
         while(rs.next()){
            //Display values
            list.add(rs.getString("name"));
         }
		return list;
	}
	public ResultSet getAllSubjects() throws SQLException {
    final String QUERY = "SELECT name FROM subject";
     Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
		return rs;
	}
	public boolean insertStudent(String student_name, float score, String name) throws SQLException {
		final String QUERY = "insert into student(student_name, score) values('"+student_name+"',"+score+")";
    Statement st = con.createStatement();
    int m = st.executeUpdate(QUERY);
if (m==1)
    return true;
else
    	return false;
		
	}
	public ArrayList getStudentyId(int id) throws SQLException {
	   final String QUERY = "SELECT * FROM student where id="+id+"";
     Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
         ArrayList<String> list=new ArrayList<String>();
         list.clear();
         list.add(String.valueOf(id));
         while(rs.next()){
            //Display values
            list.add(rs.getString("student_name"));
            list.add(String.valueOf(rs.getFloat("score")));
            list.add(String.valueOf(rs.getInt("subject_id")));
         }
		return list;
	}
	public ResultSet getAllStudents() throws SQLException {
		
		final String QUERY = "SELECT * FROM student";
     Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
		return rs;
	}
	
}
