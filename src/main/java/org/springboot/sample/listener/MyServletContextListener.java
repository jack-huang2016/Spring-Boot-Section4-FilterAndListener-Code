package org.springboot.sample.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 使用@WebListener注解，实现ServletContextListener接口
 *
 * @author    huang.yj
 * @create    2018年12月08日
 */
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContex销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		 System.out.println("ServletContex初始化");
	     System.out.println(sce.getServletContext().getServerInfo());
	}
}
