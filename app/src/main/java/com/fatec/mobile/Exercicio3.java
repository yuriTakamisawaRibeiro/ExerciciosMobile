package com.fatec.mobile;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio3 extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPhone;
    private Button buttonGravar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio3layout);

        editTextName= findViewById(R.id.nome);
        editTextEmail= findViewById(R.id.email);
        editTextPhone= findViewById(R.id.telefone);
        buttonGravar = findViewById(R.id.btnGravar);
        buttonGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String phone = editTextPhone.getText().toString();

                // Cria um objeto DatabaseHelper
                DatabaseHelper dbHelper = new DatabaseHelper(Exercicio3.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                // Cria um novo mapa de valores, onde os nomes das colunas são as chaves
                ContentValues values = new ContentValues();
                values.put(DatabaseHelper.COLUMN_NAME, nome);
                values.put(DatabaseHelper.COLUMN_EMAIL, email);
                values.put(DatabaseHelper.COLUMN_PHONE, phone);

                // Insere a nova linha, retornando o valor da chave primária da nova linha
                long newRowId = db.insert(DatabaseHelper.TABLE_NAME, null, values);

                Toast.makeText(Exercicio3.this, "Dados gravados com sucesso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
