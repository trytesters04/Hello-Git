package com.ectest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginController extends HttpServlet{
	public void doGet(HttpServletRequest request,
						HttpServletResponse response) 
						throws IOException, ServletException{
		response.setContentType("text/htmle;charset = Shift_JIS");
		
		String serchBtn = ""; //ボタンが押されたか判断
		
		try {
			serchBtn = request.getParameter("btn");
			
			//ユーザID検索
			if(serchBtn != null && serchBtn.equals("")){
			}
			else 
				request.setAttribute("message","ユーザ番号検索してください");
		}catch(Exception e) {
			request.setAttribute("message","エラー");
		}
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher();
		rd.forward(request,response);
	}
	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws IOException, ServletException{
		doGet(request,response);
	}

}
