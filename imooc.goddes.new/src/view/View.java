package view;

import java.util.Scanner;

import action.GoddessAction;
import model.Goddess;

public class View {
	private static final String CONTXT = "��ӭ����Ů�����: \n" + 
			"������Ů������Ĺ����б�\n" + 
			"[MAIN/M]:���˵�" + 
			"[QUERY/Q]:�鿴Ů����Ϣ\n" +
			"[GET/G]:�鿴����Ů����Ϣ\n" + 
			"[ADD/A]:���Ů����Ϣ\n" +
			"[UPDATE/U]:����Ů����Ϣ\n" + 
			"[DELETE/D]: ɾ��Ů����Ϣ\n" + 
			"[EXIT/E]: �˳�Ů�����\n" + 
			"[BREAK/B]: �˳���ǰ���ܣ��������˵�";
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
		//���ֳ���һֱ����
		while(true){
			String in=input.next().toString();
			if(OPERATION_EXIT.equals(in.toUpperCase())){
				System.out.println("���ѳɹ��˳���");
				break;
			}else if(OPERATION_ADD.equals(in.toUpperCase())||OPERATION_ADD.equals(prenious)){
				prenious=OPERATION_ADD;
				//���Ů��
				if(1==step){
				System.out.println("����������");
				}else if(2==step){
					goddess.setName(in);
					System.out.println("����������");
				}else if(3==step){
					goddess.setAge(Integer.valueOf(in));
					System.out.println("������email");
				}else if(4==step){
					goddess.setEmail(in);
					try {
						action.add(goddess);
						System.out.println("�ɹ�");
					} catch (Exception e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
						System.out.println("ʧ��");
					}
				}			
				step++;
				
			}else{
				System.out.println("�������ֵΪ��");
			}
			
		}
	}
}
