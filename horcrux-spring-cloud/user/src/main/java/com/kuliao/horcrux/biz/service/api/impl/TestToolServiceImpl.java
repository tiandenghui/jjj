package com.kuliao.horcrux.biz.service.api.impl;

import com.kuliao.horcrux.api.TestToolService;

public class TestToolServiceImpl implements TestToolService {

	 /**
	  * �����ṩ��ʵ�ֽӿڣ�(�Է������ѷ�����ʵ��)
	  */
    public String sayHello(String name) {
        System.out.println("����provider����");
        return "hello=="+name;
    }

}
