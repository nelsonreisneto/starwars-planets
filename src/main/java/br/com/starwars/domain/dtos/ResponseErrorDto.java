package br.com.starwars.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseErrorDto {
    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private String error;
    private String message;
    private String path;
}
