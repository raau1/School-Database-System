package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a School entity in the database.
 * A school can have multiple pupils and one representative pupil.
 */
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the unique ID for each school
    private int id;

    private String name; // Name of the school

    @ManyToMany(mappedBy = "schools") // Defines the many-to-many relationship with pupils
    private List<Pupil> pupils; // List of pupils associated with the school

    @ManyToOne
    @JoinColumn // Foreign key for the representative pupil
    private Pupil representative; // The representative pupil of the school

    // Getters and Setters for each field

    /**
     * Gets the unique ID of the school.
     *
     * @return The ID of the school.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique ID of the school.
     *
     * @param id The new ID to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the school.
     *
     * @return The name of the school.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the school.
     *
     * @param name The new name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of pupils associated with the school.
     *
     * @return A list of Pupil objects.
     */
    public List<Pupil> getPupils() {
        return pupils;
    }

    /**
     * Sets the list of pupils associated with the school.
     *
     * @param pupils The list of pupils to set.
     */
    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    /**
     * Gets the representative pupil of the school.
     *
     * @return The Pupil object representing the school's representative.
     */
    public Pupil getRepresentative() {
        return representative;
    }

    /**
     * Sets the representative pupil of the school.
     *
     * @param representative The representative pupil to set.
     */
    public void setRepresentative(Pupil representative) {
        this.representative = representative;
    }

    /**
     * Returns a string representation of the school, including its ID, name,
     * pupils, and representative.
     *
     * @return A string representation of the school.
     */
    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + "', pupils=" + pupils + ", representative=" + representative;
    }
}
