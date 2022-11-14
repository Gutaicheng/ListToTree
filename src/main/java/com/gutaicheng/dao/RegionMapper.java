package com.gutaicheng.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gutaicheng.domain.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegionMapper {
    @Select("select * from region ")
    List<Region> getRegionTree();
}
