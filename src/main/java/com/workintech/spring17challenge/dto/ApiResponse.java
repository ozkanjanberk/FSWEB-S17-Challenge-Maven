package com.workintech.spring17challenge.dto;

import com.workintech.spring17challenge.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
    private Course course;
    private Integer totalGpa;
}
