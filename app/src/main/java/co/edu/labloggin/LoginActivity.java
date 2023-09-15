package co.edu.labloggin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.widget.RadioGroup;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Mostrar la fecha en el TextView
        Date fechaActual = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = sdf.format(fechaActual);

        TextView tvFecha = findViewById(R.id.tvFecha);
        tvFecha.setText("Fecha: " + fechaFormateada);

        //Genero
        RadioGroup rgGenero = findViewById(R.id.rgGenero);
        int selectedId = rgGenero.getCheckedRadioButtonId();
        TextView tvGeneroSeleccionado = findViewById(R.id.tvGeneroSeleccionado);

        if (selectedId == R.id.rbMasculino) {
            // El usuario seleccionó "Masculino"
            tvGeneroSeleccionado.setText("Género seleccionado: Masculino");
        } else if (selectedId == R.id.rbFemenino) {
            // El usuario seleccionó "Femenino"
            tvGeneroSeleccionado.setText("Género seleccionado: Femenino");
        } else if (selectedId == R.id.rbNoBinario) {
            // El usuario seleccionó "NoBinario"
            tvGeneroSeleccionado.setText("Género seleccionado: NoBinario");
        } else {
            // No se ha seleccionado ningún género
            tvGeneroSeleccionado.setText("Género seleccionado: No seleccionado");
        }

        //Ir a iniciar sesion
        Button btnIraIniciarSesion = findViewById(R.id.btnIraIniciarSesion);

        btnIraIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Configurar un Intent para abrir LoginActivity
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });






    }









}