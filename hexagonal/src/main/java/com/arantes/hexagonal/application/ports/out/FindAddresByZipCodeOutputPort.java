package com.arantes.hexagonal.application.ports.out;

import com.arantes.hexagonal.application.core.domain.Address;

public interface FindAddresByZipCodeOutputPort {

    Address find (String zipCode);
}
