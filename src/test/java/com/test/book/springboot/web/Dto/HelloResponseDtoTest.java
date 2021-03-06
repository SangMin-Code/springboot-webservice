package com.test.book.springboot.web.Dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokFunctionTest(){
        //given
        String name ="hello";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);



        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
