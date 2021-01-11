package kr.co.ch17.service.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ch17.dao.EmployeeDao;
import kr.co.ch17.service.CommonService;
import kr.co.ch17.vo.EmployeeVo;

public class ModifyService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {

		if(req.getMethod().equals("POST")) {
			
			String uid  = req.getParameter("uid");
			String name = req.getParameter("name");
			String hp   = req.getParameter("hp");
			String pos  = req.getParameter("pos");
			String dep  = req.getParameter("dep");
			
			EmployeeDao.getInstance().updateEmployee(uid, name, hp, pos, dep);
			
			return "redirect:/Ch17/employee/list.do";
			
		}else {
			// Get 요청 일때
			String uid = req.getParameter("uid");
			
			EmployeeDao dao = EmployeeDao.getInstance();
			EmployeeVo vo = dao.selectEmployee(uid);
			
			req.setAttribute("vo", vo);
			
			return "/employee/modify.jsp";
		}
		
	}

}