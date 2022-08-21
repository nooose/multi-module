package com.example.moduleapi.service;

import com.example.modulecommon.domain.Member;
import com.example.modulecommon.repositories.MemberRepository;
import com.example.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {
    private final CommonDemoService commonDemoService;
    private final MemberRepository memberRepository;

    public String save() {
        memberRepository.save(Member.builder()
                                    .name(Thread.currentThread().getName())
                                    .build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return "find";
    }

    public String exception() {
        return "exception";
    }
}
