package com.sample.sys.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
* Class Name: BaseDomain
* Description: 鸡肋
*
*/
@EntityListeners(EntityListener.class)
@MappedSuperclass
public class BaseEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_ts")
    private Date createTs;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_ts")
    private Date updateTs;
    
   

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }


    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

   

}