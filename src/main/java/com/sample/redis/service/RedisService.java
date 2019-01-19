/**   
* @Title: RedisService.java 
* @Package com.sample.redis.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author �����ߣ�  
* @date May 25, 2018 2:52:17 PM 
* @version V1.0   
*/
package com.sample.redis.service;

import com.sample.sys.entity.UsersEntity;

/** 
 * @Description:
 * 
 * @author   
 * @date May 25, 2018 2:52:17 PM 
 */
public interface RedisService {

	UsersEntity updateUserInfo(UsersEntity usersEntity);

	UsersEntity getUserInfo(int userid);
	
}
