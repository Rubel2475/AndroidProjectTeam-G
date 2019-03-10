package com.bachelorshelter.anik.medicaladviser.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bachelorshelter.anik.medicaladviser.R;

public class OnlineHospital extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_hospital);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1Activity();
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2Activity();
            }
        });

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3Activity();
            }
        });

        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4Activity();
            }
        });

        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5Activity();
            }
        });

        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6Activity();
            }
        });

        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7Activity();
            }
        });

        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7Activity();
            }
        });
    }

    public void b1Activity() {
        Intent intent = new Intent(this, CardiologistActivity.class);
        startActivity(intent);
    }

    public void b2Activity() {
        Intent intent = new Intent(this, DermatologistActivity.class);
        startActivity(intent);
    }

    public void b3Activity() {
        Intent intent = new Intent(this, NephrologistActivity.class);
        startActivity(intent);
    }

    public void b4Activity() {
        Intent intent = new Intent(this, NephrologistActivity.class);
        startActivity(intent);
    }

    public void b5Activity() {
        Intent intent = new Intent(this, GynecologistActivity.class);
        startActivity(intent);
    }

    public void b6Activity() {
        Intent intent = new Intent(this, PathologistDoctors.class);
        startActivity(intent);
    }

    public void b7Activity() {
        Intent intent = new Intent(this, EyeSpecialistActivity.class);
        startActivity(intent);
    }

    public void b8Activity() {
        Intent intent = new Intent(this, EyeSpecialistActivity.class);
        startActivity(intent);
    }

}

