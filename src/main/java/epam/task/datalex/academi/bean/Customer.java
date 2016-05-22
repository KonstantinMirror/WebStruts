package epam.task.datalex.academi.bean;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<Payment> payments = new ArrayList<Payment>();

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String phone, List<Payment> payments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.payments = payments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", payments=" + payments +
                '}';
    }

    public static class Payment{
        private BigDecimal amountPaid;
        private FormOfPaymentTypeCode formOfPaymentTypeCode;
        private CurrencyCode currencyCode;

        public Payment() {
        }

        public Payment(BigDecimal amountPaid, FormOfPaymentTypeCode formOfPaymentTypeCode, CurrencyCode currencyCode) {
            this.amountPaid = amountPaid;
            this.formOfPaymentTypeCode = formOfPaymentTypeCode;
            this.currencyCode = currencyCode;
        }

        public BigDecimal getAmountPaid() {
            return amountPaid;
        }

        public void setAmountPaid(BigDecimal amountPaid) {
            this.amountPaid = amountPaid;
        }

        public FormOfPaymentTypeCode getFormOfPaymentTypeCode() {
            return formOfPaymentTypeCode;
        }

        public void setFormOfPaymentTypeCode(FormOfPaymentTypeCode formOfPaymentTypeCode) {
            this.formOfPaymentTypeCode = formOfPaymentTypeCode;
        }

        public CurrencyCode getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(CurrencyCode currencyCode) {
            this.currencyCode = currencyCode;
        }
    }
}
