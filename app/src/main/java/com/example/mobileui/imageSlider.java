package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class imageSlider extends AppCompatActivity {

    private ImageSlider slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        slider=findViewById(R.id.imagesl);

        ArrayList<SlideModel> slideModels=new ArrayList<>();

        slideModels.add(new SlideModel("https://img.freepik.com/free-photo/wide-angle-shot-single-tree-growing-clouded-sky-during-sunset-surrounded-by-grass_181624-22807.jpg?w=1060&t=st=1674134928~exp=1674135528~hmac=ff2ea58d2967c8e0cfdbe1ce36416c9aaf1617608a702974cc3b34c5e44543c0", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://img.freepik.com/free-photo/modern-futuristic-sci-fi-background_35913-2150.jpg?w=1060&t=st=1674134996~exp=1674135596~hmac=ba08d210645f585383305784a256fa89bd8d5d2f02a93ab09626e95d970de2fb", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://img.freepik.com/free-vector/savannah-landscape-with-acacia-trees-night-vector-cartoon-illustration-african-savanna-with-full-moon-stars-dark-sky-concept-safari-vacation-trip-travel_107791-11532.jpg?w=1380&t=st=1674135036~exp=1674135636~hmac=25261cabce0785899d4c88c08be6041c1eeee95736d9ed13db15c1cd847b5ce1", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://img.freepik.com/free-photo/modern-futuristic-sci-fi-background_35913-2150.jpg?w=1060&t=st=1674134996~exp=1674135596~hmac=ba08d210645f585383305784a256fa89bd8d5d2f02a93ab09626e95d970de2fb", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://img.freepik.com/free-vector/savannah-landscape-with-acacia-trees-night-vector-cartoon-illustration-african-savanna-with-full-moon-stars-dark-sky-concept-safari-vacation-trip-travel_107791-11532.jpg?w=1380&t=st=1674135036~exp=1674135636~hmac=25261cabce0785899d4c88c08be6041c1eeee95736d9ed13db15c1cd847b5ce1", ScaleTypes.FIT));

        slider.setImageList(slideModels,ScaleTypes.FIT);
    }
}