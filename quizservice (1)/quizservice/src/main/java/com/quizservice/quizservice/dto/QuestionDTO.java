package com.quizservice.quizservice.dto;

public class QuestionDTO {
    private Long quesId;
    private String question;

    public QuestionDTO() {}

    public QuestionDTO(Long quesId, String question) {
        this.quesId = quesId;
        this.question = question;
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


}
