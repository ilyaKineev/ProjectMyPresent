package com.ProjectMyPresent.ProjectMyPresent.Service;

import com.ProjectMyPresent.ProjectMyPresent.model.json.Present;

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
}
