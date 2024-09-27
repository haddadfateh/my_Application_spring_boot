package com.fstj.crud_mediatech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDto {
    // a envoyer en retour
    private Integer id;
    private String nom;
    private String prenom;
    private String telephone;
}