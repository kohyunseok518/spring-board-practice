package com.org.spring_board_project.mapper;

import com.org.spring_board_project.domain.TodoVO;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);
}
