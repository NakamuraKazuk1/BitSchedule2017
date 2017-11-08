package com.websarva.wings.android.bitschedule;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ManageBlockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_block);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int itemId = item.getItemId();
            switch (itemId) {
                case android.R.id.home:
                    finish();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
}
