package com.fuckingtest.kyawthuhtay.recyclerviewtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by KyawThuHtay on 7/9/2016.
 */

public class DetailActivity extends Activity {

    TextView textName,textUserName,textEmail,textStreet,textSuite, textCity , textZipCode, textlat, textlng, textphone, textwebsite,
    textCompanyname, textCatch , textbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        textName =(TextView)findViewById(R.id.textName);
        textUserName =(TextView)findViewById(R.id.textUserName);
        textEmail =(TextView)findViewById(R.id.textEmail);
        textStreet =(TextView)findViewById(R.id.textStreet);
        textSuite =(TextView)findViewById(R.id.textSuite);
        textCity =(TextView)findViewById(R.id.textCity);
        textZipCode =(TextView)findViewById(R.id.textZipCode);
        textlat =(TextView)findViewById(R.id.textLat);
        textlng =(TextView)findViewById(R.id.textLng);
        textphone =(TextView)findViewById(R.id.textPhone);
        textwebsite =(TextView)findViewById(R.id.textWebsite);
        textCompanyname =(TextView)findViewById(R.id.textCompanyName);
        textCatch =(TextView)findViewById(R.id.textCatch);
        textbs =(TextView)findViewById(R.id.textbs);

        Intent i = getIntent();
        ItemObject obj = (ItemObject) i.getSerializableExtra("name");

        textName.setText(obj.getName());
        textUserName.setText(obj.getUsername());
        textEmail.setText(obj.getEmail());
        textStreet.setText(obj.getAddress().getStreet());
        textSuite.setText(obj.getAddress().getSuite());
        textCity.setText(obj.getAddress().getCity());
        textZipCode.setText(obj.getAddress().getZipcode());
        textlat.setText(obj.getAddress().getGeo().getLat());
        textlng.setText(obj.getAddress().getGeo().getLng());
        textphone.setText(obj.getPhone());
        textwebsite.setText(obj.getWebsite());
        textCompanyname.setText(obj.getCompany().getName());
        textCatch.setText(obj.getCompany().getCatchPhrase());
        textbs.setText(obj.getCompany().getBs());
    }
}
