package com.example.doctoronmobile;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{
	Button PlayBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        PlayBTN = (Button) findViewById(R.id.Main_DoctorBTN);
        PlayBTN.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onClick(View Click) 
	{
		if(Click == PlayBTN)
		{
			Intent intent = new Intent(this,Ilness_MainCategory.class);
			startActivity(intent);
		}
	}
}
