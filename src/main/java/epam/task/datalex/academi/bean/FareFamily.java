package epam.task.datalex.academi.bean;


import java.util.ArrayList;
import java.util.List;

public class FareFamily {
    private String fareFamilyCode;
    private List <String> AncillaryAirComponentCode  = new ArrayList<String>();

    public FareFamily() {
    }

    public FareFamily(String fareFamilyCode, List<String> ancillaryAirComponentCode) {
        this.fareFamilyCode = fareFamilyCode;
        AncillaryAirComponentCode = ancillaryAirComponentCode;
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public List<String> getAncillaryAirComponentCode() {
        return AncillaryAirComponentCode;
    }

    public void setAncillaryAirComponentCode(List<String> ancillaryAirComponentCode) {
        AncillaryAirComponentCode = ancillaryAirComponentCode;
    }

    @Override
    public String toString() {
        return "FareFamily{" +
                "fareFamilyCode='" + fareFamilyCode + '\'' +
                ", AncillaryAirComponentCode=" + AncillaryAirComponentCode +
                '}';
    }
}
