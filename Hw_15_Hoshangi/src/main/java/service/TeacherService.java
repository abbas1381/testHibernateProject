package service;

import base.service.BaseService;
import model.Lesson;
import model.Teacher;

import java.util.Optional;

public interface TeacherService extends BaseService<Teacher, Integer> {
    @Override
    Optional<Teacher> findById(Integer integer);

    //double calculateSalary(Integer term);

    Lesson addGrade(Integer ID , Integer score);


}
