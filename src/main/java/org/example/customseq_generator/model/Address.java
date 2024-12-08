package org.example.customseq_generator.model;


import jakarta.persistence.*;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String area;
    private String city;
    private String state;

//    public Address(String area, String city, String state, Employee employee) {
//        this.area = area;
//        this.city = city;
//        this.state = state;
//        this.employee = employee;
//    }

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", employee=" + employee +
                '}';
    }
}
