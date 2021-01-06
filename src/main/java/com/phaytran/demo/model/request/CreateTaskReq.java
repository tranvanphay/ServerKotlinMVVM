package com.phaytran.demo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskReq {
    @JsonProperty("task_name")
    private String taskName;

    @JsonProperty("todo_id")
    private String todoId;
}
