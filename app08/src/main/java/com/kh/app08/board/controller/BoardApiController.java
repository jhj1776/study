package com.kh.app08.board.controller;

import com.kh.app08.board.service.BoardService;
import com.kh.app08.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/board")
@RequiredArgsConstructor
public class BoardApiController {
    private final BoardService service;

    /**
     * 게시글 작성
     */
    @PostMapping("insert")
    public int insert(@RequestBody BoardVo vo) {
        vo.setWriterNo("1");
        int result = service.insert(vo);
        return result;
    }

    /**
     * 게시글목록
     */
    @GetMapping("list")
    public List<BoardVo> list() {
        List<BoardVo> voList = service.getBoardList();
        System.out.println("voList = " + voList);
        return voList;
    }
}
