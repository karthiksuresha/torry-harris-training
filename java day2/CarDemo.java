import java.lang.reflect.Type;

public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",16);
        Car nexon = new Car("Nexon","Petrol",1500,1.5,6,mrf);
        Car audi = new Car("Audi","Petrol",1500,2.5,7,mrf);
        Car rr = new Car("Rolls Royce","Diesel",1500,2.5,6,mrf);
        Tyre apollo = new Tyre("Apollo",18);
        MusicSystem sony = new MusicSystem("Sony",6,false,10);
        MusicSystem jbl = new MusicSystem("JBL",6,true,10);

        nexon.setMusicsystem(sony);
        nexon.displayFeatures();
        nexon.accelerate();
        nexon.applyBrake();
        nexon.changeGear();
        nexon.steer();

        nexon.setTyre(apollo);
        nexon.displayFeatures();

        nexon.setMusicsystem(jbl);
        nexon.displayFeatures();

        rr.setMusicsystem(jbl);
        rr.displayFeatures();

    }
}
