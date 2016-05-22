package epam.task.datalex.academi.bean;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private String code;
    private String description;
    private List<ReservationComponent> reservationComponents = new ArrayList<ReservationComponent>();

    public static class ReservationComponent {
        private String componentTypeCode;
        private Date createDateTime;
        private InternalStatus internalStatus;

        public ReservationComponent() {
        }

        public ReservationComponent(String componentTypeCode, Date createDateTime,
                                    InternalStatus internalStatus) {
            this.componentTypeCode = componentTypeCode;
            this.createDateTime = createDateTime;
            this.internalStatus = internalStatus;
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

        @Override
        public String toString() {
            return "ReservationComponent{" +
                    "componentTypeCode='" + componentTypeCode + '\'' +
                    ", createDateTime=" + createDateTime +
                    ", internalStatus=" + internalStatus +
                    '}';
        }
    }


    public Reservation() {
    }

    public Reservation(String code, String description,
                       List<ReservationComponent> reservationComponents) {
        this.code = code;
        this.description = description;
        this.reservationComponents = reservationComponents;
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

    public List<ReservationComponent> getReservationComponents() {
        return reservationComponents;
    }

    public void setReservationComponents(List<ReservationComponent> reservationComponents) {
        this.reservationComponents = reservationComponents;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", reservationComponents=" + reservationComponents +
                '}';
    }
}
