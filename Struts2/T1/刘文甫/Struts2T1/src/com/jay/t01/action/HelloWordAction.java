/**
 * admin
 * 2017年11月21日
 */
package com.jay.t01.action;

import com.opensymphony.xwork2.Action;

/**
 * @author admin
 *
 */
public class HelloWordAction implements Action {
	//保存的数据
	private String content;//自定义数据
	private String uname;//请求参数数据
	
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Action#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO 处理业务
		content = "Hello " + uname;
		return "abc";
	}



	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}



	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}



	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}



	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

}
