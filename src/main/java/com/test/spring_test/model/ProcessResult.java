package com.test.spring_test.model;

import com.test.spring_test.enums.Status;
import lombok.Data;

import javax.persistence.*;


@Data
@Table
@Entity
public class ProcessResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Status status;

    @OneToOne
    @JoinColumn
    private Money money;
}
