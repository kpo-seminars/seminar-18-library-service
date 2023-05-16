package ru.hse.seminar18.libraryservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.hse.seminar18.studentservice.controller.StudentController;

@FeignClient(value = "student-service", path = "/students")
public interface StudentClient extends StudentController {
}
