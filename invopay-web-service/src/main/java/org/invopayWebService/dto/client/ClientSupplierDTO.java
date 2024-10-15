package org.invopayWebService.dto.client;

public class ClientSupplierDTO {
    private int client_id;
    private long client_type;
    private String client_fname;
    private String client_lname;
    private String client_company_name;
    private String client_name;
    private String client_mobile;
    private String client_email;
    private String client_website;
    private String currencyName;
    private String languageName;
    private String client_address_line1;
    private String client_city;
    private String client_state;

    private String supplierName;

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public long getClient_type() {
        return client_type;
    }

    public void setClient_type(long client_type) {
        this.client_type = client_type;
    }

    public String getClient_fname() {
        return client_fname;
    }

    public void setClient_fname(String client_fname) {
        this.client_fname = client_fname;
    }

    public String getClient_lname() {
        return client_lname;
    }

    public void setClient_lname(String client_lname) {
        this.client_lname = client_lname;
    }

    public String getClient_company_name() {
        return client_company_name;
    }

    public void setClient_company_name(String client_company_name) {
        this.client_company_name = client_company_name;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_mobile() {
        return client_mobile;
    }

    public void setClient_mobile(String client_mobile) {
        this.client_mobile = client_mobile;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_website() {
        return client_website;
    }

    public void setClient_website(String client_website) {
        this.client_website = client_website;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getClient_address_line1() {
        return client_address_line1;
    }

    public void setClient_address_line1(String client_address_line1) {
        this.client_address_line1 = client_address_line1;
    }

    public String getClient_city() {
        return client_city;
    }

    public void setClient_city(String client_city) {
        this.client_city = client_city;
    }

    public String getClient_state() {
        return client_state;
    }

    public void setClient_state(String client_state) {
        this.client_state = client_state;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ClientSupplierDTO() {
        super();
    }

    public ClientSupplierDTO(int client_id, long client_type, String client_fname, String client_lname, String client_company_name, String client_name, String client_mobile, String client_email, String client_website, String currencyName, String languageName, String client_address_line1, String client_city, String client_state, String supplierName) {
        this.client_id = client_id;
        this.client_type = client_type;
        this.client_fname = client_fname;
        this.client_lname = client_lname;
        this.client_company_name = client_company_name;
        this.client_name = client_name;
        this.client_mobile = client_mobile;
        this.client_email = client_email;
        this.client_website = client_website;
        this.currencyName = currencyName;
        this.languageName = languageName;
        this.client_address_line1 = client_address_line1;
        this.client_city = client_city;
        this.client_state = client_state;
        this.supplierName = supplierName;
    }

    public ClientSupplierDTO( long client_type, String client_fname, String client_lname, String client_company_name, String client_mobile, String client_email, String client_website, String currencyName, String languageName, String client_address_line1, String client_city, String client_state, String supplierName) {

        this.client_type = client_type;
        this.client_fname = client_fname;
        this.client_lname = client_lname;
        this.client_company_name = client_company_name;
        this.client_mobile = client_mobile;
        this.client_email = client_email;
        this.client_website = client_website;
        this.currencyName = currencyName;
        this.languageName = languageName;
        this.client_address_line1 = client_address_line1;
        this.client_city = client_city;
        this.client_state = client_state;
        this.supplierName = supplierName;
    }
}
