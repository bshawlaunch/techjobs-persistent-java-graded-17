package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotNull(message = "Skill required")
    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();

    @Size(max=75)
    public String description;

    public @Size(max = 75) String getDescription() {
        return description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setDescription(@Size(max = 75) String description) {
        this.description = description;
    }

    public Skill() {
    }
}
