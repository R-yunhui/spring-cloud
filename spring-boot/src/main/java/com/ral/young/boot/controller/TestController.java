package com.ral.young.boot.controller;

import com.ral.young.boot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/test/{code}")
    public String test(@PathVariable(value = "code") int code) {
        return testService.updateData(code);
    }
}
