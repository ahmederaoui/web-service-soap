package services;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double mantant;
    @XmlTransient
    private Date dateCreation;

    public Compte(int code, double mantant, Date dateCreation) {
        this.code = code;
        this.mantant = mantant;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMantant() {
        return mantant;
    }

    public void setMantant(double mantant) {
        this.mantant = mantant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
