package com.example;

public class Estudiantes {
    private String nombre;
    private int edad;
    private double promedioAcademico;
    private boolean estaActivo = true;
    private char grupo;
    private double porcentajeAsistencia;
    private char genero;
    private int semestreActual;
    private boolean tieneBeca;
    private String correo;

    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad = edad; 
    }
    public double getpromedioAcademico(){
        return  promedioAcademico;
    }
    public void setpromedioAcademico(double promedioAcademico){
        this.promedioAcademico = promedioAcademico;
    }
    public boolean getestaActivo(){
        return  estaActivo;
    }
    public void setestaActivo(boolean estaActivo){
        this.estaActivo = estaActivo;
    }
    public char getgrupo(){
        return grupo;
    }
    public void setgrupo(char grupo){
        this.grupo = grupo; 
    }
    public double getporcentajeAsistencia(){
        return porcentajeAsistencia;
    }
    public void setporcentajeAsistencia(double porcentajeAsistencia){
        this.porcentajeAsistencia = porcentajeAsistencia;
    }
    public int getsemestreActual(){
        return semestreActual;
    }
    public char getgenero(){
        return genero;
    }
    public void setgenero(char genero){
        this.genero = genero;
    }
    public void setsemestreActual(int semestreActual){
        this.semestreActual = semestreActual;
    }
    public boolean gettieneBeca(){
        return tieneBeca;
    }
    public void settieneBeca(boolean tieneBeca){
        this.tieneBeca = tieneBeca;
    }
    public String getcorreo(){
        return correo;
    }
    public void setcorreo(String correo){
        this.correo = correo;
    }
    @Override
public String toString() {
    String activo = this.estaActivo ? "Activo" : "Inactivo";
    String beca = this.tieneBeca ? "Si" : "No";
    return 
           "  Nombre del estudiante: " + nombre + "\n" +
           "  Edad del estudiante: " + edad + "\n" +
           "  Promedio del estudiante: " + promedioAcademico + "\n" +
           "  Esta activo: " + activo + "\n" +
           "  El estudiante pertenece al grupo: " + grupo + "\n" +
           "  El porcentaje de asistencia del estudiante es de: " + porcentajeAsistencia + "\n" +
           "  El genero del estudiante es: " + genero + "\n" +
           "  Semestre en el que se encuentra: " + semestreActual + "\n" +
           "  El estudiante tiene beca: " + beca + "\n" +
           "  El correo del estudiante es: " + correo + "\n" +
           "}";
}


}
