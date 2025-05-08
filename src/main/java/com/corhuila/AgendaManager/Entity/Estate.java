package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estate")
public class Estate extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "name", nullable = false , length = 20, unique = true)
    private String name;

    @Column(name = "description", nullable = false , length = 50)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "country_id", nullable = false, unique = true)
    private Country countryId;
}
