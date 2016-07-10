package com.frikicorp.appprofesor.cursos;

import com.frikicorp.appprofesor.modelos.Curso;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public class CursosInteractor implements ICursosInteractor {

    List<Curso> cursos = new ArrayList<>();
    @Override
    public void getCursos(OnGetCursosCallback onGetCursosCallback) {
        cursos.add(new Curso("Android I","1233"));
        cursos.add(new Curso("Android II","1234"));
        cursos.add(new Curso("Tesis","1235"));
        cursos.add(new Curso("Anod213","1236"));
        onGetCursosCallback.callback(cursos);
    }

    @Override
    public void filterCursos(final String filtro, OnGetCursosCallback onGetCursosCallback) {
        List<Curso> cursosFiltrados = Lists.newArrayList(Collections2.filter(cursos, new Predicate<Curso>() {
            @Override
            public boolean apply(Curso input) {
                return input.getCurso().toLowerCase().contains(filtro.toLowerCase());
            }
        }));
        onGetCursosCallback.callback(cursosFiltrados);
    }


}
