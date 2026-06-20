package com.org.spring_board_project.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 해당 클래스가 XML을 대신하는 환경 설정 파일임을 알려주는 어노테이션
@Configuration
public class ModelMapperConfig {

    // 해당 메서드가 반환하는 객체(ModelMapper)를 스프링 빈으로 등록하라는 어노테이션
    @Bean
    public ModelMapper getMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true) // 필드의 이름이 같으면 매칭
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        return modelMapper;
    }
}

/*
* 필드 이름이 같으면 매칭
* private 변수라도 접근
* 이름이 완뵥히 똑같지 않고 헐겁게(LOOSE) 비슷해도 똑똑하게 복사
 */
