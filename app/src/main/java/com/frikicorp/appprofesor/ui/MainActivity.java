package com.frikicorp.appprofesor.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.frikicorp.appprofesor.R;
import com.frikicorp.appprofesor.modelos.Curso;
import com.frikicorp.appprofesor.cursos.CursosAdapter;
import com.frikicorp.appprofesor.cursos.CursosPresenter;
import com.frikicorp.appprofesor.cursos.ICursosView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity implements ICursosView {

    CursosPresenter presenter;
    CursosAdapter adapter;
    List<Curso> cursos = new ArrayList<>();

    @BindView(R.id.rCursos)
    RecyclerView rCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new CursosPresenter(this);
        presenter.fetchCursos();

    }

    @OnTextChanged(R.id.buscador)
    public void buscarCursos(CharSequence s){
        Log.d("TextChange",s.toString());
        presenter.filterCursos(s.toString());
    }

    @Override
    public void setupListaCursos() {
        GridLayoutManager glm = new GridLayoutManager(this,2);
        rCursos.setLayoutManager(glm);
        adapter = new CursosAdapter(cursos,this);
        rCursos.setAdapter(adapter);
    }

    @Override
    public void actualizarCursos(List<Curso> newCursos) {
        cursos.clear();
        cursos.addAll(newCursos);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void verCurso() {

    }
}
