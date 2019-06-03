package com.example.alexrese.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PessoaDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public PessoaDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Pessoa pessoa){
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getNome());
        values.put("cpf", pessoa.getCpf());
        values.put("telefone", pessoa.getTelefone());
        values.put("email", pessoa.getEmail());
        return banco.insert("pessoa", null , values);
    }
}
