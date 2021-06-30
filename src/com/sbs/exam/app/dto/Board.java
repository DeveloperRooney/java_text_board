package com.sbs.exam.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Board {
    private int id;
    private int boardId;
    private String regDate;
    private String updateDate;
    private String title;
    private String body;
}
