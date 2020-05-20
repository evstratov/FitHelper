package com.example.fitnesappv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn_complex_training;
    Button btn_group_training;
    Button btn_add_exercises;
    Button btn_delete_exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_complex_training = (Button) findViewById(R.id.btn_complex_training);
        btn_group_training = (Button) findViewById(R.id.btn_group_trainig);
        btn_add_exercises = (Button) findViewById(R.id.btn_add_exercices);
        btn_delete_exercises = (Button) findViewById(R.id.btn_delete_exercises);

        btn_group_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Group.class);
                startActivity(intent);
            }
        });
        btn_complex_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Complex.class);
                startActivity(intent);
            }
        });
        btn_add_exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddExercise.class);
                startActivity(intent);
            }
        });
        btn_delete_exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeleteEditExercise.class);
                startActivity(intent);
            }
        });
    }

}

