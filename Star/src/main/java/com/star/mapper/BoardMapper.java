package com.star.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.star.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	
	// 조회 테스트용 함수들
	public BoardDTO detailBoard(BoardDTO boardDto);
	
	public BoardDTO detailReport(BoardDTO boardDto);
	
	public BoardDTO detailComment(BoardDTO boardDto);
	
	public BoardDTO detailImg(BoardDTO boardDto);
	
	public BoardDTO detailCategory(BoardDTO boardDto);
	
	
	// 진짜 사용하는 함수들

	// 글 데이터 삽입
	public int insertBoard(BoardDTO params);
	
	// 글 데이터 상세 조회 -> 글 번호 값을 가져와서 처리한다.
	public BoardDTO selectDetail(Long bno);
	
	// 게시글 전체 조회
	public List<BoardDTO> selectList(BoardDTO params);
	

	
	
}