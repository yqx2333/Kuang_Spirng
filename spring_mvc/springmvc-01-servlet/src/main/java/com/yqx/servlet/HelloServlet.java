package com.yqx.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author fanzx
 * @create 2021/8/18 14:33
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取前端参数
        // 获取前端表单提交的参数
        String method = req.getParameter("method");
        // 进行判断
        if ("add".equals(method)){
            // 放入属性
            req.getSession().setAttribute("msg","执行了add方法");
        }
        if ("delete".equals(method)){
            req.getSession().setAttribute("msg","执行了delete方法");
        }
        // 调用业务层(没有业务层 暂时不做处理)
        // 视图转发 (或者重定向)
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
        // resp.sendRedirect();  重定向
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // this.doGet(req, resp);

        // 获取前端传入的数据
        String method = req.getParameter("method");
        if ("add".equals(method)){
            System.out.println("我也不知道addd");
        }else if ("delete".equals(method)){
            System.out.println("我也不知道deleted");
        }else{
            System.out.println("我也不知道" + method);
        }
        // 调用业务层
        // 视图转发
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
        // 重定向
        // resp.sendRedirect("/WEB-INF/jsp/test.jsp");
    }
}
