package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //1.preparando
    //probando el objeto usuario validaciones

    private UsuarioValidacion usuarioValidacion; // creacion de constructor

    @BeforeEach
    public void setUP() {
        this.usuarioValidacion = new UsuarioValidacion(); //creacion de atributo

    }

    @Test
    public void validarNombreUsuarioCorrecto() {
        String nombreValido = "jenifer varelas"; //preparando //2 y 3 ejecutar y verificar

        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarNombre(nombreValido));
    }

    @Test
    public void ValidarNombreUsuarioIncorrecto() {
        String nombreInvalido = "jenifer 12345 varelas"; //preparando

        Exception exepcion = Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOBRE_SOLO_LETRAS.getMensaje(), exepcion.getMessage());

    }


    }
