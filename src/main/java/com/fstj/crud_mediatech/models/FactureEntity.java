package com.fstj.crud_mediatech.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "factures")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FactureEntity implements Serializable {


    @Id

    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String ref;

    @Column(nullable = false,name = "date_creation_facture")
    private Date date;


    @ManyToOne
    private ClientEntity client;

    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<LigneFactureEntity> ligneFactures;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}