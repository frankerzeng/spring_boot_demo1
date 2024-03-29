package com.spring_boot_demo1.mysql.service.impl;

import com.spring_boot_demo1.mysql.dao.BaseMapper;
import com.spring_boot_demo1.mysql.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * mybatis
 *
 * @param <T>
 */
@Transactional(rollbackFor = Exception.class)
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Override
    public void delete(Integer id) {
        baseMapper.delete(id);
    }

    @Autowired
    protected BaseMapper<T> baseMapper;

    @Override
    public Integer save(T t) {
        return baseMapper.save(t);
    }

    @Override
    public void update(T t) {
        baseMapper.update(t);
    }

    @Override
    public T findById(Integer id) {
        return baseMapper.findById(id);
    }


    @Override
    public List<T> list() {
        return baseMapper.list();
    }
}
