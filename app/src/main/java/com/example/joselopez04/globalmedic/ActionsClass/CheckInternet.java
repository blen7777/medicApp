package com.example.joselopez04.globalmedic.ActionsClass;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jose.lopez04 on 19/6/2017.
 */

public class CheckInternet
{
    private Context _context;

    public CheckInternet(Context context)
    {
        this._context = context;
    }

    public boolean isConnected()
    {
        ConnectivityManager connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (info != null)
            {
                if (info.getState() == NetworkInfo.State.CONNECTED)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
