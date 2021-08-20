package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fanzx
 * @create 2021/8/20 10:57
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Books implements Serializable {

    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;

}
