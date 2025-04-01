package org.pgm.thymeleafex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.pgm.thymeleafex.dto.BoardDTO;


import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> selectAll();
    void insertBoard(BoardDTO board);
    BoardDTO selectByBno(int bno);
    void deleteByBno(int bno);
    void updateByBno(BoardDTO board);
    void updateReadCount(int bno);
}
