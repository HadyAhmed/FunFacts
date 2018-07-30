package com.hadi.funfacts;

import android.graphics.Color;

import java.util.Random;

public class Facts {
    public String getFacts() {
        String[] facts = {"Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built."};
        return facts[new Random().nextInt(facts.length)];
    }

    public int getColor() {
        String[] colors = {
                "#39add1",
                "#3079ab",
                "#c25975",
                "#e15258",
                "#f9845b",
                "#838cc7",
                "#7d669e",
                "#53bbb4",
                "#51b46d",
                "#e0ab18",
                "#637a91",
                "#f092b0",
                "#b7c0c7"
        };
        return Color.parseColor(colors[new Random().nextInt(colors.length)]);
    }
}
