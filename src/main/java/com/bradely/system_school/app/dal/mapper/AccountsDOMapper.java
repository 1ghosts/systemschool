package com.bradely.system_school.app.dal.mapper;

import com.bradely.system_school.app.dal.dataobject.AccountsDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 * The Table ACCOUNTS.
 * ACCOUNTS
 */
public interface AccountsDOMapper{

    /**
     * desc:插入表:ACCOUNTS.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO ACCOUNTS( OPERATOR ,PASSWORD ,USERNAME ,CREATE_TIME ,UPDATE_TIME )VALUES( #{operator,jdbcType=VARCHAR} ,#{password,jdbcType=VARCHAR} ,#{username,jdbcType=CHAR} ,#{createTime,jdbcType=TIMESTAMP} ,#{updateTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    Long insert(AccountsDO entity);
    /**
     * desc:更新表:ACCOUNTS.<br/>
     * descSql =  UPDATE ACCOUNTS SET OPERATOR = #{operator,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,USERNAME = #{username,jdbcType=CHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(AccountsDO entity);
    /**
     * desc:根据主键删除数据:ACCOUNTS.<br/>
     * descSql =  DELETE FROM ACCOUNTS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:ACCOUNTS.<br/>
     * descSql =  SELECT * FROM ACCOUNTS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return AccountsDO
     */
    AccountsDO getByPrimary(Long id);
}
