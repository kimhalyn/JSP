package kr.co.ch17.service.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ch17.dao.EmployeeDao;
import kr.co.ch17.service.CommonService;

public class DeleteService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
		
		String uid = req.getParameter("uid");
		
		EmployeeDao dao = EmployeeDao.getInstance();
		dao.deleteEmployee(uid);
		
		return "redirect:/Ch17/employee/list.do";
	}

}
