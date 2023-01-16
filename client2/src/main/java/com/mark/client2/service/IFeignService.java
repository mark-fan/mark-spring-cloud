package com.mark.client2.service;

import com.mark.common.dto.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author luofan
 */
@FeignClient(name="mark-client1")
public interface IFeignService {

    @RequestMapping(value = "/client/{input}", method = RequestMethod.GET)
    public ResponseResult getClient(@PathVariable("input") String input);
}
