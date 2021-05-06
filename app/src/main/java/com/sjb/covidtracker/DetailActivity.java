package com.sjb.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView country,cases,recovered,critical,active,todaycases,todaydeaths,totaldeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent =  getIntent();
        positionCountry = intent.getIntExtra("position",0);


        getSupportActionBar().setTitle("Details of"+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        country = findViewById(R.id.dCountry);
        cases = findViewById(R.id.dCases);
        recovered =findViewById(R.id.dRecovered);
        critical = findViewById(R.id.dCritical);
        active = findViewById(R.id.dActive);
        todaycases = findViewById(R.id.dTodayCase);
        todaydeaths = findViewById(R.id.dTodayDeaths);
        totaldeaths = findViewById(R.id.dTotalDeath);

        country.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        cases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        recovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        critical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        active.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        todaycases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaycase());
        todaydeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaydeaths());
        totaldeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            fileList();
        return super.onOptionsItemSelected(item);
    }

}