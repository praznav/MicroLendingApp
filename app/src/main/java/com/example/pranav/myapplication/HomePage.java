package com.example.pranav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Pranav on 10/17/2015.
 */
public class HomePage extends AppCompatActivity {
    /**
     * Created by Pranav on 10/17/2015.
     */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home_page);

        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        public void onLoan(View view) {
            Intent intent = new Intent(this, LoanPage.class);
            startActivity(intent);
        }

    public void onBorrow(View view) {
        Intent intent = new Intent(this, BorrowPage.class);
        startActivity(intent);
    }
    public void onTransactionHistory(View view) {
        Intent intent = new Intent(this, HistoryPage.class);
        startActivity(intent);
    }
    public void onPendingTransactions(View view) {
        Intent intent = new Intent(this, TransactionPage.class);
        startActivity(intent);
    }
}
