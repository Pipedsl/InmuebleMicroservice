package com.pipedsl.springbootmicroservice1inmueble.service;

import com.pipedsl.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
