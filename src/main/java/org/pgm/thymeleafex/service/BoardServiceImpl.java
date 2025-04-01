package org.pgm.thymeleafex.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.pgm.thymeleafex.dto.BoardDTO;
import org.pgm.thymeleafex.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service        //내가 서비스입니다.
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;


    @Override
    public List<BoardDTO> getList() {
        return boardMapper.selectAll();
    }

    @Override
    public BoardDTO getBoard(int bno) {
        boardMapper.updateReadCount(bno);
        return boardMapper.selectByBno(bno);
    }

    @Override
    public void register(BoardDTO board) {
        boardMapper.insertBoard(board);
    }

    @Override
    public void modify(BoardDTO board) {
        boardMapper.updateByBno(board);
    }

    @Override
    public void remove(int bno) {
        boardMapper.deleteByBno(bno);
    }
}
