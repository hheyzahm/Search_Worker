package com.example.searchworker.Entity;

public class Record_of_Resume {
    String name_string,father_name_string,Address_string,date_string, Phone_number_string,CNIC_string,Email_string,password_string;

    String subject_string,education_string,institution_string,obatin_string,total_string,scholarship_string;
    String workPlace_string,from_string,to_string;


    public Record_of_Resume(String workPlace_string, String from_string, String to_string, String subject_string, String education_string, String institution_string, String obatin_string, String total_string, String scholarship_string, String name_string,
                            String father_name_string, String address_string, String date_string, String phone_number_string, String CNIC_string
                    , String Email_string, String password_string) {
        this.name_string = name_string;
        this.father_name_string = father_name_string;
        Address_string = address_string;
        this.date_string = date_string;
        Phone_number_string = phone_number_string;
        this.CNIC_string = CNIC_string;
        this.Email_string=Email_string;
        this.password_string=password_string;
        this.subject_string = subject_string;
        this.education_string = education_string;
        this.institution_string = institution_string;
        this.obatin_string = obatin_string;
        this.total_string = total_string;
        this.scholarship_string = scholarship_string;
        this.workPlace_string = workPlace_string;
        this.from_string = from_string;
        this.to_string = to_string;
    }

    public String getSubject_string() {
        return subject_string;
    }

    public void setSubject_string(String subject_string) {
        this.subject_string = subject_string;
    }

    public String getEducation_string() {
        return education_string;
    }

    public void setEducation_string(String education_string) {
        this.education_string = education_string;
    }

    public String getInstitution_string() {
        return institution_string;
    }

    public void setInstitution_string(String institution_string) {
        this.institution_string = institution_string;
    }

    public String getObatin_string() {
        return obatin_string;
    }

    public void setObatin_string(String obatin_string) {
        this.obatin_string = obatin_string;
    }

    public String getTotal_string() {
        return total_string;
    }

    public void setTotal_string(String total_string) {
        this.total_string = total_string;
    }

    public String getScholarship_string() {
        return scholarship_string;
    }

    public void setScholarship_string(String scholarship_string) {
        this.scholarship_string = scholarship_string;
    }

    public String getWorkPlace_string() {
        return workPlace_string;
    }

    public void setWorkPlace_string(String workPlace_string) {
        this.workPlace_string = workPlace_string;
    }

    public String getFrom_string() {
        return from_string;
    }

    public void setFrom_string(String from_string) {
        this.from_string = from_string;
    }

    public String getTo_string() {
        return to_string;
    }

    public void setTo_string(String to_string) {
        this.to_string = to_string;
    }

    public String getName_string() {
        return name_string;
    }

    public void setName_string(String name_string) {
        this.name_string = name_string;
    }

    public String getFather_name_string() {
        return father_name_string;
    }

    public void setFather_name_string(String father_name_string) {
        this.father_name_string = father_name_string;
    }

    public String getAddress_string() {
        return Address_string;
    }

    public void setAddress_string(String address_string) {
        Address_string = address_string;
    }

    public String getDate_string() {
        return date_string;
    }

    public void setDate_string(String date_string) {
        this.date_string = date_string;
    }

    public String getPhone_number_string() {
        return Phone_number_string;
    }

    public void setPhone_number_string(String phone_number_string) {
        Phone_number_string = phone_number_string;
    }

    public String getCNIC_string() {
        return CNIC_string;
    }

    public void setCNIC_string(String CNIC_string) {
        this.CNIC_string = CNIC_string;
    }

    public String getEmail_string() {
        return Email_string;
    }

    public void setEmail_string(String email_string) {
        Email_string = email_string;
    }

    public String getPassword_string() {
        return password_string;
    }

    public void setPassword_string(String password_string) {
        this.password_string = password_string;
    }


}
