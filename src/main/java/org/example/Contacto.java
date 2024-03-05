package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del Script
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Creador de contactos
     * @param name nombre de contacto
     * @param phone telefono de contacto
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * variable de nombre de contacto
     */ /**
     * acceso a nombre de contacto
     * @return name contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * lista de telefonos
     */ /**
     * acceso a telefonos de contacto
     * @return phones contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * modificar nombre contacto
     * @param name nombre contacto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * modificar telefono contacto
     * @param phones telefono contacto
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}