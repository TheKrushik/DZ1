package info.krushik.android.dz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView4;
    Button button;
//    Button button2;
    EditText editText;
    EditText editText2;
    int count;
//    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView4 = (TextView) findViewById(R.id.textView4);
        button = (Button) findViewById(R.id.button);
//        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 12) {
                    textView.setText(String.valueOf(count++));
                }
                if (s.length() == 23) {
                    textView.setText("I love GoIT so much");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public void setText (View view){
        textView.setText(String.valueOf(count++));
    }

    public void resultFibonachi (View view){
        textView4.setText(String.valueOf(fibonachi(Integer.parseInt(editText2.getText().toString()))));
    }



    public int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}
