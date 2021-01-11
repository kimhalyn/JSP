package kr.co.ch17.service.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ch17.dao.EmployeeDao;
import kr.co.ch17.service.CommonService;
import kr.co.ch17.vo.EmployeeVo;

public class RegisterService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {

		if(req.getMethod().equals("POST")) {
			
			// 파라미터 수신
			String uid    = req.getParameter("uid");
			String name   = req.getParameter("name");
			String gender = req.getParameter("gender");
			String hp     = req.getParameter("hp");
			String email  = req.getParameter("email");
			String pos    = req.getParameter("pos");
			String dep    = req.getParameter("dep");
			
			EmployeeVo vo = new EmployeeVo();
			vo.setUid(uid);
			vo.setName(name);
			vo.setGender(gender);
			vo.setHp(hp);
			vo.setEmail(email);
			vo.setPos(pos);
			vo.setDep(dep);
			
			EmployeeDao.getInstance().insertEmployee(vo);
			
			// 리다이렉트
			return "redirect:/Ch17/employee/list.do";
			
		}else {
			// Get 요청일때
			return "/employee/register.jsp";
		}
		
	}
}