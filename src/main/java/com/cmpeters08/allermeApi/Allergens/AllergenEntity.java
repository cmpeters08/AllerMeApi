package com.cmpeters08.allermeApi.Allergens;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AllergenEntity {

    @GeneratedValue
    @Id
    private int Id;

    private String name;

    private String colorIndexId;
}
