package com.javalec.spring_mybatis.domain;

public class ContentVo {

	private int mId;
	private String mWriter;
	private String mContent;

	public ContentVo() {
		// TODO Auto-generated constructor stub
	}
	
	public ContentVo(int mId, String mWriter, String mContent) {
		this.mId = mId;
		this.mWriter = mWriter;
		this.mContent = mContent;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmWriter() {
		return mWriter;
	}

	public void setmWriter(String mWriter) {
		this.mWriter = mWriter;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

}
