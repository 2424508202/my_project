package action;


import goddessDate.GoddessDate;
import model.Goddess;

public class GoddessAction {

		//����Ů�񷽷�
		public void add(Goddess goddess) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.addGoddess(goddess);
		}
		//�޸�Ů�񷽷�
		public void update(Goddess goddess) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.updateGoddess(goddess);
		}
		//ɾ��Ů�񷽷�
		public void del(Integer id) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.deleteGoddess(id);
		}
		//��ѯ����Ů��
		public Goddess get(Integer id) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			return dao.getGoddess(id);
		}
		
		
	}
