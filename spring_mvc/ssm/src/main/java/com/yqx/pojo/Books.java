package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/20 10:57
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;

}
