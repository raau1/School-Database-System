package co2123.hw2.repo;

import co2123.hw2.model.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for managing Pupil entities.
 * Extends JpaRepository to provide CRUD operations and custom query methods.
 */
public interface PupilRepository extends JpaRepository<Pupil, String> {

    /**
     * Finds a list of Pupil entities by their address.
     *
     * @param address The address to search for.
     * @return A list of Pupil entities matching the given address.
     */
    List<Pupil> findByAddress(String address);
}
