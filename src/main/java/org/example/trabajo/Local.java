package org.example.trabajo;

import org.example.Validacion.LocalValidacion;
import org.example.Validacion.UsuarioValidacion;

public class Local {

    private Integer id;

    private  String nit;

    private  String nombre;

    private Integer ubicacion;

    private  String descripcion;

    private LocalValidacion Validacion= new LocalValidacion();

    public Local() {
    }

    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            this.Validacion.validarNit(nit);
            this.nit=nit;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.Validacion.validarNombreEmpresa(nombre);
            this.nombre = nombre;
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
