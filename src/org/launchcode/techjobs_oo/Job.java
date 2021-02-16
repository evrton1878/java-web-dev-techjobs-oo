package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String blankText = "Data not available";
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;
        boolean hasId = true;
        if (this.name != null && !this.name.isBlank()) {
            name = this.name;
            hasId = false;
        } else {
            name = blankText;
        }
        if (this.employer != null && !this.employer.getValue().isBlank()) {
            employer = this.employer.toString();
            hasId = false;

        } else {
            employer = blankText;
        }
        if (this.location != null && !this.location.getValue().isBlank()) {
            location = this.location.toString();
            hasId = false;

        } else {
            location = blankText;
        }
        if (this.positionType != null && !this.positionType.getValue().isBlank()) {
            positionType = this.positionType.toString();
            hasId = false;
        } else {
            positionType = blankText;
        }
        if (this.coreCompetency != null && !this.coreCompetency.getValue().isBlank()) {
            coreCompetency = this.coreCompetency.toString();
            hasId = false;
        } else {
            coreCompetency = blankText;
        }
        if (hasId) {
            return "\nID: " + id + "\nOOPS! This job does not seem to exist.\n";
        } else {
            return ("\nID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + "\n");
        }
    }
}
