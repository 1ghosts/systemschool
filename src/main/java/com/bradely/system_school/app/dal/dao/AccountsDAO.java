package com.bradely.system_school.app.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bradely.system_school.app.dal.dataobject.AccountsDO;
import com.bradely.system_school.app.dal.mapper.AccountsDOMapper;

/**
* The Table ACCOUNTS.
* 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
* ACCOUNTS
*/
@Repository
public class AccountsDAO{

    @Autowired
    private AccountsDOMapper accountsDOMapper;

    /**
     * desc:插入表:ACCOUNTS.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO ACCOUNTS( OPERATOR ,PASSWORD ,USERNAME ,CREATE_TIME ,UPDATE_TIME )VALUES( #{operator,jdbcType=VARCHAR} ,#{password,jdbcType=VARCHAR} ,#{username,jdbcType=CHAR} ,#{createTime,jdbcType=TIMESTAMP} ,#{updateTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    public Long insert(AccountsDO entity){
        return accountsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:ACCOUNTS.<br/>
     * descSql =  UPDATE ACCOUNTS SET OPERATOR = #{operator,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,USERNAME = #{username,jdbcType=CHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(AccountsDO entity){
        return accountsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:ACCOUNTS.<br/>
     * descSql =  DELETE FROM ACCOUNTS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return accountsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:ACCOUNTS.<br/>
     * descSql =  SELECT * FROM ACCOUNTS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return AccountsDO
     */
    public AccountsDO getByPrimary(Long id){
        return accountsDOMapper.getByPrimary(id);
    }
}
