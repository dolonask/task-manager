package kg.megalab.taskmanager.models;

import jakarta.persistence.*;
import kg.megalab.taskmanager.models.enums.ProjectStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "projects")
public class Project {

    @Id
    Long id;
    String name;
    String description;
    Date startDate;
    Date endDate;
    boolean active;
    @Enumerated(value = EnumType.STRING)
    ProjectStatus status;



}
