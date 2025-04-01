package org.pgm.thymeleafex.service;

import org.pgm.thymeleafex.dto.BoardDTO;
import java.util.List;


public interface BoardService {
    List<BoardDTO> getList();
    BoardDTO getBoard(int bno);
    void register(BoardDTO board);
    void modify(BoardDTO board);
    void remove(int bno);
}
