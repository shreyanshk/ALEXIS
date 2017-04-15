package in.ac.vit.alexis;

import agency.tango.materialintroscreen.*;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.Manifest;
import android.view.View;


/**
 * Created by Shreyansh Khajanchi on 15-04-2017.
 */

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.colorPrimary)
                        .buttonsColor(R.color.colorAccent)
                        .neededPermissions((new String[]{
                                        Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.ACCESS_COARSE_LOCATION,
                                        Manifest.permission.INTERNET,
                                }))
                        .image(agency.tango.materialintroscreen.R.drawable.ic_next)
                        .title("Help support the needly.")
                        .description("Here comes the description.")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(IntroActivity.this, ChooserActivity.class);
                        startActivity(intent);
                    }
                }, "Launch!"));
    }
}
