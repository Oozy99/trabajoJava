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
    public void validarNombreUsuarioIncorrecto() {
        String nombreInvalido = "jenifer 12345 varelas"; //preparando

        Exception exepcion = Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOBRE_SOLO_LETRAS.getMensaje(), exepcion.getMessage());

    }

    @Test
    public void correoValido() {
        String correoValido = "jenifer@gmail.com"; //
        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarCorreo(correoValido));//no espera exepcion


    }

    @Test
    public void correoInvalido() {
        String correoInvalidoPorArroba = "jenifergmail.com";
        String correInvalidoPorCom = "jenifergmail"; //
        Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarCorreo(correoInvalidoPorArroba));
        Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarCorreo(correInvalidoPorCom));//espera exepciones
    }


    @Test
    public void ubicacionVaida() {
        Integer ubicacionValida = 3;
        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarUbicacion(ubicacionValida));
    }
}
