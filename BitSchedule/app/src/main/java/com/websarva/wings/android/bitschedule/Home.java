package com.websarva.wings.android.bitschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuCreateBlock:
                Intent intentCreate = new Intent(Home.this, CreateBlockActivity.class);
                startActivity(intentCreate);

                break;
            case R.id.menuManageBlock:
                Intent intentManage = new Intent(Home.this, ManageBlockActivity.class);
                startActivity(intentManage);

                break;
            case R.id.menuAchive:
                Intent intentAchive = new Intent(Home.this, ManageBlockActivity.class);
                startActivity(intentAchive);

                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
