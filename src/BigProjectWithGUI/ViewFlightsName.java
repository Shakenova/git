package BigProjectWithGUI;

import java.io.Serializable;

public class ViewFlightsName implements Serializable {
    private Long id;
    private String flightName;

    public ViewFlightsName(){}
    public ViewFlightsName(Long id, String flightName){
        this.id=id;
        this.flightName=flightName;
    }

    public Long getId(){return id;}

    public void setFlightName(String flightName){this.flightName=flightName;}
    public String getFlightName(){return flightName;}

}

