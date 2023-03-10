package com.mark.client2.controller;

import com.mark.client2.service.IFeignService;
import com.mark.client2.service.IRestTemplateService;
import com.mark.common.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luofan
 */
@RestController
public class FeignController {

    @Autowired
    private IFeignService feignService;

    @Autowired
    private IRestTemplateService restTemplateService;

    @GetMapping("/do/{input}")
    public ResponseResult grab(@PathVariable("input") int input){
        return ResponseResult.success(feignService.getClient(String.valueOf(input)));
    }

    @RequestMapping("/dorest/{input}")
    public ResponseResult testrest(@PathVariable("input") int input){
        return ResponseResult.success(restTemplateService.getClient(String.valueOf(input)));
    }

    //使用whichOne测负载均衡
    @RequestMapping("/ribbon")
    public ResponseResult ribbon(){
        return ResponseResult.success(feignService.whichOne());
    }
}
