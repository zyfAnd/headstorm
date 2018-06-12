package com.bestsoyeah.service;

import com.bestsoyeah.model.QuestionsRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/6/10.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public interface QuestionsService extends JpaRepository<QuestionsRes,Integer>, JpaSpecificationExecutor<QuestionsRes> {

//    public List<QuestionsRes> queryQuestions();
    @Query(value="select * from t_question order by RAND() limit ?1", nativeQuery=true)
    public List<QuestionsRes> randomQUestion(Integer n);
}