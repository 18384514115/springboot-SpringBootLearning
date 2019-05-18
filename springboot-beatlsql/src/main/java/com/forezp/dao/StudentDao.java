package com.forezp.dao;

import com.forezp.entity.Account;
import com.forezp.entity.Student;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * @program: springboot-beatlsql
 * @description:
 * @author: lichunkai
 * @create: 2019-05-17 16:22
 **/
public interface StudentDao  extends BaseMapper<Student> {

    List<Student> testName();
}
