package com.example.alexrese.crud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private EditText email;
    private PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = findViewById(R.id.etNome);
        cpf = findViewById(R.id.etCpf);
        telefone = findViewById(R.id.etTelefone);
        email = findViewById(R.id.etEmail);
        dao = new PessoaDAO(this);
    }


    public void salvar(View view) {
        Pessoa p = new Pessoa();

        p.setNome(nome.getText().toString());
        p.setCpf(cpf.getText().toString());
        p.setTelefone(telefone.getText().toString());
        p.setEmail(email.getText().toString());
        long id = dao.inserir(p);
        Toast.makeText(this, "Pessoa inserida com id "+id, Toast.LENGTH_SHORT).show();
    }
}
