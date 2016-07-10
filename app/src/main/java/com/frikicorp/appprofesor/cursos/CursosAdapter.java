package com.frikicorp.appprofesor.cursos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frikicorp.appprofesor.R;
import com.frikicorp.appprofesor.modelos.Curso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gogodr on 09/07/2016.
 */
public class CursosAdapter extends RecyclerView.Adapter<CursosAdapter.ViewHolder> {

    List<Curso> cursos = new ArrayList<>();
    Context context;

    public CursosAdapter(List<Curso> cursos, Context context) {
        this.cursos = cursos;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_curso, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView curso = (TextView) holder.mView.findViewById(R.id.curso);
        TextView codigo = (TextView) holder.mView.findViewById(R.id.codigo);
        curso.setText(cursos.get(position).getCurso());
        codigo.setText(cursos.get(position).getCodigo());

    }

    @Override
    public int getItemCount() {
        return cursos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;

        public ViewHolder(View v) {
            super(v);
            mView = v;
        }
    }
}