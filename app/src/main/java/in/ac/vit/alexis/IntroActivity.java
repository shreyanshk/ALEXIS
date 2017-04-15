package in.ac.vit.alexis;

import agency.tango.materialintroscreen.*;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.Manifest;
import android.view.View;


/**
 * Created by Rajesh on 15-04-2017.
 */

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.colorPrimary)
                        .buttonsColor(R.color.colorAccent)
                        .possiblePermissions(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.READ_SMS})
                        .neededPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
                        .image(agency.tango.materialintroscreen.R.drawable.ic_next)
                        .title("Help support the needly.")
                        .description("Description 3")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "with love"));
    }
}
