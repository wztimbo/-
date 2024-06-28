package com.example.medicalsystem.controller;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AI")

public class AIChat {

    @Resource
    private SparkManager sparkManager;

    @PostMapping("/analyze")
    // 处理ECG指标分析的请求
    public String analyzeECGIndicators(@RequestBody PhysicalIndicatorsVO physicalIndicatorsVO) {
        String string = physicalIndicatorsVO.toString();
        String userInput="这是一份我身体的各项指标，请你分析是亚健康，并给出建议"+string;
        String result = sparkManager.sendMesToAIUseXingHuo(userInput);
         return result;

    }

    @PostMapping("/AIanswer")
     public String answerQuestion(@RequestParam String question) {
        String userInput = "用户提问：" + question;
        String answer = sparkManager.sendMesToAIUseXingHuo(userInput); // 调用 AI 接口获取答案
        return answer;
    }




}
