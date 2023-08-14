package org.example.Validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class ValidacionOfertaTest {

    private ValidacionOferta validacionOferta;

    @BeforeEach

    public void setUP() {
        this.validacionOferta = new ValidacionOferta();

    }


    @Test
    public void validarTitulo(){
        String tituloValido = "feria";
        Assertions.assertDoesNotThrow(() -> validacionOferta.ValidarTitulo(tituloValido));
    }

    @Test
    public void validarTituloIncorrecto(){
        String validarIncorrecto= "asdfghjklñ34";

        Assertions.assertThrows(Exception.class,()->validacionOferta.ValidarTitulo(validarIncorrecto));

    }

    @Test
    public void validarFechas(){
        String fechaValida = "14/06/2023";
        Assertions.assertDoesNotThrow(()->validacionOferta.validarFormatoFecha(fechaValida));
    }

    @Test
    public void validarFechaInvalida(){
        String fechaInvalida = "14 06 2023";
        Assertions.assertThrows(Exception.class,()->validacionOferta.validarFechas(LocalDate.parse(fechaInvalida)));
    }

    @Test
    public  void costoPersona (){
        Double valorPersona = 12.0 ;
        Assertions.assertDoesNotThrow(()->validacionOferta.costoPersona(valorPersona));
    }

    @Test
    public  void  costoPersonaInvalido(){
        Double ValorInvalido = -35.0;
        Assertions.assertThrows(Exception.class,()->validacionOferta.costoPersona(ValorInvalido));
    }
}