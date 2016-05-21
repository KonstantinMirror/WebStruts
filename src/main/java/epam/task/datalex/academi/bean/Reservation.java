package epam.task.datalex.academi.bean;


import java.util.Date;

public class Reservation {
    private String code;
    private String description;
    private String componentTypeCode;
    private Date createDateTime;
    private InternalStatus internalStatus;

    public Reservation() {
    }

    public Reservation(String code, String description,
                       String componentTypeCode, Date createDateTime,
                       InternalStatus internalStatus) {
        this.code = code;
        this.description = description;
        this.componentTypeCode = componentTypeCode;
        this.createDateTime = createDateTime;
        this.internalStatus = internalStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComponentTypeCode() {
        return componentTypeCode;
    }

    public void setComponentTypeCode(String componentTypeCode) {
        this.componentTypeCode = componentTypeCode;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public InternalStatus getInternalStatus() {
        return internalStatus;
    }

    public void setInternalStatus(InternalStatus internalStatus) {
        this.internalStatus = internalStatus;
    }
}
