package com.ProjectMyPresent.ProjectMyPresent.Repository;

import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryQuestionSQL {

    @Autowired
    QuestionRepository questionRepository;

    public RepositoryQuestionSQL(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(long id) {
        return questionRepository.getById(id);
    }
}
