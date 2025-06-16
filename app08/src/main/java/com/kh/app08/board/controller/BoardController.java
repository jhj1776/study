package com.kh.app08.board.controller;

import com.kh.app08.board.service.BoardService;
import com.kh.app08.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
    private final BoardService service;

    /**
     * 게시글 작성 화면
     */
    @GetMapping("insert")
    public void insert(){

    }

    @GetMapping("list")
    public void list(){

    }

}
