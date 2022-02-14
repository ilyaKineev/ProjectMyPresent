package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionService {
    List<JsonQuestion> jsonQuestionList;
    List<JsonQuestion> jsonQuestionListTop;
    int lastId;

    {
        jsonQuestionList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            jsonQuestionList.add(new JsonQuestion(i, "Вопрос_" + i, (int) ((Math.random() * 100)), 0));
            lastId = i;
        }

        jsonQuestionListTop = new ArrayList<>();

        List<JsonQuestion> jsonQuestionList1 = new ArrayList<>(jsonQuestionList);

        jsonQuestionList1.sort((o1, o2) -> o2.getRating() - o1.getRating());
        for (int i = 0; i < 10; i++) {
            jsonQuestionListTop.add(jsonQuestionList1.get(i));
        }
    }

    public List<JsonQuestion> getAllQuestion() {
        return jsonQuestionList;
    }

    public JsonQuestion getQuestionById(int id) {
        return jsonQuestionList.stream().filter(present -> present.getId() == id).collect(Collectors.toList()).get(0);
    }

    public String addQuestion() {
        lastId++;
        jsonQuestionList.add(new JsonQuestion(lastId, "Вопрос_" + lastId, (int) ((Math.random() * 100)), 0));
        return "successfully";
    }

    public String deleteQuestion(int id) {
        jsonQuestionList = jsonQuestionList.stream().filter(p -> p.getId() != id).collect(Collectors.toList());
        return "successfully";
    }

    public List<JsonQuestion> getTopQuestion() {
        return jsonQuestionListTop;
    }
}
