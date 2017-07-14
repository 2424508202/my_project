package action;


import goddessDate.GoddessDate;
import model.Goddess;

public class GoddessAction {

		//新增女神方法
		public void add(Goddess goddess) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.addGoddess(goddess);
		}
		//修改女神方法
		public void update(Goddess goddess) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.updateGoddess(goddess);
		}
		//删除女神方法
		public void del(Integer id) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			dao.deleteGoddess(id);
		}
		//查询单个女神
		public Goddess get(Integer id) throws Exception
		{
			GoddessDate dao = new GoddessDate();
			return dao.getGoddess(id);
		}
		
		
	}
