package org.scala.library.android.tester;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.scala.library.android.tester.scala.TestFeature;

/**
 * Hello world!
 *
 */
public class HelloScala extends Activity {

    @Override
    public synchronized void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        //setContentView(R.layout.main);

        PrintStream m_out = new PrintStream(new OutputStream() {
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            @Override
            public void write(int oneByte) throws IOException {
                output.write(oneByte);
                if (oneByte == '\n') {
                    Log.v("out", new String(output.toByteArray()));
                    output = new ByteArrayOutputStream();
                }
            }
        });
        System.setErr(m_out);
        System.setOut(m_out);
        Log.i("scala.android", "hello from scala android");

        TestFeature testf = new TestFeature();
        String res = testf.runTest();


        TextView textView = new TextView(this); // Construct a TextView UI
        textView.setText(res);      // Set text for TextView
        setContentView(textView);


        

        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
