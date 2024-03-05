package org.example;

import java.util.*;

/**
 * Clase principal script
 * @author Francisco Antonio Perez
 * @version 1
 */
public class Agenda implements IAgenda {
    /**
     * lista de contactos
     */
    private List<Persona> contacts; // Lista de Contacto

    /**
     * constructor de clase
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * añadir contacto
     * @param name nombre contacto
     * @param phone telefono contacto
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * eliminar contacto
     * @param name nombre contacto
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * modificar telefono de contacto
     * @param name nombre de contacto
     * @param oldPhone telefono antiguo
     * @param newPhone telefono nuevo
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Acceso a contactos
     * @return contactos
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}