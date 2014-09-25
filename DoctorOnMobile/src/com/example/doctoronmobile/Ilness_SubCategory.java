package com.example.doctoronmobile;

import java.util.ArrayList;

import java.util.HashMap;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Ilness_SubCategory extends Activity implements OnItemClickListener
{
	String Parasite[] = {"Amebiasis","Anaplasmosis","Anthrax","Babesiosis (Babesia infection)"};
	String AnimalBites[] = {"Animal Bites","Brucellosis","Cat-scratch disease","Rabies"};
	String Brain[] = {"Bacterial Meningitis","Reye Syndrome","Encephalitis","Fabry Disease","Alzheimer's Disease"};
	String Sex[] = {"Gonorrhea","Chlamydia trachomatis infection","Pelvic inflammatory disease (PID) sexually transmitted","Syphilis","HIV"};
	String Skin[] = {"Scabies","Shingles","Leprosy","Abscess","Acrochordon"};
	
	ListView view;
	
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ilness_sub_category);
        
        view = (ListView) findViewById(R.id.Ilness_SubCategory_View);
        
        if(getIntent().getExtras().getString("Main_Category").equals("Parasite"))
        {
        	Load_Data(Parasite);
        }
        else if(getIntent().getExtras().getString("Main_Category").equals("Animal Bites"))
        {
        	Load_Data(AnimalBites);
        }
        else if(getIntent().getExtras().getString("Main_Category").equals("Brain or Spinal"))
        {
        	Load_Data(Brain);
        }
        else if(getIntent().getExtras().getString("Main_Category").equals("Sexually Transmitting Diseases"))
        {
        	Load_Data(Sex);
        }
        else if(getIntent().getExtras().getString("Main_Category").equals("Skin Diseases"))
        {
        	Load_Data(Skin);
        }
        
        view.setOnItemClickListener(this);
    }
	
	public void Load_Data(String[] Data)
	{
		  ArrayList list = new ArrayList();
	      list.removeAll(list);
	        
	        for(int count = 0; count < Data.length;count++)
	        {
	 	        HashMap HM = new HashMap();
	 	        HM.put("TXT", "\n" + Data[count] + "\n");
	 	        list.add(HM);
	        }
	       
	        
	        int id[] = {R.id.text_object_TXT};
	        String key[] = {"TXT"};
	        
	        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(),list,R.layout.text_object,key,id);
	        view.setAdapter(adapter);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View Click, int arg2, long arg3)
	{
		String itemName = ((TextView)Click.findViewById(R.id.text_object_TXT)).getText().toString().trim();
		Intent intent = new Intent(this,Information.class);
		intent.putExtra("Main_Category", getIntent().getExtras().getString("Main_Category"));
		intent.putExtra("index",arg2);
		startActivity(intent);
	}
}
