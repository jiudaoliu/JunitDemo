/**   
 * @Title: UsersRespoitory.java 
 * @Package com.sample.sys.respoitory 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author （作者）  
 * @date May 25, 2018 3:20:46 PM 
 * @version V1.0   
 */
package com.sample.sys.respoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.sample.sys.entity.UsersEntity;

/**
 * @Description:
 * 
 * @date May 25, 2018 3:20:46 PM
 */
public interface UsersRespoitory extends JpaRepository<UsersEntity, Integer>, JpaSpecificationExecutor<UsersEntity> {

	@Query(value = "select * from users where username = ?1", nativeQuery = true)
	UsersEntity getUserInfoByUserName(String username);
}
