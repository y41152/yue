package com.huai.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huai.controller.base.BaseController;
import com.huai.util.Const;
import com.huai.util.PageData;
import com.huai.util.Tools;

/**
 * 主程序入口登陆类
 * @author huai
 * @date 2016年10月18日
 * @version V1.0
 */
@Controller
@RequestMapping(value="/login")
public class LoginAction extends BaseController{
	
	/**访问登录页
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login_toLogin")
	public ModelAndView toLogin()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME)); //读取系统名称
		mv.setViewName("jsp/system/login/login");
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**得到ModelAndView
	 * @return
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}

}
