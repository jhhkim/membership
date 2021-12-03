package dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import api.NaverAPI;
import dao.NaverDbDao;
import dto.NaverApiDto;

public class NaverApiDao {

	public static void main(String[] args) {
		NaverApiDto ndto = new NaverApiDto();
		NaverDbDao dao = new NaverDbDao();
		Scanner se = new Scanner(System.in);
		System.out.print("검색어를 입력: ");
		String search = se.next();
		ndto.setKey(search);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 검색 카테고리의 번호를 입력하세요.");
		System.out.println("1.뉴스 2.블로그 3.책 4.전문자료 5.영화");
		System.out.print("번호입력: ");
		int ca = sc.nextInt();
		ArrayList<NaverApiDto> list = null;
		
		if (ca == 1) {
			String responseBody = NaverAPI.searchNews(ndto.getKey());
			System.out.println(responseBody);
			list = NaverAPI.getParsingData(responseBody);
		} else if (ca == 2) {
			String responseBody = NaverAPI.searchBlog(ndto.getKey());
			list = NaverAPI.getParsingData(responseBody);
		} else if (ca == 3) {
			String responseBody = NaverAPI.searchBook(ndto.getKey());
			list = NaverAPI.getParsingData(responseBody);
		} else if (ca == 4) {
			String responseBody = NaverAPI.searcDoc(ndto.getKey());
			list = NaverAPI.getParsingData(responseBody);
		} else if (ca == 5) {
			String responseBody = NaverAPI.searchMovie(ndto.getKey());
			list = NaverAPI.getParsingData(responseBody);
		}
		
		for (NaverApiDto dto : list) {
			System.out.println("제목: " + dto.getTitle());
			System.out.println("링크: " + dto.getLink()); 
		}

	}

}