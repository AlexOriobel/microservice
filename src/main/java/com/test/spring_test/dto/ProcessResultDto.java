package com.test.spring_test.dto;

import com.test.spring_test.enums.Status;
import com.test.spring_test.model.Money;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProcessResultDto implements Serializable {

    private Long id;
    private Status status;
    private Money money;

}
