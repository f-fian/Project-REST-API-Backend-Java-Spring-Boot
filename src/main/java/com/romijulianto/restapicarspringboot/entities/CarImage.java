package com.romijulianto.restapicarspringboot.entities;

import javax.persistence.*;

@Entity
public class CarImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private int id;

    /* association table CarImage and Car */
    @ManyToOne
    private CarEntity car;

    /* to store base64 code */
    @Lob
    private String base64;
    private String contentType;

    /* add Getter and Setter */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
