package com.frikicorp.appprofesor.cursos;

import com.frikicorp.appprofesor.modelos.Curso;

import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public interface ICursosView {
    void setupListaCursos();
    void actualizarCursos(List<Curso> newCursos);
    void verCurso();
}
