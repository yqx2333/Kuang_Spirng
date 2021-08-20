package com.yqx.service;

import com.yqx.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/20 11:09
 */
public interface BooksService {

    int addBooks(Books books);

    int updateBooks(Books books);

    List<Books> selectAll();

    Books selectById(@Param("bookId") Integer id);

    int deleteBooksById(@Param("bookId") Integer id);

}
