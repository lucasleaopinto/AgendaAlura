package br.com.study.agendaalura;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        setTitle("Lista Alunos");
        List<String> alunos = new ArrayList<>(Arrays.asList("Jesus","Maria","Jose","Pedro", "Paulo"));
        ListView listaAluno = findViewById(R.id.activity_main_listView);
        listaAluno.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alunos));
    }
}
