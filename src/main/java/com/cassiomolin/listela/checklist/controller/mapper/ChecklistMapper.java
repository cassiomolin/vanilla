package com.cassiomolin.listela.checklist.controller.mapper;

import com.cassiomolin.listela.checklist.controller.model.CreateChecklistDetails;
import com.cassiomolin.listela.checklist.controller.model.QueryChecklistDetails;
import com.cassiomolin.listela.checklist.controller.model.UpdateChecklistDetails;
import com.cassiomolin.listela.checklist.domain.Checklist;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * Component that maps a {@link Checklist} domain model to API models and vice versa.
 *
 * @author cassiomolin
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChecklistMapper {

    Checklist toChecklist(CreateChecklistDetails createChecklistDetails);

    QueryChecklistDetails toQueryChecklistDetails(Checklist checklist);

    List<QueryChecklistDetails> toQueryChecklistDetails(List<Checklist> checklist);

    void updateChecklist(UpdateChecklistDetails updateChecklistDetails, @MappingTarget Checklist checklist);
}