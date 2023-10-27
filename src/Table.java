package src;
import java.util.ArrayList;
public class Table implements Billable{
    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs){
        for(int i = 0; i < numLegs; i++){
            legs.add(new Leg(25));
        }
    }

    @Override
    public Float getPrice() {
        return (float) width * length;
    }
}
