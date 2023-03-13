package com.dogfe.kimblog.dao;

import com.dogfe.kimblog.dto.BlogDTO;

public interface IBlogDAO {
	
	int save(String title, String content, int userId);
	BlogDTO select(int id);
	void update();
	void delete(int id);
} 
