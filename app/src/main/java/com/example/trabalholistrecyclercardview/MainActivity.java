package com.example.trabalholistrecyclercardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listItens;
    private String[] itens = {
            "Caxias do Sul", "Sao Paulo", "Rio de Janeiro"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItens = findViewById(R.id.listItens);

        //Cria adaptador para a lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adiciona adaptador à lista
        listItens.setAdapter(adapter);

        //Adiciona clique na lista
        listItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                                "Item selecionado: "+listItens.getItemAtPosition(position),
                                Toast.LENGTH_SHORT).
                        show();
            }
        });
    }


}