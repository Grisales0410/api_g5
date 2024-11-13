package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres; //35 caracteres y solo letras

    private LocalDate fechaNacimiento; //Maximo 1900

    private String ciudad; //40 caracteres y solo letras

    private String correo; //Correo valido @sura.com.co

    private String telefono; //Maximo 12 caracteres y solo numeros

    private String ips; //Maximo 50 caracteres

    private String grupoIngresos; //Solo se admite A. B O C en mayuscula

    private Boolean tienePoliza;

    private LocalDate fechaAfiliacion; //No puede ser menor 2010

    //Creando una relacion con la clase Medico
    //Me relaciono con 1 medico
    @ManyToOne
    @JoinColumn(name = "fk_medico", referencedColumnName = "id")
    @JsonBackReference
    private Medico medico;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<SignoVital> signosVitales;


    public Paciente() {

    }

    public Paciente(Long id, String nombres, LocalDate fechaNacimiento, String ciudad, String correo, String telefono, String ips, String grupoIngresos, Boolean tienePoliza, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngresos = grupoIngresos;
        this.tienePoliza = tienePoliza;
        this.fechaAfiliacion = fechaAfiliacion;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}

