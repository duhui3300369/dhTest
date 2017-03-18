package com.atguigu.test;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class WebTest {
	public static void main(String[] args) {
		PhoneCheckImplService phoneCheckImplService = new PhoneCheckImplService();
		PhoneCheck phone = phoneCheckImplService.getPhoneCheckImplPort();
		 String checkAreaByPhoneNum = phone.checkAreaByPhoneNum("15176014151");
		 System.out.println(checkAreaByPhoneNum);
		 String checkTypeByPhoneNum = phone.checkTypeByPhoneNum("15176014151");
		 System.out.println(checkTypeByPhoneNum);
	}
}
