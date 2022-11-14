package com.gutaicheng.service.Impl;

import com.gutaicheng.dao.RegionMapper;
import com.gutaicheng.domain.Region;
import com.gutaicheng.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> getRegionTree() {
        return regionMapper.getRegionTree();
    }
}
