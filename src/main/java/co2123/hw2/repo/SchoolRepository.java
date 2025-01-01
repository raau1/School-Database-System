package co2123.hw2.repo;

import co2123.hw2.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for managing School entities.
 * Extends JpaRepository to provide CRUD operations and custom query methods.
 */
public interface SchoolRepository extends JpaRepository<School, Integer> {

    /**
     * Finds a list of School entities by their name.
     *
     * @param name The name of the school to search for.
     * @return A list of School entities matching the given name.
     */
    List<School> findByName(String name);

    /**
     * Finds a list of School entities by the address of their representative.
     *
     * @param address The address of the representative to search for.
     * @return A list of School entities with the given representative's address.
     */
    List<School> findByRepresentative_Address(String address);
}
