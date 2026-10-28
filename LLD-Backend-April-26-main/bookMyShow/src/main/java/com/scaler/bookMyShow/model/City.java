package com.scaler.bookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.AbstractCollection;
import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;

}
