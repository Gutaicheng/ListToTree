package com.gutaicheng.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 树点
 * 需要实现树的类可以继承该类，手写set方法，在设定 本身属性值 时同时设置该类中的相关属性
 */

@Data
public class BaseTree<T> {
    /**
     * 当前节点ID
     */
    private String id;
    /**
     * 当前节点名称
     */
    private String title;
    /**
     * 父ID
     */
    private String parentId;
    /**
     * 当前是否展开 默认不展开
     */
    private Boolean spread = false;
    /**
     * 当前节点是否选中
     */
    private Boolean checked = false;
    /**
     * 该点的其他属性， 根据实体类
     */
    private Map<String, Object> attributes = new HashMap<>();
    /**
     * 当前节点的子树集合
     */
    private List<BaseTree<T>> children = new ArrayList<>();

}
