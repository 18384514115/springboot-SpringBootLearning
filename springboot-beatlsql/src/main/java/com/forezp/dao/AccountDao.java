package com.forezp.dao;

import com.forezp.entity.Account;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */

public interface AccountDao extends BaseMapper<Account> {

/*    @SqlStatement(params = "name")
    Account selectAccountByName( String name);  //两种参数说明*/

    Account selectAccountByName(@Param(value = "name") String name);


    List<Account>  testName();
}
