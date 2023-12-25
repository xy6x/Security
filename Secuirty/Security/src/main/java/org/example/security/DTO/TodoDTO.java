package org.example.security.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoDTO {
    private Integer user_id;
    private  String title;
}
