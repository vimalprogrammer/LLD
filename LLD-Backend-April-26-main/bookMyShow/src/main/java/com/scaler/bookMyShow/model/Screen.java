package com.scaler.bookMyShow.model;

import com.scaler.bookMyShow.model.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseEntity{

    private String name;

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    @JoinColumn
    private List<Seat> seats;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;
}
