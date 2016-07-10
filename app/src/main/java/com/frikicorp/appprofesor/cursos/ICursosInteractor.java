package com.frikicorp.appprofesor.cursos;

import com.frikicorp.appprofesor.modelos.Curso;

import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public interface ICursosInteractor {
  interface OnGetCursosCallback{
    void callback(List<Curso> cursos);
  }
  void getCursos(OnGetCursosCallback onGetCursosCallback);
  void filterCursos(String filtro, OnGetCursosCallback onGetCursosCallback);
}
