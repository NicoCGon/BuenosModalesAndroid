package ar.edu.unaj.apm;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button gracias;
    private Button estornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancias con interfaz
        gracias = (Button)findViewById(R.id.gracias);
        estornudar = (Button)findViewById(R.id.estornudar);

        //Registro listener en cada boton
        gracias.setOnClickListener(graciasListener);
        estornudar.setOnClickListener(estornudarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //GraciasListener
    private View.OnClickListener graciasListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Muestro el mensaje al hacer click en gracias
            Toast.makeText(MainActivity.this, "De Nada!", Toast.LENGTH_LONG).show();
        }
    };

    //EstornudarListener
    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Muestro el mensaje al hacer click en gracias
            Toast.makeText(MainActivity.this, "Salud!", Toast.LENGTH_LONG).show();
        }
    };
}