package imooc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import imooc.bean.User;
import sun.awt.ModalExclude;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user=new User();
	public String login(){
		if(user.getName()==null||"".equals(user.getName()))
			this.addFieldError("name", "用户名不能为空");
			return INPUT;
	}
	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
		return user;
	}
	@Override
	public void validate() {
		if(user.getName()==null||"".equals(user.getName()))
			this.addFieldError("name", "用户名不能为空");
	}
	
}
