package br.com.treinamento;

import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by natanaelfonseca on 06/06/13.
 */
public class WorkToProg1 implements  Runnable  {

    private ProgressBar mProgressBar;
    private Handler mHandler;

    public WorkToProg1(ProgressBar progressBar, Handler handler) {
        mProgressBar = progressBar;
        mHandler = handler;
    }

    @Override
    public void run() {

        mHandler.post( new Runnable() {

            @Override
            public void run() {

                mProgressBar.setVisibility( View.VISIBLE );

            }
        });

        try {
            Thread.sleep( 2000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }

        mHandler.post( new Runnable() {

            @Override
            public void run() {

                mProgressBar.setVisibility( View.GONE );

            }
        });

    }
}
