package Encapsulation;

public class Bulb {

    private boolean isSwitched;

    public Bulb (boolean isSwitched) {
        super();
        this.isSwitched = isSwitched;

    }
    @Override
    public String toString() {
        return "Bulb{" + "isSwitched=" + isSwitched + '}';
    }
    public void toggle () {
        if(isSwitched ){

            isSwitched =false;
        }
        else {
            isSwitched = true;
        }
    }

}
