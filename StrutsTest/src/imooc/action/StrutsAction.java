package imooc.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StrutsAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("执行Action");
		return SUCCESS;
	}
	
}
