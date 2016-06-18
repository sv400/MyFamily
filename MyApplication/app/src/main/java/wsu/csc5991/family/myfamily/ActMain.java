package wsu.csc5991.family.myfamily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ActMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_main);
        //Toast.makeText(getApplicationContext(), "Message", Toast.LENGTH_LONG).show();

        View view;
        Toast toast;
        view = getLayoutInflater().inflate(R.layout.lay_notification, null);
        toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(view);
        toast.show();

    }

    //----------------------------------------------------------------
    // Variables
    //----------------------------------------------------------------



    //----------------------------------------------------------------
    // onStart
    //----------------------------------------------------------------
    @Override
    protected void onStart()
    {
        System.out.println("### DEBUG ### onStart");
        super.onStart();
    }

    //----------------------------------------------------------------
    // onResume
    //----------------------------------------------------------------
    @Override
    protected void onResume()
    {
        System.out.println("### DEBUG ### onResume");
        super.onResume();
    }

    //----------------------------------------------------------------
    // onPause
    //----------------------------------------------------------------
    @Override
    protected void onPause()
    {
        System.out.println("### DEBUG ### onPause");
        super.onPause();
    }

    //----------------------------------------------------------------
    // onStop
    //----------------------------------------------------------------
    @Override
    protected void onStop()
    {
        System.out.println("### DEBUG ### onStop");
        super.onStop();
    }

    //----------------------------------------------------------------
    // onRestart
    //----------------------------------------------------------------
    @Override
    protected void onRestart()
    {
        System.out.println("### DEBUG ### onRestart ");
        super.onRestart();
    }

    //----------------------------------------------------------------
    // onDestroy
    //----------------------------------------------------------------
    @Override
    protected void onDestroy()
    {
        System.out.println("### DEBUG ### onDestroy ");
        super.onDestroy();
    }

}
