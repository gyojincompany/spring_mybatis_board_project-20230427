package com.gyojincompany.freeboard.dao;

import java.util.ArrayList;

import com.gyojincompany.freeboard.dto.FbMemberDto;
import com.gyojincompany.freeboard.dto.FreeBoardDto;

public interface IDao {
	
	//멤버 관련
	public void joinMemberDao(String mid, String mpw, String mname, String memail);//회원 가입
	public int checkIdDao(String mid);//회원가입여부 체크(아이디 중복여부 체크)
	public int checkIdPwDao(String mid, String mpw);//회원아이디와 비밀번호 일치여부 체크
	
	//게시판 관련
	public FbMemberDto getMemberInfo(String mid);//아이디로 검색하여 회원정보 가져오기
	public void writeDao(String mid, String mname, String ftitle, String fcontent);//게시판 글 쓰기
	public ArrayList<FreeBoardDto> listDao();//글 목록 모두 가져오기
	public int totalBoardDao();//총 게시글 수 가져오기
	
	
}
