package com.phaytran.demo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRes {
    @JsonProperty("isSuccess")
    private boolean isSuccess;

    @JsonProperty("userId")
    private Integer userId;
}
