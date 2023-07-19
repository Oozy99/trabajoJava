package org.example.utilidades;

public enum Mensajes {
    NOBRE_SOLO_LETRAS ("El nombre de usuario solo puede tener letras o espacios"),
    NOMBRE_CORTO ("Señor reviser la cantidad de caracteres es muy pequeña"),
    CORREO_INVALIDO ("Señor usuario su correo no es valido  "),
    ZONA_INVALIDA ("La zona ingresada no es válida"),

    NIT_INVALIDO ("Porfavor digite datos validos"),

    CARACTER_INVALIDO("Digite el numero de caracteres permitidos"),

    EMPRESA_IVALIDO("Digite el nombre de la empresa permitidos");



    String mensaje;


    private String Mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
