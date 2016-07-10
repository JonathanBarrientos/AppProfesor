package com.frikicorp.appprofesor.cursos;

import com.frikicorp.appprofesor.modelos.Curso;

import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public interface ICursosPresenter {
    void fetchCursos();
    void filterCursos(String filtro);
}
