package com.fatec.mobile;

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

                Toast.makeText(Exercicio3.this, "dados gravados", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
