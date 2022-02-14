package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.Repository.AnswerRepository;
import com.ProjectMyPresent.ProjectMyPresent.Repository.RepositoryPresentSQL;
import com.ProjectMyPresent.ProjectMyPresent.Repository.RepositoryQuestionSQL;
import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Answer;
import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Present;
import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Question;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonPresent;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ProjectMyPresent.ProjectMyPresent.Repository.MainTableTest.getAnswers;

@Service
public class MainService {

    @Autowired
    RepositoryQuestionSQL repositoryQuestionSQL;

    @Autowired
    RepositoryPresentSQL repositoryPresentSQL;

    @Autowired
    AnswerRepository answerRepository;

    public void getAllAnswer() {
        {
            List<Answer> answerList = answerRepository.findAll();

            for (Answer a : answerList) {
                System.out.println(a.toString());
            }
        }
    }

    public MainService(RepositoryQuestionSQL repositoryQuestionSQL, RepositoryPresentSQL repositoryPresentSQL, AnswerRepository answerRepository) {
        this.repositoryQuestionSQL = repositoryQuestionSQL;
        this.repositoryPresentSQL = repositoryPresentSQL;
        this.answerRepository = answerRepository;
    }

    public List<JsonQuestion> getAllQuestion() {
        List<JsonQuestion> jsonQuestionList = new ArrayList<>();
        List<Question> questionList = repositoryQuestionSQL.getAllQuestion();
        for (Question question : questionList) {
            jsonQuestionList.add(new JsonQuestion(question.getId(), question.getQuestion(), question.getRating(), 0));
        }
        return jsonQuestionList;
    }

    public JsonQuestion getQuestionById(int id) {

        getAllAnswer();

        Question question = repositoryQuestionSQL.getQuestionById(id);
        JsonQuestion jsonQuestion = new JsonQuestion(question.getId(), question.getQuestion(), question.getRating(), 0);
        return jsonQuestion;
    }

    public List<JsonQuestion> getTopQuestion() {
        List<JsonQuestion> jsonQuestionListTop;
        jsonQuestionListTop = new ArrayList<>();
        List<JsonQuestion> jsonQuestionList1 = new ArrayList<>(getAllQuestion());

        jsonQuestionList1.sort((o1, o2) -> o2.getRating() - o1.getRating());
        for (int i = 0; i < 10; i++) {
            jsonQuestionListTop.add(jsonQuestionList1.get(i));
        }
        return jsonQuestionListTop;
    }

    public List<JsonPresent> getAllPresent() {

        List<JsonPresent> jsonPresentList = new ArrayList<>();
        List<Present> presentList = repositoryPresentSQL.getAllPresent();

        for (Present present : presentList) {
            jsonPresentList.add(new JsonPresent(present.getId(), present.getName(), getAnswers(present.getId())));
        }

        return jsonPresentList;
    }

    public JsonPresent getPresentById(long id) {
        Present present = repositoryPresentSQL.getPresentById(id);
        JsonPresent jsonPresent = new JsonPresent(present.getId(), present.getName(), getAnswers(id));
        return jsonPresent;
    }
}
