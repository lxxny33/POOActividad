package com.example;

public class Main {
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.setnombre("Julian");
        estudiante1.setedad(19);
        estudiante1.setpromedioAcademico(3.5);
        estudiante1.setestaActivo(false);
        estudiante1.setgrupo('A');
        estudiante1.setporcentajeAsistencia(78);
        estudiante1.setgenero('M');
        estudiante1.setsemestreActual(6);
        estudiante1.settieneBeca(false);
        estudiante1.setcorreo("julian@gmail.com");
        System.out.println(estudiante1);
    }
}