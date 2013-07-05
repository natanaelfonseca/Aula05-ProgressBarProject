package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;



public class MainActivity extends Activity {

    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        mProgressBar1 = (ProgressBar) findViewById( R.id.progressBar );
        mProgressBar2 = (ProgressBar) findViewById( R.id.progressBar2 );
    }

    public void onClick(View view){

        if( view.getId() == R.id.btn_Prog1 ){

            new Thread( new WorkToProg1( mProgressBar1, mHandler ) ).start();

        }else if( view.getId() == R.id.btn_Prog2 ){

            new Thread( new WorkToProg2( mProgressBar2, mHandler ) ).start();

        }

    }

}
