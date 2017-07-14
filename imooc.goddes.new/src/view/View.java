package view;

import java.util.Scanner;

import action.GoddessAction;
import model.Goddess;

public class View {
	private static final String CONTXT = "欢迎来到女神禁区: \n" + 
			"下面是女神禁区的功能列表：\n" + 
			"[MAIN/M]:主菜单" + 
			"[QUERY/Q]:查看女神信息\n" +
			"[GET/G]:查看单个女神信息\n" + 
			"[ADD/A]:添加女神信息\n" +
			"[UPDATE/U]:更新女神信息\n" + 
			"[DELETE/D]: 删除女神信息\n" + 
			"[EXIT/E]: 退出女神禁区\n" + 
			"[BREAK/B]: 退出当前功能，返回主菜单";
	private static final String OPERATION_MAIN = "MAIN";
	private static final String OPERATION_QUERY = "QUERY";
	private static final String OPERATION_GET = "GET";
	private static final String OPERATION_ADD = "ADD";
	private static final String OPERATION_UPDATE = "UPDATE";
	private static final String OPERATION_DELETE = "DELETE";
	private static final String OPERATION_EXIT = "EXIT";
	private static final String OPERATION_BREAK = "BREAK";
	
	public static void main(String[] args) {
		System.out.println(CONTXT);
		Scanner input=new Scanner(System.in);
		Goddess goddess=new Goddess();
		GoddessAction action=new GoddessAction();
		String prenious=null;
		Integer step=1;
		//保持程序一直运行
		while(true){
			String in=input.next().toString();
			if(OPERATION_EXIT.equals(in.toUpperCase())){
				System.out.println("您已成功退出！");
				break;
			}else if(OPERATION_ADD.equals(in.toUpperCase())||OPERATION_ADD.equals(prenious)){
				prenious=OPERATION_ADD;
				//添加女神
				if(1==step){
				System.out.println("请输入姓名");
				}else if(2==step){
					goddess.setName(in);
					System.out.println("请输入年龄");
				}else if(3==step){
					goddess.setAge(Integer.valueOf(in));
					System.out.println("请输入email");
				}else if(4==step){
					goddess.setEmail(in);
					try {
						action.add(goddess);
						System.out.println("成功");
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
						System.out.println("失败");
					}
				}			
				step++;
				
			}else{
				System.out.println("您输入的值为：");
			}
			
		}
	}
}
