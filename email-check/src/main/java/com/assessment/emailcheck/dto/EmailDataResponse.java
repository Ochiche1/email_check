package com.assessment.emailcheck.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDataResponse {
    private String email;
    private String reputation;
    private boolean suspicious;
    private int references;
    private Details details;
}
