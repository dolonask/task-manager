package kg.megalab.taskmanager.repositories;

import kg.megalab.taskmanager.models.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnRepo extends JpaRepository<Column,Long> {
}
