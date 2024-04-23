package kg.megalab.taskmanager.models.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ColumnDto {

    Long id;
    String name;
    int orderNum;
    boolean active;


}
