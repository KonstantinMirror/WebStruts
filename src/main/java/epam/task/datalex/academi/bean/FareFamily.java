package epam.task.datalex.academi.bean;


import java.util.ArrayList;
import java.util.List;

public class FareFamily {
    private String fareFamilyCode;
    private List <String> ancillaryAirComponentCode = new ArrayList<String>();

    public FareFamily() {
    }

    public FareFamily(String fareFamilyCode, List<String> ancillaryAirComponentCode) {
        this.fareFamilyCode = fareFamilyCode;
        this.ancillaryAirComponentCode = ancillaryAirComponentCode;
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public List<String> getAncillaryAirComponentCode() {
        return ancillaryAirComponentCode;
    }

    public void setAncillaryAirComponentCode(List<String> ancillaryAirComponentCode) {
        this.ancillaryAirComponentCode = ancillaryAirComponentCode;
    }

    @Override
    public String toString() {
        return "FareFamily{" +
                "fareFamilyCode='" + fareFamilyCode + '\'' +
                ", ancillaryAirComponentCode=" + ancillaryAirComponentCode +
                '}';
    }
}
