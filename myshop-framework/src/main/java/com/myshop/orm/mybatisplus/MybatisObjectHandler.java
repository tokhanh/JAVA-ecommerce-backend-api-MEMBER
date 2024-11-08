package com.myshop.orm.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Field Auditing
 *
 * @author vantrang
 */
@Component
public class MybatisObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        final Logger logger = LoggerFactory.getLogger(MybatisObjectHandler.class);
        //TODO: triển khai với các vai trò khác nhau
    }

    @Override
    public void updateFill(MetaObject metaObject) {

        //TODO: triển khai với các vai trò
    }
}