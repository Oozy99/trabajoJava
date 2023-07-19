package org.example.Validacion;

import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util=new Util();

    public LocalValidacion() {
    }
    public Boolean validarNit( String nit ) throws  Exception {
        String exprecionRegular = "\\d+";

        if (!util.buscarCoincidencias(exprecionRegular,nit)){
            throw new Exception("Porfavor digite datos validos");
        } else if (nit.length()<10) {
            throw new Exception("Digite el numero de caracteres permitidos");
        }else{
            return true;
        }
    }

    public Boolean validarNombreEmpresa(String nombre)throws  Exception{
        if (nombre.length()<30){
           return true;
        }else {
            throw new Exception("Digite el numero de caracteres permitidos");
        }
    }
            }
