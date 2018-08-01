package com.cassiomolin.listify.task.controller.mapper;

import com.cassiomolin.listify.task.controller.model.CreateTaskDetails;
import com.cassiomolin.listify.task.controller.model.QueryTaskDetails;
import com.cassiomolin.listify.task.controller.model.UpdateTaskDetails;
import com.cassiomolin.listify.task.domain.Task;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * Component that maps a {@link Task} domain model to API models and vice versa.
 *
 * @author cassiomolin
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {

    Task  toTask(CreateTaskDetails createTaskDetails);

    QueryTaskDetails toQueryTaskResult(Task task);

    List<QueryTaskDetails> toQueryTaskResults(List<Task> tasks);

    void updateTask(UpdateTaskDetails updateTaskDetails, @MappingTarget Task task);
}