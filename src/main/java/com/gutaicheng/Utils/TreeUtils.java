package com.gutaicheng.Utils;

import com.gutaicheng.domain.BaseTree;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {
    /**
     * 将List转换为Tree
     */
    public static <T extends BaseTree<T>> List<BaseTree<T>> convertListToBaseTree(List<T> tList){
        //树列表
        List<BaseTree<T>> BaseTreeList = new ArrayList<>();
        if(tList != null && tList.size() > 0){
            for(T t:tList){
                //判断该节点是否存在父id，或者是是否是顶级节点
                if(!isBaseTreeExist(tList,t.getParentId())){
                    //不存在以父ID为ID的点，说明是当前点是顶级节点
                    BaseTree<T> tBaseTree = getBaseTreeByT(t, tList);
                    BaseTreeList.add(tBaseTree);
                }
            }
        }
        return BaseTreeList;
    }

    /**
     * 判断是否是顶级节点
     */
    private static <T extends BaseTree<T>> Boolean isBaseTreeExist(List<T> tList, String pid) {
        for (T t : tList) {
            if (t.getId().equals(pid)){
                return true;
            }
        }
        return false;
    }

    /**
     * 获取节点详情
     */
    private static <T extends BaseTree<T>> BaseTree<T> getBaseTreeByT(T t, List<T> tList){
        BaseTree<T> tTreeDot = new BaseTree<>();
        tTreeDot.setId(t.getId());
        tTreeDot.setParentId(t.getParentId());
        tTreeDot.setTitle(t.getTitle());
        tTreeDot.setChecked(t.getChecked());
        tTreeDot.setAttributes(t.getAttributes());
        //获取该节点下的子树
        tTreeDot.setChildren(getChildTreeList(tTreeDot,tList));
        return tTreeDot;
    }

    /**
     * 获取父节点下的子树
     */

    private static <T extends BaseTree<T>> List<BaseTree<T>> getChildTreeList(BaseTree<T> parentTreeDot, List<T> tList){
        List<BaseTree<T>> childTreeList = new ArrayList<>();
        for(T t:tList){
            if(parentTreeDot.getId().equals(t.getParentId())){
                //如果父ID是传递树点的ID，那么就是传递树点的子点
                BaseTree<T> tTreeDot = getBaseTreeByT(t,tList);
                childTreeList.add(tTreeDot);
            }
        }
        return childTreeList;
    }



}
