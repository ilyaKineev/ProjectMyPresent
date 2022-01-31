package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.model.json.Present;
import com.ProjectMyPresent.ProjectMyPresent.model.json.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PresentService {

    private List<Present> presentList;
    private int lastId;

    {
        presentList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            List<Boolean> booleanList = new ArrayList<>();
            for (int j = 1; j <= 100; j++) {
                Random random = new Random();
                booleanList.add(random.nextBoolean());
            }
            presentList.add(new Present((long)i,"Present " + i, booleanList));
            lastId = i;
        }
    }

    public List<Present> getAllPresent() {
        return presentList;
    }

    public Present getPresentById(int id) {
        return presentList.stream().filter(present -> present.getId()==id).collect(Collectors.toList()).get(0);
    }

    public String addPresent() {
        List<Boolean> booleanList = new ArrayList<>();
        for (int j = 1; j <= 100; j++) {
            Random random = new Random();
            booleanList.add(random.nextBoolean());
        }
        lastId++;
        presentList.add(new Present((long)lastId,"Present " + (lastId), booleanList));
        return "successfully";
    }

    public String deletePresentByID(int id) {
        presentList = presentList.stream().filter(p -> p.getId() != id).collect(Collectors.toList());
        return "successfully";
    }

    public List<Present> getResultByTopQuestion(List<Question> questions) {
        List<Present> result = new ArrayList<>();
        List<Present> newPresentList = presentList;
        for (Question q : questions) {            
            switch (q.getResult()) {
                case (1):
                for (Present p : newPresentList) {
                    if (!p.getQuestionList().get((int)q.getId() - 1)) {
                        p.setValue(p.getValue() + 1);
                    }
                }            
                break;
                case (2):
                for (Present p : newPresentList) {
                    if (!p.getQuestionList().get((int)q.getId() - 1)) {
                        p.setValue(p.getValue() + 0.5);
                    }
                }            
                break;
                case (3):
                for (Present p : newPresentList) {
                    if (!p.getQuestionList().get((int)q.getId() - 1)) {
                        p.setValue(p.getValue() + 0);
                    }
                }            
                break;
                case (4):
                for (Present p : newPresentList) {
                    if (!p.getQuestionList().get((int)q.getId() - 1)) {
                        p.setValue(p.getValue() + 0.5);
                    }
                }            
                break;
                case (5):                
                for (Present p : newPresentList) {
                    if (!p.getQuestionList().get((int)q.getId() - 1)) {
                        p.setValue(p.getValue() + 1);
                    }
                }            
                break;
                default:
                for (Present p : newPresentList) {
                    p.setValue(p.getValue() + 0);
                }
                break;
            }
        }

        double max = 0;

        for (Present p : newPresentList) {
            if (p.getValue() > max) max = p.getValue();
        }

        for (Present p: newPresentList) {
            if (max == p.getValue()) result.add(p);
        }

        return result;
    }
}
