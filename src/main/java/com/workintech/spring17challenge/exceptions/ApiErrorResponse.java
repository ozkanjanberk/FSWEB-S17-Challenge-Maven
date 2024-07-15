package com.workintech.spring17challenge.exceptions;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;
}
