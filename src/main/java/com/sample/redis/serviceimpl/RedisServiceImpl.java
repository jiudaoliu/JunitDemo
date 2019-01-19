/**   
 * @Title: RedisServiceImpl.java 
 * @Package com.sample.redis.serviceimpl 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author �����ߣ�  
 * @date May 25, 2018 2:53:18 PM 
 * @version V1.0   
 */
package com.sample.redis.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sample.redis.constant.CacheConstants;
import com.sample.redis.service.RedisService;
import com.sample.sys.entity.UsersEntity;
import com.sample.sys.respoitory.UsersRespoitory;

/**
 * @Description:
 * 
 * @author
 * @date May 25, 2018 2:53:18 PM
 */
@Service
public class RedisServiceImpl implements RedisService {
	
	@Autowired
	private UsersRespoitory usersRespoitory;
	/**
	 * @Description:
	 *
	 * @author
	 * @date May 28, 2018 2:10:18 PM
	 */
	@Override
	@CachePut(value = CacheConstants.USERINF_CACHE, key = "'USERINF_CACHE_'+#usersEntity.id")
	public UsersEntity updateUserInfo(UsersEntity usersEntity) {
		// TODO Auto-generated method stub
		usersRespoitory.save(usersEntity);
		return usersEntity;
	}

	@Override
	@Cacheable(value = CacheConstants.USERINF_CACHE, key = "'USERINF_CACHE_'+#userid")
	public UsersEntity getUserInfo(int userid) {
		// TODO Auto-generated method stub
		return usersRespoitory.findOne(userid);
	}
	
	
}
