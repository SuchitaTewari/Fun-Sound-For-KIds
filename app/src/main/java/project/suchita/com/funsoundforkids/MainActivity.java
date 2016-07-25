package project.suchita.com.funsoundforkids;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent mShareIntent;
    Button btnAnimal,btnBird,btnPeople;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnimal = (Button) findViewById(R.id.btnAnimal);
        btnBird = (Button) findViewById(R.id.btnBird);
        btnPeople = (Button)findViewById(R.id.btnPeople);
        btnAnimal.setOnClickListener(this);
        btnBird.setOnClickListener(this);
        btnPeople.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Fragment fr;
        if (view == findViewById(R.id.btnAnimal)) {
            fr = new AnimalFragment();
        } else if (view == findViewById(R.id.btnBird)) {
            fr = new BirdFragment();
        } else {
            fr = new PeopleFragment();
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.fragment_place, fr);

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharemenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Share https://androidsolved.wordpress.com/ ");
        startActivity(Intent.createChooser(sharingIntent, "Share"));
        return true;

    }


}
