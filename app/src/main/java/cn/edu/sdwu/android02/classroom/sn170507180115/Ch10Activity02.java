package cn.edu.sdwu.android02.classroom.sn170507180115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ch10Activity02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_2);
    }

    public void send_broadcast(View view){
        //
        Intent intent=new Intent("com.inspur.send_broadcast");
        intent.putExtra("key1","message");

        sendBroadcast(intent);
    }
}
