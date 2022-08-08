package com.star.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	// 카테고리 테이블
	private String category;
	
	// 게시글 테이블
	private Long bno;
	
//	privat String category;		// 게시글 테이블의 카테고리도 카테고리 연결
	
	private int userNumber;		// 유저 테이블의 유저 넘버와 연결
	
	private String title;
	
	private String content;
	
	private LocalDateTime regDate;
	
	private LocalDateTime updateDate;
	
	private boolean deleteYn;
	
	// 신고 테이블
//	private int bno;		// 게시글 테이블의 bno와 연결 
	
//	private int userNumber;		// 유저 테이블의 유저 넘버와 연결
	
	private String reportContent;
	
	private boolean manageYn;
	
	// 댓글 테이블
	private int cmtNum;
	
//	private int bno;		// 게시글 테이블의 bno와 연결 
	
//	private int userNumber;		// 유저 테이블의 유저 넘버와 연결
	
	private String cmtContent;
	
	private LocalDateTime writeDate;
	
	private LocalDateTime cmtUpdate;
	
	private boolean cmtDeleteYn;
	
	// 이미지 테이블
	private int imtNumber;
	
//	private int bno;		// 게시글 테이블의 bno와 연결 
	
	private String imgUrl;
	
	private boolean imgShowYn;
	
	

}