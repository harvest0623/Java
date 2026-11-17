package org.model;

import java.util.Date;

/**
 * 供应商 POJO
 */
public class Provider {
    private Integer id;
    private String proCode;
    private String proName;
    private String proContact;
    private String proPhone;
    private String proAddress;
    private String proFax;
    private String createdBy;
    private Date creationDate;

    public Provider() {}

    // getter / setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getProCode() { return proCode; }
    public void setProCode(String proCode) { this.proCode = proCode; }

    public String getProName() { return proName; }
    public void setProName(String proName) { this.proName = proName; }

    public String getProContact() { return proContact; }
    public void setProContact(String proContact) { this.proContact = proContact; }

    public String getProPhone() { return proPhone; }
    public void setProPhone(String proPhone) { this.proPhone = proPhone; }

    public String getProAddress() { return proAddress; }
    public void setProAddress(String proAddress) { this.proAddress = proAddress; }

    public String getProFax() { return proFax; }
    public void setProFax(String proFax) { this.proFax = proFax; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public Date getCreationDate() { return creationDate; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }

    @Override
    public String toString() {
        return "Provider{" +
            "id=" + id +
            ", proCode='" + proCode + '\'' +
            ", proName='" + proName + '\'' +
            ", proContact='" + proContact + '\'' +
            ", proPhone='" + proPhone + '\'' +
            ", proAddress='" + proAddress + '\'' +
            ", proFax='" + proFax + '\'' +
            ", createdBy='" + createdBy + '\'' +
            ", creationDate=" + creationDate +
            '}';
    }
}