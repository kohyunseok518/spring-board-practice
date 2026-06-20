package com.org.spring_board_project.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Long tno;

    @NotEmpty
    private String title;

    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    private boolean finished;

    @NotEmpty
    private String writer;
}
