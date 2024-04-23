package kg.megalab.taskmanager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "roles")
public class UserRoleInProject {

    @Id
    Long id;
    @ManyToOne
    User user;
    @ManyToOne
    Project project;
    @ManyToOne
    Role role;

    Date startDate;
    Date endDate;



    
    

}
