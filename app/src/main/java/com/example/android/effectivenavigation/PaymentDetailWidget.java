package com.example.android.effectivenavigation;


        import android.app.ActionBar;
        import android.app.FragmentTransaction;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentActivity;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;
        import android.support.v4.view.ViewPager;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;


/**
 * Created by Rita on 21/09/2015.
 */

public class PaymentDetailWidget extends FragmentActivity implements ActionBar.TabListener{

    Button btnGeneratePaydment;
    Button btnCancel;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collect_money);
        btnGeneratePaydment = (Button)findViewById(R.id.ButtonPayment);
        btnCancel = (Button)findViewById(R.id.ButtonCancel);

    }

    public void Cancel(View v){
        this.onBackPressed();
    }

    public void GeneratePayment(View v){
        Toast.makeText(this,"Requesting payment", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in the ViewPager.
        //mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
