package com.yqx.service.impl;

import com.yqx.dao.BooksMapper;
import com.yqx.pojo.Books;
import com.yqx.service.BooksService;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/20 11:07
 */
public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    // Spring注入
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBooks(Books books) {
        return booksMapper.addBooks(books);
    }

    @Override
    public int updateBooks(Books books) {
        return booksMapper.updateBooks(books);
    }

    @Override
    public List<Books> selectAll() {
        return booksMapper.selectAll();
    }

    @Override
    public Books selectById(Integer id) {
        return booksMapper.selectById(id);
    }

    @Override
    public int deleteBooksById(Integer id) {
        return booksMapper.deleteBooksById(id);
    }
}
