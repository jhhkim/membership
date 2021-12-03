package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import comf.Util;
import dto.MembershipDto;
import dto.NaverApiDto;

 
public class NaverDbDao {
	
    private static Connection conn; //DB 커넥션 연결 객체
    static String[] code =Util.readLineFile("C:/dev/DBcode.txt").split("\\n");
    private static final String USERNAME = code[0];//DBMS접속 시 아이디
    private static final String PASSWORD = code[1];//DBMS접속 시 비밀번호
    private static final String URL = code[2];//DBMS접속할 DB명
    
    public NaverDbDao() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("연결 성공");
        } catch (Exception e) {
            System.out.println("연결 실패 ");
            e.printStackTrace();
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
    
    
    //MainClass에서 받은 검색어 DB 삽입 메소드
    public void insertKey(NaverApiDto dto){
        //쿼리문 준비
        String sql = "INSERT INTO naver_keyword (keyword) VALUES(?)";
        
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getKey());
           
            
            int result = pstmt.executeUpdate();
            if(result==1) {
                System.out.println("검색어 데이터 삽입 성공!");
                
            }
            
        } catch (Exception e) {
            System.out.println("검색어 데이터 삽입 실패!");
            e.printStackTrace();
 
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
        
        
    }   
    //MainClass에서 받은 네이버데이터 DB 삽입 메소드
    public void insertNaverD(NaverApiDto dto){
        //쿼리문 준비
        String sql = "INSERT INTO naver_info (title, url, date, keyword) VALUES(?,?,?,?)";
        
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getTitle());
            pstmt.setString(2, dto.getLink());
            pstmt.setString(3, dto.getPubDate());
            pstmt.setString(4, dto.getKey());
           
            
            int result = pstmt.executeUpdate();
            if(result==1) {
                System.out.println("데이터 삽입 성공!");
                
            }
            
        } catch (Exception e) {
            System.out.println("데이터 삽입 실패!");
            e.printStackTrace();
 
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
        
        
    }        

}
