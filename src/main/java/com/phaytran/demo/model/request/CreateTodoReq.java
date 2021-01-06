package com.phaytran.demo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTodoReq {
    @JsonProperty("name")
    private String name;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duedate")
    private Date duedate;

}
