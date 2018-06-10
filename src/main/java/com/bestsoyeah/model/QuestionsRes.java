package com.bestsoyeah.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


/**
 * @Authour Zhang Yanfu
 * @Date 2018/6/10.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Entity
@Table(name = "t_question")
public class QuestionsRes {

//        "id":"1698",
//                    "subject":"理科",
//                    "grade":"9",
//                    "lv":"LV1",
//                    "title":"在盛满水的杯子里放一块冰，冰会处于杯子的哪个部分",
//                    "answer":"C",
//                    "level":"0",
//                    "A":"下面 ",
//                    "B":"中部",
//                    "C":"上面",
//                    "D":"完全浮出水面"

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "grade")
    private String grade;
    @Column(name = "lv")
    private String lv;
    @Column(name = "title")
    private String title;
    @Column(name = "answer")
    private String answer;
    @Column(name = "level")
    private String level;
    @JsonProperty("A")
    @Column(name = "A")
    private String A;
    @JsonProperty("B")
    @Column(name = "B")
    private String B;
    @JsonProperty("C")
    @Column(name = "C")
    private String C;
    @JsonProperty("D")
    @Column(name = "D")
    private String D;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @JsonProperty("A")
    public String getA() {
        return A;
    }
    @JsonProperty("A")
    public void setA(String a) {
        A = a;
    }
    @JsonProperty("B")
    public String getB() {
        return B;
    }
    @JsonProperty("B")
    public void setB(String b) {
        B = b;
    }
    @JsonProperty("C")
    public String getC() {
        return C;
    }
    @JsonProperty("C")
    public void setC(String c) {
        C = c;
    }
    @JsonProperty("D")
    public String getD() {
        return D;
    }
    @JsonProperty("D")
    public void setD(String d) {
        D = d;
    }

    @Override
    public String toString() {
        return "QuestionsRes{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", grade='" + grade + '\'' +
                ", lv='" + lv + '\'' +
                ", title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                ", level='" + level + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }

    public QuestionsRes(String subject, String grade, String lv, String title, String answer, String level, String a, String b, String c, String d) {
        this.subject = subject;
        this.grade = grade;
        this.lv = lv;
        this.title = title;
        this.answer = answer;
        this.level = level;
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public QuestionsRes() {
    }
}
