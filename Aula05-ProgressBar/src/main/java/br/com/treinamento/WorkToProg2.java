package br.com.treinamento;

import android.os.Handler;
import android.widget.ProgressBar;

/**
 * Created by natanaelfonseca on 06/06/13.
 */
public class WorkToProg2 implements  Runnable  {

    private ProgressBar mProgressBar;
    private Handler mHandler;

    public WorkToProg2(ProgressBar progressBar, Handler handler) {
        mProgressBar = progressBar;
        mHandler = handler;
    }

    @Override
    public void run() {

        for (int i = 0; i< 100; i++ ){

            final int x = i;

            mHandler.post( new Runnable() {

                @Override
                public void run() {

                    mProgressBar.setProgress( x );

                }
            });

            try {
                Thread.sleep( 100 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
