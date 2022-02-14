package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonPresent;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PresentService {

    private List<JsonPresent> presentList;
    private int lastId;

    {
        presentList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            List<Boolean> booleanList = new ArrayList<>();
            for (int j = 1; j <= 100; j++) {
                Random random = new Random();
                booleanList.add(random.nextBoolean());
            }
            presentList.add(new JsonPresent((long) i, "Present " + i, booleanList));
            lastId = i;
        }
    }

    public List<JsonPresent> getAllPresent() {
        return presentList;
    }

    public JsonPresent getPresentById(int id) {
        return presentList.stream().filter(present -> present.getId() == id).collect(Collectors.toList()).get(0);
    }

    public String addPresent() {
        List<Boolean> booleanList = new ArrayList<>();
        for (int j = 1; j <= 100; j++) {
            Random random = new Random();
            booleanList.add(random.nextBoolean());
        }
        lastId++;
        presentList.add(new JsonPresent((long) lastId, "Present " + (lastId), booleanList));
        return "successfully";
    }

    public String deletePresentByID(int id) {
        presentList = presentList.stream().filter(p -> p.getId() != id).collect(Collectors.toList());
        return "successfully";
    }

    public List<JsonPresent> getResultByTopQuestion(List<JsonQuestion> jsonQuestions) {
        List<JsonPresent> result = new ArrayList<>();
        List<JsonPresent> newPresentList = presentList;
        for (JsonQuestion q : jsonQuestions) {
            switch (q.getResult()) {
                case (1):
                    for (JsonPresent p : newPresentList) {
                        if (!p.getQuestionList().get((int) q.getId() - 1)) {
                            p.setValue(p.getValue() + 1);
                        }
                    }
                    break;
                case (2):
                    for (JsonPresent p : newPresentList) {
                        if (!p.getQuestionList().get((int) q.getId() - 1)) {
                            p.setValue(p.getValue() + 0.5);
                        }
                    }
                    break;
                case (3):
                    for (JsonPresent p : newPresentList) {
                        if (!p.getQuestionList().get((int) q.getId() - 1)) {
                            p.setValue(p.getValue() + 0);
                        }
                    }
                    break;
                case (4):
                    for (JsonPresent p : newPresentList) {
                        if (!p.getQuestionList().get((int) q.getId() - 1)) {
                            p.setValue(p.getValue() + 0.5);
                        }
                    }
                    break;
                case (5):
                    for (JsonPresent p : newPresentList) {
                        if (!p.getQuestionList().get((int) q.getId() - 1)) {
                            p.setValue(p.getValue() + 1);
                        }
                    }
                    break;
                default:
                    for (JsonPresent p : newPresentList) {
                        p.setValue(p.getValue() + 0);
                    }
                    break;
            }
        }

        double max = 0;

        for (JsonPresent p : newPresentList) {
            if (p.getValue() > max) max = p.getValue();
        }

        for (JsonPresent p : newPresentList) {
            if (max == p.getValue()) result.add(p);
        }

        return result;
    }
}
