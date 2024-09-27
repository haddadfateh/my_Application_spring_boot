package com.fstj.crud_mediatech.service;

import com.fstj.crud_mediatech.dto.ClientRequestDto;
import com.fstj.crud_mediatech.dto.ClientResponseDto;

public interface ClientService {
    ClientResponseDto save(ClientRequestDto clientRequestDto);

    ClientResponseDto findById(Integer id);


    ClientResponseDto findByNom(String nom);

    void delete(Integer id);

    ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id);
}