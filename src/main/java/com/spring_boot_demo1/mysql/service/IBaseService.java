package com.spring_boot_demo1.mysql.service;


import java.util.List;

/**
 * mybatis
 *
 * @param <T>
 */

public interface IBaseService<T> {
    /**
     * 保存
     */
    Integer save(T t);

    /**
     * 删除
     */
    void delete(Integer id);

    /**
     * 通过id查询
     */
    T findById(Integer id);

    /**
     * 更新
     */
    void update(T t);

    /**
     * 返回所有信息
     */
    List<T> list();
}
