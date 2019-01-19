package com.sample.sys.entity;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;


/**
 * Class Name: EntityListener
 * Description: 
 *
 */
public class EntityListener {
    /**
     * 保存前处�?.
     * 
     * @param entity
     *            基类
     */
    @PrePersist
    public void prePersist(BaseEntity entity) {
    	entity.setCreateTs(new Date());
    }

    /**
     * 更新前处�?.
     * 
     * @param entity
     *            基类
     */
    @PreUpdate
    public void preUpdate(BaseEntity entity) {
    	entity.setUpdateTs(new Date());
    }
}
