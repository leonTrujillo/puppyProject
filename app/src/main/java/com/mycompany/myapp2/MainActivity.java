package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity {
	ImageView fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState){	
        super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		fondo=findViewById(R.drawable.logopuppy);
		
        
    }
}
