package br.com.study.agendaalura.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import br.com.study.agendaalura.R;
import br.com.study.agendaalura.dao.AlunoDAO;
import br.com.study.agendaalura.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        final AlunoDAO dao = new AlunoDAO();

        final TextInputEditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final TextInputEditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final TextInputEditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        MaterialButton botaSalvar = findViewById(R.id.activity_formulario_aluno_botao);

        botaSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno alunoCriado = new Aluno( nome, telefone,email);
                dao.salva(alunoCriado);

                finish();

            }
        });
    }
}
