package com.example.ServidorSura5.helpers;

import com.example.ServidorSura5.modelos.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

    //1. Inyectar un objeto de la clase modelo
    // Inyectar es igual a traer una clase y usarla dentro de otra
    private Paciente paciente = new Paciente();

    //2. Creamos un metodo para cada camppo que quiero validar
    public boolean validarNombres(String nombres){
        //1. Se consulta una expresion regular almacenandola en una variable de
        //tipo string
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";

        //2. Activar el patron
        Pattern patron  = Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(nombres);

        //4. Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }

    }
    public boolean validarFechaNacimiento(LocalDate fecha){}
    public boolean validarCiudad(String ciudad){
        //1. Se consulta una expresion regular almacenandola en una variable de
        //tipo string
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";

        //2. Activar el patron
        Pattern patron  = Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(ciudad);

        //4. Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarCorreo(String correo){
        //1. Se consulta una expresion regular almacenandola en una variable de
        //tipo string
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@sura\\.com$\n";

        //2. Activar el patron
        Pattern patron  = Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(correo);

        //4. Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarTelefono(String telefono){
        //1. Se consulta una expresion regular almacenandola en una variable de
        //tipo string
        String expresionRegular = "^[0-9]+$";

        //2. Activar el patron
        Pattern patron  = Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(telefono);

        //4. Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarIps(String ips){
        //1. Se consulta una expresion regular almacenandola en una variable de
        //tipo string
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";

        //2. Activar el patron
        Pattern patron  = Pattern.compile(expresionRegular);

        //3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(ips);

        //4. Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarGrupoIngresos(String grupoIngresos){

    }
    public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){}

}
