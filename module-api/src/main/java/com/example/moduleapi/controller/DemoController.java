package com.example.moduleapi.controller;

import com.example.moduleapi.exception.CustomException;
import com.example.moduleapi.service.DemoService;
import com.example.modulecommon.enums.CodeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/save")
    public String save() {
        return demoService.save();
    }

    @GetMapping("/find")
    public String find() {
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }

        return demoService.exception();
    }
}
