package com.ProjectMyPresent.ProjectMyPresent.Repository;


import com.ProjectMyPresent.ProjectMyPresent.model.DAO.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
