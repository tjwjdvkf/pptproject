package com.sjh.signup;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/signup/*")
public class SingupController {
    
    @Inject
    private SignupService signupService;
    
    //SignUp GET
    @RequestMapping(value="/signup.do", method=RequestMethod.GET)
    public void signupGET() {
        
    }
    
    //SignUp PSOT
    @RequestMapping(value="/signup.do", method=RequestMethod.POST)
    public String signupPOST(SignupVO signVO) {
       
        signupService.insertMember(signVO);
        
        return "redirect:/main.do";
    }
    
    
    @RequestMapping("/idcheck.do")
    @ResponseBody
    public Map<Object, Object> idcheck(@RequestBody String userid) {
    	
    	int count = 0;
		Map<Object, Object> map = new HashMap<Object, Object>();

		count = signupService.idcheck(userid);
		map.put("cnt", count);

		return map;
    }
}