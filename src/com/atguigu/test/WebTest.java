package com.atguigu.test;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class WebTest {
	public static void main(String[] args) {
		PhoneCheckImplService phoneCheckImplService = new PhoneCheckImplService();
		PhoneCheck phone = phoneCheckImplService.getPhoneCheckImplPort();
		 String checkAreaByPhoneNum = phone.checkAreaByPhoneNum("665454");
		 System.out.println(checkAreaByPhoneNum);
		 String checkTypeByPhoneNum = phone.checkTypeByPhoneNum("663555");
		 System.out.println(checkTypeByPhoneNum);
		 System.out.println("我只是试试看看效果而已");
		 System.out.println("wocoa");
	}
}
