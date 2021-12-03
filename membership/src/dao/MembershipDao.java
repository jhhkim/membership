package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import comf.Util;
import dto.MembershipDto;

 
public class MembershipDao {
	
    private static Connection conn; //DB 커넥션 연결 객체
    static String[] code =Util.readLineFile("C:/dev/DBcode.txt").split("\\n");
    private static final String USERNAME = code[0];//DBMS접속 시 아이디
    private static final String PASSWORD = code[1];//DBMS접속 시 비밀번호
    private static final String URL = code[2];//DBMS접속할 DB명
    
    public MembershipDao() {
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
    
    
    //MainClass에서 받은 데이터 DB 삽입 메소드
    public void insertMembershipInfo(MembershipDto dto){
        //쿼리문 준비
        String sql = "INSERT INTO membership (name, major, email, password) VALUES(?,?,?,?)";
        
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getMajor());
            pstmt.setString(3, dto.getEmail());
            pstmt.setString(4, dto.getPassword());
            
            
            int result = pstmt.executeUpdate();
            if(result==1) {
                System.out.println("데이터 삽입 성공!");
                
            }
            
        } catch (Exception e) {
            System.out.println("naver_info 데이터 삽입 실패!");
 
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
        
        
    }   
    //로그인 검증
    public void checkMem(String email, String password) {
        String sql = "select num from membership where email = ? AND password = ?";
        int num = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
            	num = rs.getInt("num");
                System.out.println("로그인 성공");
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("로그인 실패");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
    
    //pw 변경
    public void changePassword(String email, String password, String newpw) {
        String sql = "UPDATE membership SET password =? WHERE email =?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
           while(rs.next()) { if(rs.getString("email").equals(email)&&rs.getString("password").equals(password)) {
                pstmt.setString(1, newpw);
                pstmt.setString(2, email); 
                pstmt.executeUpdate();
                System.out.println("비밀번호 변경 성공");
                break;
            }
           }
            
        } catch (Exception e) {
            System.out.println("비밀번호 변경 실패");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
          
        

}
