package co2123.hw2.repo;

import co2123.hw2.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for managing Grade entities.
 * Extends JpaRepository to provide CRUD operations and custom query methods.
 */
public interface GradeRepository extends JpaRepository<Grade, Integer> {

    /**
     * Finds a list of Grade entities that have a specific score.
     *
     * @param score The score to search for.
     * @return A list of Grade entities matching the given score.
     */
    List<Grade> findByScore(int score);
}
