package kg.megalab.taskmanager.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "columns")
public class Column {

    @Id
    Long id;
    String name;
    int orderNum;
    boolean active;
    @ManyToOne
            @JoinColumn(name = "project_id")
    Project project;



}
