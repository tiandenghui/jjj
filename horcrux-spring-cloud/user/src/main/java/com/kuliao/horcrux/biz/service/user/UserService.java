package com.kuliao.horcrux.biz.service.user;

import java.util.List;
import java.util.Map;

public interface UserService {

	/**
	 * ��ȡ�û���Ϣ����
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> queryUserList(Map<String, Object> params);
}
