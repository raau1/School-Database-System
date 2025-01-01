package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a Pupil entity in the database.
 * A pupil can attend multiple schools, have multiple grades, and one "best" grade.
 */
@Entity
public class Pupil {

    @Id
    private String address; // Unique identifier for the pupil (address used as primary key)

    @ManyToMany
    @JoinTable(
            name = "school_pupil", // Defines the join table name for the many-to-many relationship
            joinColumns = @JoinColumn(name = "pupil_address"), // Column in the join table for this entity
            inverseJoinColumns = @JoinColumn(name = "school_id") // Column in the join table for the related entity
    )
    private List<School> schools; // List of schools associated with the pupil

    @OneToMany(mappedBy = "pupil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Grade> grades; // List of grades assigned to the pupil

    @OneToOne
    @JoinColumn // Foreign key for the "best" grade
    private Grade best; // The best grade of the pupil

    // Getters and Setters for each field

    /**
     * Gets the unique address of the pupil.
     *
     * @return The address of the pupil.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the unique address of the pupil.
     *
     * @param address The new address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the list of schools the pupil is associated with.
     *
     * @return A list of School objects.
     */
    public List<School> getSchools() {
        return schools;
    }

    /**
     * Sets the list of schools the pupil is associated with.
     *
     * @param schools The list of schools to set.
     */
    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    /**
     * Gets the list of grades for the pupil.
     *
     * @return A list of Grade objects.
     */
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Sets the list of grades for the pupil.
     *
     * @param grades The list of grades to set.
     */
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    /**
     * Gets the pupil's best grade.
     *
     * @return The Grade object representing the best grade.
     */
    public Grade getBest() {
        return best;
    }

    /**
     * Sets the pupil's best grade.
     *
     * @param best The best grade to set.
     */
    public void setBest(Grade best) {
        this.best = best;
    }

    /**
     * Returns a string representation of the pupil, including the address,
     * grades, and best grade.
     *
     * @return A string representation of the pupil.
     */
    @Override
    public String toString() {
        return "address='" + address + "', grades=" + grades + ", best=" + best;
    }
}
