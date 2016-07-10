package com.frikicorp.appprofesor.cursos;

import com.frikicorp.appprofesor.modelos.Curso;

import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public class CursosPresenter implements ICursosPresenter{
    private ICursosView view;
    private CursosInteractor interactor;

    public CursosPresenter(ICursosView cursosView){
        this.view = cursosView;
        interactor = new CursosInteractor();
        view.setupListaCursos();
    }


    @Override
    public void fetchCursos() {
        interactor.getCursos(new ICursosInteractor.OnGetCursosCallback() {
            @Override
            public void callback(List<Curso> cursos) {
                view.actualizarCursos(cursos);
            }
        });
    }

    @Override
    public void filterCursos(String filtro) {
        interactor.filterCursos(filtro,new ICursosInteractor.OnGetCursosCallback() {
            @Override
            public void callback(List<Curso> cursos) {
                view.actualizarCursos(cursos);
            }
        });
    }
}
