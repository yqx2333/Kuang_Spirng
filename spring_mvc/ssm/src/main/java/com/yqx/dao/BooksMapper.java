package com.yqx.dao;

import com.yqx.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/20 11:07
 */
public interface BooksMapper {

    int addBooks(Books books);

    int updateBooks(Books books);

    List<Books> selectAll();

    Books selectById(@Param("bookId") Integer id);

    int deleteBooksById(@Param("bookId") Integer id);



}
