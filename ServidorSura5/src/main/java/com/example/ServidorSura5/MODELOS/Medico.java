package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medico")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombres; //35 caracteres y solo letras
    private String matriculaProfesional; //20 caracteres
    private String especialidad; //20 caracteres
    private Integer salario; //Solo positivos, menos de 10 mill y maximo 20
    private String ips; //50 caracteres
    private String correo; //@sura.com.co
    private String telefono; //12 caracteres
    private String direccion; //50 caracteres
    private Boolean disponibleFinDeSemana;

    //Creando relacion con la clase paciente
    //Me relaciono con muchos pacientes
    @OneToMany(mappedBy = "medico" )
    @JsonManagedReference
    private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesional, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean disponibleFinDeSemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFinDeSemana() {
        return disponibleFinDeSemana;
    }

    public void setDisponibleFinDeSemana(Boolean disponibleFinDeSemana) {
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }
}
