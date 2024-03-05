package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del Script
 */
class Contacto {
    /**
     * variable de nombre de contacto
     */
    private String name;
    /**
     * lista de telefonos
     */
    private List<String> phones;

    /**
     * Creador de contactos
     * @param name nombre de contacto
     * @param phone telefono de contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * acceso a nombre de contacto
     * @return name contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * acceso a telefonos de contacto
     * @return phones contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}