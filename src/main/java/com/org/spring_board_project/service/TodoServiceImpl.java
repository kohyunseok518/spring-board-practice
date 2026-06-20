package com.org.spring_board_project.service;

import com.org.spring_board_project.domain.TodoVO;
import com.org.spring_board_project.dto.TodoDTO;
import com.org.spring_board_project.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    // 자동 데이터 복사기
    private final TodoMapper todoMapper;
    // DB에서 데이터를 넣고 빼올 창고 관리자
    private final ModelMapper modelMapper;

    @Override
    public void register(TodoDTO todoDTO) {
        log.info(modelMapper);

        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);

        log.info(todoVO);

        todoMapper.insert(todoVO);
    }
}
