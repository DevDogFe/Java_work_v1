package com.dogfe.kimblog.service;

import com.dogfe.kimblog.dao.BlogDAO;
import com.dogfe.kimblog.dto.BlogDTO;

public class BlogService {
	
	private BlogDAO blogDAO;
	
	public BlogService() {
		initData();
	}
	
	private void initData() {
		blogDAO = new BlogDAO();
	}
	
	// 블로그 저장 기능 로직 구현
	public int saveBoard(String title, String content, int userId) {
		int resultRow = 0;
		if(title.equals("") || title.length() < 2) {
			return resultRow;
		}
		resultRow = blogDAO.save(title, content, userId);
		return resultRow;
	}
	
	public BlogDTO selectBoard(int id) {
		BlogDTO dto = blogDAO.select(id);
		return dto;
	}
	
	public void deleteBoard(int id, int userId) {
		
		BlogDTO blogDTO = blogDAO.select(id);
		if(blogDTO.getUserId() == userId) {
			blogDAO.delete(id);
		} else {
			System.out.println("권한이 없습니다.");
		}
		
		//삭제 요청 쿼리 작성
	}
	
}
