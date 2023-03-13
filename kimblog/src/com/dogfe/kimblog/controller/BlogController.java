package com.dogfe.kimblog.controller;

import com.dogfe.kimblog.dto.BlogDTO;
import com.dogfe.kimblog.service.BlogService;
import com.dogfe.kimblog.service.UserService;

public class BlogController {
	
	private BlogService blogService;
	
	public BlogController() {
		initData();
	}
	
	private void initData() {
		blogService = new BlogService();
	}
	
	// 블로그 글쓰기 기능
	public int requstSaveBoard(String title, String content, int userId) {
		// 방어적 코드
		if(userId != 0 && !title.equals("")) {
			return blogService.saveBoard(title, content, userId);
		}
		return 0;
	}
	
	public BlogDTO requestSelectBoard(int id) {
		BlogDTO dto = blogService.selectBoard(id);
		return dto;
	}
	
	public void requstDeleteBoard(int id, int userId) {
		blogService.deleteBoard(id, userId);
	}
}
