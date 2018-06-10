package com.bestsoyeah.service;

import com.bestsoyeah.model.QuestionsRes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/6/10.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public interface QuestionsService extends JpaRepository<QuestionsRes,Integer> {
//    public List<QuestionsRes> queryQuestions();
}