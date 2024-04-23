package kg.megalab.taskmanager.services;

import kg.megalab.taskmanager.models.dtos.ProjectDto;

public interface ProjectService {
    ProjectDto createProject(ProjectDto projectDto);
}
