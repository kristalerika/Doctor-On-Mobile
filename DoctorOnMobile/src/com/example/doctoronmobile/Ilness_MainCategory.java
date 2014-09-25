package com.example.doctoronmobile;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
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

public class Ilness_MainCategory extends Activity implements OnItemClickListener
{
	ListView view;

	 @Override
	    protected void onCreate(Bundle savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ilness_category);
	        
	        view = (ListView)findViewById(R.id.Ilness_Category_Listview);
	        
	        
	        int Image[] = {R.drawable.parasite,R.drawable.bites,R.drawable.brain,R.drawable.sex,R.drawable.skin};
	        String Info[] = {"Parasite","Animal Bites","Brain or Spinal","Sexually Transmitting Diseases","Skin Diseases"};	
	    
	        ArrayList list = new ArrayList();
	        list.removeAll(list);
	        
	        for(int count = 0; count < Image.length;count++)
	        {
	 	        HashMap HM = new HashMap();
	 	        HM.put("image", Image[count]);
	 	        HM.put("Info", Info[count]);
	 	        list.add(HM);
	        }
	       
	        
	        int id[] = {R.id.object_images,R.id.object_TXT};
	        String key[] = {"image","Info"};
	        
	        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(),list,R.layout.object,key,id);
	        view.setAdapter(adapter);
	        
	        view.setOnItemClickListener(this);
	        
	    }


	@Override
	public void onItemClick(AdapterView<?> arg0, View Click, int arg2, long arg3) 
	{
		String itemName = ((TextView)Click.findViewById(R.id.object_TXT)).getText().toString();
		
		Intent intent = new Intent(this,Ilness_SubCategory.class);
		intent.putExtra("Main_Category", itemName);
		startActivity(intent);	
	}
}
