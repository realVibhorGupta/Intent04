package www.vibhorgupta.in.intent004;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TitleActivity extends AppCompatActivity {

    // A simple way of ensuring that your log tags are unique
    final static String TAG      = TitleActivity.class.getSimpleName();
    // I tend to publicly define my shared IDs like this, so that they can be reused.
    // And I always define them where the bundle is read, not where the bundle is created.
    public final static String TITLE_ID = TAG + "TITLE_ID";

    // Local Variables
    TextView titleText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        // Define my UI elements
        titleText = (TextView)this.findViewById(R.id.text_title);

        // Get the intent data
        Bundle extras = getIntent().getExtras();

        // Always a good idea to check for the the bundle's presence
        if (null != extras) {
            //
            String titleString = extras.getString(TitleActivity.TITLE_ID);
            Log.d(TAG, "We've got a bundle (" + (null == titleString ? "*NULL*" : titleString) + ")");

            titleText.setText(titleString);
        }
    }
}
