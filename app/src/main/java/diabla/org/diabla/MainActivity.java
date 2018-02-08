package diabla.org.diabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Maldito viruscxcxcxcx

              findViewById(R.id.enviar).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Toast.makeText(getApplicationContext(),"Tu mensaje se envio!", Toast.LENGTH_LONG).show();
                  }
              });

    }
}
