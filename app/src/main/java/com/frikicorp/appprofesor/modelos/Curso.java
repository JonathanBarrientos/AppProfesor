package com.frikicorp.appprofesor.modelos;

/**
 * Created by Gogodr on 09/07/2016.
 */
public class Curso {
    private String curso,codigo;

    public Curso(String curso, String codigo) {
        this.curso = curso;
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
