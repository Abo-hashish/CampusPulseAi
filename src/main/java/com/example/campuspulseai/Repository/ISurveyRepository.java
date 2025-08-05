package com.example.campuspulseai.Repository;

import com.example.campuspulseai.Entity.QuestionChoices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISurveyRepository extends CrudRepository<QuestionChoices, Long> {
}
