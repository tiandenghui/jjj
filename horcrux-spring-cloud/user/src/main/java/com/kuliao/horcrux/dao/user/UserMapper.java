package com.kuliao.horcrux.dao.user;

import java.util.List;
import java.util.Map;

public interface UserMapper {

	/**
	 * ��ȡ�û���Ϣ����
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> queryUserList(Map<String, Object> params);
}
