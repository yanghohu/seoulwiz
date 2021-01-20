package com.javalec.spring_mybatis.repository;

import java.util.ArrayList;

import com.javalec.spring_mybatis.domain.ContentVo;

public interface IDao {
	
	public ArrayList<ContentVo> listDao();
	public void writeDao(String mWriter, String mContent);
	public ContentVo viewDao(String strID);
	public void deleteDao(String bId);
	
}
