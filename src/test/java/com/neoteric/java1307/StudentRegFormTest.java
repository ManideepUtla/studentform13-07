package com.neoteric.java1307;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentRegFormTest {
    @Test
    public void studentForm(){
        StudentRegistrationForm registrationForm=new StudentRegistrationForm();
        StudentInformation studentInfo=new StudentInformation();
        studentInfo.fullName="Manideep Utla";
        studentInfo.dOB="30-10-2002";
        studentInfo.contactInformation="9985533134";
        studentInfo.gender="Male";
        studentInfo.nationality="Indian";

        ParentInformation parentInfo=new ParentInformation();
        parentInfo.parentName="SrinivasaRao Utla";
        parentInfo.contactNumber="7013447963";
        parentInfo.relationShipToStudent="Father";
        parentInfo.emergencyContactInformation="7013447963";

        EducationInformation educationInfo=new EducationInformation();
        educationInfo.instituteName="Neoteric Method";
        educationInfo.graduationDate="2024";
        educationInfo.howDidYouHearAboutUs="Brother";
        educationInfo.whyareyouInterestedInOurProgram="I like java";


        registrationForm.studentInformation=studentInfo;
        registrationForm.parentInformation=parentInfo;
        registrationForm.educationInformation=educationInfo;


        Assertions.assertNotNull(registrationForm.studentInformation);
        Assertions.assertNotNull(registrationForm.parentInformation);
        Assertions.assertNotNull(registrationForm.educationInformation);
    }
}
