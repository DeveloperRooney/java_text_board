package com.sbs.exam.app.repository;

import java.util.ArrayList;
import java.util.List;

import com.sbs.exam.app.dto.Board;
import com.sbs.exam.util.Util;

public class BoardRepository {
    private List<Board> boards;
    private int lastId;

    public BoardRepository() {
        boards = new ArrayList<>();
        lastId = 0;
    }

    public int write(String title, String body) {
        int id = lastId + 1;
        int boardId = 1;
        String regDate = Util.getNowDateStr();
        String updateDate = regDate;

        Board article = new Board(id, boardId, regDate, updateDate, title, body);
        boards.add(article);

        lastId = id;

        return id;
    }

    public void deleteArticleById(int id) {
        Board board = getArticleById(id);

        if ( board != null ) {
            boards.remove(board);
        }
    }

    public Board getArticleById(int id) {
        for ( Board article : boards ) {
            if ( article.getId() == id ) {
                return article;
            }
        }

        return null;
    }

    public List<Board> getArticles() {
        return boards;
    }

}
