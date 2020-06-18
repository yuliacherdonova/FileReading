package com.example.pdf_reader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity
{

    PDFView pdfView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView = findViewById(R.id.pdfView);
        intent = getIntent();

        if (intent.getAction().equals( Intent.ACTION_VIEW )) {
            pdfView.fromUri(intent.getData()).load();
        }
        else {
            Toast.makeText(this,"Hello", Toast.LENGTH_SHORT).show();
        }
    }
}
