package com.ral.young.boot.controller;

import com.ral.young.boot.service.TestService;
import com.ral.young.boot.vo.TestVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author renyunhui
 * @date 2024-08-12 17:04
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping(value = "/updateData/{code}")
    public String updateData(@PathVariable(value = "code") int code) {
        return testService.updateData(code);
    }

    @GetMapping(value = "/updateToken/{token}")
    public String updateToken(@PathVariable(value = "token") String token) {
        return testService.updateToken(token);
    }

    @PostMapping(value = "/testSendAlarmDataOne")
    public void testOne(@RequestBody TestVO testVO) {
        testService.testSendAlarmDataOne(testVO);
    }

    @GetMapping(value = "/sendToBigModel")
    public void sendToBigModel(String token) {
        testService.sendToBigModel(token);
    }

}
