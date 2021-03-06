package projekt.mobilne.unipu.dnevnikkrvnogtlaka;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class UnosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unos);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_unos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        View v = getWindow().getDecorView().findFocus();

        if (id == R.id.povijest_menu) {
            povijestKrvnogTlaka(v);
            return true;
        }
        else if (id == R.id.pocetna_menu) {
            pocetnaStranica(v);
            return true;
        }
        else if (id == R.id.pregled_menu) {
            pregledKrvnogTlaka(v);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void povijestKrvnogTlaka(View v) {
        Intent i  = new Intent(UnosActivity.this, PovijestActivity.class);
        startActivity(i);
    }

    public void pocetnaStranica(View v) {
        Intent i  = new Intent(UnosActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void pregledKrvnogTlaka(View v) {
        Intent i  = new Intent(UnosActivity.this, PregledActivity.class);
        startActivity(i);
    }
}
