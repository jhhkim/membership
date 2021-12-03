package membershipDB;

import java.util.Scanner;

import dto.MembershipDto;
import dao.MembershipDao;

public class MainClass {

	public static void main(String[] args) {
		MembershipDto dto = new MembershipDto();
		MembershipDao dao = new MembershipDao();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 활동의 번호를 입력하십시오.\n1.회원가입 2.로그인 3.비밀번호 변경");
		int num=sc.nextInt();
		sc.nextLine();
		
		if(num==1) {
		//회원가입
		System.out.println("회원가입을 시작합니다.");
		
		System.out.print("이름: ");
		String n = sc.next();
		
		System.out.print("전공: ");
		String m = sc.next();
	
		System.out.print("이메일: ");
		String e = sc.next();
		
		System.out.print("비밀번호: ");
		String p = sc.next();
		
		//DB삽입
		dto.setName(n);
		dto.setMajor(m);
		dto.setEmail(e);
		dto.setPassword(p);
		
		dao.insertMembershipInfo(dto);
		}
		
		else if(num==2) {
		//로그인
		System.out.println("로그인을 해 주십시오.");
		System.out.print("이메일: ");
		String mye = sc.next();
		
		System.out.print("비밀번호: ");
		String myp = sc.next();
		dao.checkMem(mye, myp);
		}
		
		else if(num==3) {
		//pw 변경
		System.out.println("비밀번호를 변경하십시오.");

		System.out.print("이메일: ");
		String myec = sc.next();
				
		System.out.print("비밀번호: ");
		String mypc = sc.next();
		
		System.out.print("새 비밀번호: ");
		String mypwc = sc.next();
		
		dao.changePassword(myec, mypc,mypwc);
		}
	}
	
			

}
