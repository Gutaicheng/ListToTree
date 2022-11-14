package com.gutaicheng.controller;

import com.gutaicheng.Utils.R;
import com.gutaicheng.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.gutaicheng.Utils.TreeUtils.*;

@RestController
@RequestMapping("/Region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public R getRegionTree(){
        return new R(true, convertListToBaseTree(regionService.getRegionTree()));
    }
}
