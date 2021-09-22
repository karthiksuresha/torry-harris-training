package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypesDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF", 18);
        MusicSystem jbl = new MusicSystem("JBL", 6, true, 10);
        HatchBack swift = new HatchBack("Swift", "Petrol", 1500, 1.5, 6, mrf, jbl, "Manual");
        Sedon dzire = new Sedon("Dzire", "Petrol", 1500, 1.5, 6, mrf, jbl,2000);
        Suv xuv = new Suv("XUV 5OO", "Petrol", 2000, 2.0, 6, mrf, jbl,"Sport",true);

        swift.displayHatchBackFeatures();
        dzire.displaySedonFeatures();
        xuv.displaySuvFeatures();
    }
}
