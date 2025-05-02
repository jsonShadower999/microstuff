package com.quizservice.quizservice.entity;

public class Question {
    private Long quesId;
    private String question;
    private Long quizId;

    public Question() {}

    public Question(Long quesId, String question, Long quizId) {
        this.quesId = quesId;
        this.question = question;
        this.quizId = quizId;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
