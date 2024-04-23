package kg.megalab.taskmanager.services.impl;

import kg.megalab.taskmanager.models.dtos.ProjectDto;
import kg.megalab.taskmanager.services.ColumnService;
import kg.megalab.taskmanager.services.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ColumnService columnService;

    public ProjectServiceImpl(ColumnService columnService) {
        this.columnService = columnService;
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {

        /*
            ProjectDto -> Project
            save Project

            saveColumn
            List<ColumnDto> -> List<Column>
            saveAll columns



         */
        return null;
    }
}
