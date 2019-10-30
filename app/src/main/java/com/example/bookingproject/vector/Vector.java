package com.example.bookingproject.vector;

import com.example.bookingproject.model.Persona;

public class Vector {
    private Persona[] persona;

    public Persona[] getPersona() {
        return persona;
    }

    public void setPersona(Persona[] persona) {
        this.persona = persona;
    }

    /**
     * Metodo para generar espacio en memoria para la persona.
     */
    public void crearPersona() {
        this.persona = new Persona[1];
    }

    /**
     * Metodo para agregar persona a la memoria generada.
     *
     * @param p de la clase determinada.
     */
    public void agregarPersona(Persona p) {
        persona[0] = p;
    }

    /**
     * Metodo para obtener el nombre del vector.
     *
     * @return de tipo String.
     */
    public String getPersonaNombre() {
        return this.persona[0].getNombreCompleto();
    }
}
