package com.kuliao.horcrux.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuliao.horcrux.api.OrderToolService;
import com.kuliao.horcrux.api.TestToolService;

/**
 * ϵͳ���ø�ҵ��ӿ���
 */
public final class ServiceLocator
{
    private static ServiceLocator instance;
    
    private static ClassPathXmlApplicationContext context = null;

    public static ServiceLocator getInstance()
    {
        if(instance!=null) return instance;
        else return instance = new ServiceLocator();
    }
    
    static{
    	context = new ClassPathXmlApplicationContext(new String[] { "classpath:spring-consumer.xml" });
		context.start();
    }
    
    private Object getService(String service)
    {
        return context.getBean(service);
    }
    
    /**
     * ����ҵ��ӿ�
     * @return IUserDBService
     */
    public TestToolService getTestToolService()
    {
        return (TestToolService)this.getService("testToolService");
    }
    
    /**
     * ������Ϣҵ��ӿ�
     * @return IUserAccountInfoDBService
     */
    public OrderToolService getOrderToolService()
    {
        return (OrderToolService)this.getService("orderToolService");
    }
}