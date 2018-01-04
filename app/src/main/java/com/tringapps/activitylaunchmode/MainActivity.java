package com.tringapps.activitylaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Stack<String> strings = new Stack<>();
        strings.push("one");
        strings.push("two");
        strings.push("three");

        Log.e("find",strings.pop()+">>>>>"+strings.indexOf("two"));

        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");

        Log.e("find Queue",""+queue.remove()+">>>>"+queue.element());



    }

    public void onButtonClick(View view){
startActivity(new Intent(this,MainActivity2.class));
    }
}
