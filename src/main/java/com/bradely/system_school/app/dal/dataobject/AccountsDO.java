package com.bradely.system_school.app.dal.dataobject;

import java.util.Date;

/**
 * The table ACCOUNTS
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 */
public class AccountsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * operator 操作人.
     */
    private String operator;
    /**
     * password 密码——用户名+密码MD5加密.
     */
    private String password;
    /**
     * username 用户名——唯一不能为空.
     */
    private String username;
    /**
     * createTime 创建时间.
     */
    private Date createTime;
    /**
     * updateTime 更新时间.
     */
    private Date updateTime;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set operator 操作人.
     */
    public void setOperator(String operator){
        this.operator = operator;
    }

    /**
     * Get operator 操作人.
     *
     * @return the string
     */
    public String getOperator(){
        return operator;
    }

    /**
     * Set password 密码——用户名+密码MD5加密.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Get password 密码——用户名+密码MD5加密.
     *
     * @return the string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set username 用户名——唯一不能为空.
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Get username 用户名——唯一不能为空.
     *
     * @return the string
     */
    public String getUsername(){
        return username;
    }

    /**
     * Set createTime 创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set updateTime 更新时间.
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
     * Get updateTime 更新时间.
     *
     * @return the string
     */
    public Date getUpdateTime(){
        return updateTime;
    }
}
