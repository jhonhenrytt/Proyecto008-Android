package henrytenetorres.proyecto008;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        num=(int)(Math.random()*100001);
        String cadena=String.valueOf(num);
        Toast notificacion=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();

    }

    public void controlarr(View v){
         String valoringresado=et1.getText().toString();
        int valor=Integer.parseInt(valoringresado);
        if (valor==num){
            Toast notificacion=Toast.makeText(this,"Muy bien , recordaste el número mostrado.",Toast.LENGTH_LONG);
            notificacion.show();

        }
        else{
            Toast notificacion=Toast.makeText(this,"Lo siento no es el número que mostré.",Toast.LENGTH_LONG);
            notificacion.show();

        }
    }
}
