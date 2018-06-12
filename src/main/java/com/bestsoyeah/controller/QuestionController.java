package com.bestsoyeah.controller;

import com.bestsoyeah.model.QuestionsRes;
import com.bestsoyeah.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/6/10.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@RestController
//@RequestMapping(value = "headstorm")
public class QuestionController {
    @Autowired
    QuestionsService questionsService;
    @RequestMapping(value = "question/get_rand")
    public List<QuestionsRes> getApiData() {
        List<QuestionsRes> questionsRes = questionsService.randomQUestion(5);
//        System.out.print(questionsRes);
        return questionsRes;
    }
}
