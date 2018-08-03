package com.cassiomolin.listela.checklist.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class ChecklistItem {

    @Id
    private String id;

    private String title;

    private Boolean completed;

    @CreatedDate
    private OffsetDateTime createdDate;
}
