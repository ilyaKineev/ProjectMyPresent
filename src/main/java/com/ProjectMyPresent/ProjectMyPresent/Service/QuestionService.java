package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.model.json.Question;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionService {
    List<Question> questionList;
    List<Question> questionListTop;
    int lastId;

    {
        questionList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            questionList.add(new Question(i,"Вопрос_" + i, (int)((Math.random()*100))));
            lastId=i;
        }

        questionListTop = new ArrayList<>();

        List<Question> questionList1 = new ArrayList<>(questionList);

        questionList1.sort((o1, o2) -> o2.getRating() - o1.getRating());
        for (int i = 0; i < 10; i++) {
            questionListTop.add(questionList1.get(i));
        }
    }

    public List<Question> getAllQuestion() {
        return questionList;
    }

    public Question getQuestionById(int id) {
        return questionList.stream().filter(present -> present.getId()==id).collect(Collectors.toList()).get(0);
    }

    public String addQuestion() {
        lastId++;
        questionList.add(new Question(lastId,"Вопрос_" + lastId, (int)((Math.random()*100))));
        return "successfully";
    }

    public String deleteQuestion(int id) {
        questionList = questionList.stream().filter(p -> p.getId() != id).collect(Collectors.toList());
        return "successfully";
    }

    public List<Question> getTopQuestion() {
        return questionListTop;
    }
}
