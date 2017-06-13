package com.qarea.skyhookintegrationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skyhookwireless.accelerator.AcceleratorClient;

public class MainActivity extends AppCompatActivity implements AcceleratorClient.ConnectionCallbacks, AcceleratorClient.OnConnectionFailedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accelerator = new AcceleratorClient(this, "eJwVwckJACAMBMC3xQTMYeJ7XWxK7F2c0ab9y4psBzGDqhAuTxnOLruMsmwQtQ2g3wcSyAtL", this, this);
//        accelerator.connect();
    }

    private AcceleratorClient accelerator;

    @Override
    public void onConnected()
    {

    }

    @Override
    public void onDisconnected()
    {

    }

    @Override
    public void onConnectionFailed(int i)
    {

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        accelerator.disconnect();
    }
}
