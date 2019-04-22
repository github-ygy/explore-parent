package com.ygy.shard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
@Data
@ToString
@AllArgsConstructor
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
}
