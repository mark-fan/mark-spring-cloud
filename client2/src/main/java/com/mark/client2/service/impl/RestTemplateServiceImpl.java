package com.mark.client2.service.impl;

import com.mark.client2.constant.HttpUrlConstants;
import com.mark.client2.service.IRestTemplateService;
import com.mark.common.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * @author luofan
 */
@Service
public class RestTemplateServiceImpl implements IRestTemplateService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseResult getClient(String input) {
        //get请求1
        String url = HttpUrlConstants.CLIENT1 + "/client/{input}";
//        Map<Object, Object> param = new HashMap<>();
//        param.put("input", input);
//        return restTemplate.getForEntity(url, ResponseResult.class, param).getBody();
        //方法二
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("name", "这是name");
        params.add("id", "1");
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        URI uri = builder.queryParams(params).build().encode().toUri();
        return restTemplate.getForEntity(uri, ResponseResult.class).getBody();
    }
}
