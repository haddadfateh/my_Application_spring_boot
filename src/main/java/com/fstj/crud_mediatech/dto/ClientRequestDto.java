package com.fstj.crud_mediatech.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// data transfer objet
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequestDto {
    // les champs li yjiwni men lexterieur
    private String nom;
    private String prenom;
    private String telephone;

}