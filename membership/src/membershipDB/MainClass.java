package membershipDB;

import java.util.Scanner;

import dto.MembershipDto;
import dao.MembershipDao;

public class MainClass {

	public static void main(String[] args) {
		//회원가입
		Scanner name = new Scanner(System.in);
		System.out.print("이름: ");
		String n = name.next();
		
		Scanner major = new Scanner(System.in);
		System.out.print("전공: ");
		String m = major.next();
		
		Scanner email = new Scanner(System.in);
		System.out.print("이메일: ");
		String e = email.next();
		
		Scanner password = new Scanner(System.in);
		System.out.print("비밀번호: ");
		String p = password.next();
		
		//DB삽입
		MembershipDto dto = new MembershipDto();
		dto.setName(n);
		dto.setMajor(m);
		dto.setEmail(e);
		dto.setPassword(p);
		
		MembershipDao dao = new MembershipDao();
		dao.insertMembershipInfo(dto);
		
		//로그인
		System.out.println("로그인을 해 주십시오.");
		Scanner myemail = new Scanner(System.in);
		System.out.print("이메일: ");
		String mye = myemail.next();
		
		Scanner mypassword = new Scanner(System.in);
		System.out.print("비밀번호: ");
		String myp = mypassword.next();
		dao.checkMem(mye, myp);
		
	}

}
