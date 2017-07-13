package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.QueryService;

/**
 * 鍒楄〃椤甸潰鍒濆鍖栧拰鏌ヨ鎺у埗
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 璁剧疆缂栫爜
		req.setCharacterEncoding("UTF-8");
		// 鎺ュ彈椤甸潰鐨勫��
		String command = req.getParameter("command");
		String description = req.getParameter("description");
		// 鍚戦〉闈紶鍊�
		req.setAttribute("command", command);
		req.setAttribute("description", description);
		QueryService listService = new QueryService();
		// 鏌ヨ娑堟伅鍒楄〃骞朵紶缁欓〉闈�
		req.setAttribute("messageList", listService.queryMessageList(command, description));
		// 鍚戦〉闈㈣烦杞�
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}