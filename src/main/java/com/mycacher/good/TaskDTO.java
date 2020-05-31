package com.mycacher.good;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class TaskDTO {
    private final long id;
    private final String task;
    private final boolean completed;
}
