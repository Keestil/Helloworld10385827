//Kees Til
//kesketil@hotmail.com
//10385827


package nl.mprog.setup.Hello10385827;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private final String TAG = "Hello World!";
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setupMessageButton();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void setupMessageButton() {
		// 1. reference to the button
		Button messageButton = (Button) findViewById(R.id.button1);
		// 2. run my code
		messageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.i(TAG,"You clicked the button!");
				Toast.makeText(MainActivity.this, "you clicked the button!", Toast.LENGTH_LONG).show();
				// TODO Auto-generated method stub
				
			}
		});
	}
}
