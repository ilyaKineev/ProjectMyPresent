package com.ProjectMyPresent.ProjectMyPresent.Repository;

import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Present;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryPresentSQL {

    @Autowired
    PresentRepository presentRepository;

    public RepositoryPresentSQL(PresentRepository presentRepository) {
        this.presentRepository = presentRepository;
    }

    public List<Present> getAllPresent() {
        return presentRepository.findAll();
    }

    public Present getPresentById(long id) {
        return presentRepository.getById(id);
    }
}
