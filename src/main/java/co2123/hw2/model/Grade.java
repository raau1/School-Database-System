package co2123.hw2.model;

import jakarta.persistence.*;

/**
 * Represents a Grade entity in the database.
 * Each grade is associated with a specific pupil and contains a score.
 */
@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the unique identifier for each Grade
    private int identifier;

    private int score; // Stores the score of the grade

    @ManyToOne // Many grades can belong to one pupil
    @JoinColumn // Specifies the foreign key column in the database
    private Pupil pupil;

    // Getters and Setters for each field

    /**
     * Gets the unique identifier for the grade.
     * @return The grade's identifier.
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Sets the unique identifier for the grade.
     * @param identifier The new identifier to set.
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the score associated with this grade.
     * @return The grade's score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the score for this grade.
     * @param score The new score to set.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Gets the pupil associated with this grade.
     * @return The pupil object linked to this grade.
     */
    public Pupil getPupil() {
        return pupil;
    }

    /**
     * Sets the pupil for this grade.
     * @param pupil The pupil to associate with this grade.
     */
    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    /**
     * Returns a string representation of the grade, including its identifier and score.
     * @return A string representation of the grade.
     */
    @Override
    public String toString() {
        return "identifier=" + identifier + ", score=" + score;
    }
}
