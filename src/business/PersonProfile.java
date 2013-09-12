/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Whisley
 */
public class PersonProfile {

    public static void setDemographicInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    private class DemographicInfo {
    
         
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private int age;
        private double weight;
        private double height;
        private int phoneNumber;
        private String snn;

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

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSnn() {
            return snn;
        }

        public void setSnn(String snn) {
            this.snn = snn;
        }
    }
    
    private class AddressInfo {
        
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;

        public String getStreetAddress() {
            return streetAddress;
        }

        public void setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
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

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
        
    
        
    }
    
    private class SavingAccountInfo {
        
        private String sBankName;
        private int sRoutingNumber;
        private int sAccountNo;
        private int sAccountBalance;
        private String sAccountType;

        public String getsBankName() {
            return sBankName;
        }

        public void setsBankName(String sBankName) {
            this.sBankName = sBankName;
        }

        public int getsRoutingNumber() {
            return sRoutingNumber;
        }

        public void setsRoutingNumber(int sRoutingNumber) {
            this.sRoutingNumber = sRoutingNumber;
        }

        public int getsAccountNo() {
            return sAccountNo;
        }

        public void setsAccountNo(int sAccountNo) {
            this.sAccountNo = sAccountNo;
        }

        public int getsAccountBalance() {
            return sAccountBalance;
        }

        public void setsAccountBalance(int sAccountBalance) {
            this.sAccountBalance = sAccountBalance;
        }

        public String getsAccountType() {
            return sAccountType;
        }

        public void setsAccountType(String sAccountType) {
            this.sAccountType = sAccountType;
        }
         
    }
    
    private class CheckingAccountInfo {

        private String cBankName;
        private String cRoutingNo;
        private String cAccountNo;
        private int cAccountBalance;
        private String cAccountType;

        public String getcBankName() {
            return cBankName;
        }

        public void setcBankName(String cBankName) {
            this.cBankName = cBankName;
        }

        public String getcRoutingNo() {
            return cRoutingNo;
        }

        public void setcRoutingNo(String cRoutingNo) {
            this.cRoutingNo = cRoutingNo;
        }

        public String getcAccountNo() {
            return cAccountNo;
        }

        public void setcAccountNo(String cAccountNo) {
            this.cAccountNo = cAccountNo;
        }

        public int getcAccountBalance() {
            return cAccountBalance;
        }

        public void setcAccountBalance(int cAccountBalance) {
            this.cAccountBalance = cAccountBalance;
        }

        public String getcAccountType() {
            return cAccountType;
        }

        public void setcAccountType(String cAccountType) {
            this.cAccountType = cAccountType;
        }
        
        
    }
    
    private class DriverLicenseInfo {
        
        private String licenseNo;
        private String issuedDate;
        private String expireDate;
        private String bloodType;
        private String photo;

        public String getLicenseNo() {
            return licenseNo;
        }

        public void setLicenseNo(String licenseNo) {
            this.licenseNo = licenseNo;
        }

        public String getIssuedDate() {
            return issuedDate;
        }

        public void setIssuedDate(String issuedDate) {
            this.issuedDate = issuedDate;
        }

        public String getExpireDate() {
            return expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public String getBloodType() {
            return bloodType;
        }

        public void setBloodType(String bloodType) {
            this.bloodType = bloodType;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
        
        
    }
    private class MedicalInfo {
        private String medicalNo;
        private String alergy1;
        private String alergy2;
        private String alergy3;

        public String getMedicalNo() {
            return medicalNo;
        }

        public void setMedicalNo(String medicalNo) {
            this.medicalNo = medicalNo;
        }

        public String getAlergy1() {
            return alergy1;
        }

        public void setAlergy1(String alergy1) {
            this.alergy1 = alergy1;
        }

        public String getAlergy2() {
            return alergy2;
        }

        public void setAlergy2(String alergy2) {
            this.alergy2 = alergy2;
        }

        public String getAlergy3() {
            return alergy3;
        }

        public void setAlergy3(String alergy3) {
            this.alergy3 = alergy3;
        }
        
    }
    private DemographicInfo demoInfo;
    private AddressInfo addInfo;
    private SavingAccountInfo savingInfo;
    private CheckingAccountInfo checkingInfo;
    private DriverLicenseInfo driverInfo;
    private MedicalInfo medicalInfo;

    public DemographicInfo getDemoInfo() {
        return demoInfo;
    }

    public AddressInfo getAddInfo() {
        return addInfo;
    }

    public SavingAccountInfo getSavingInfo() {
        return savingInfo;
    }

    public CheckingAccountInfo getCheckingInfo() {
        return checkingInfo;
    }

    public DriverLicenseInfo getDriverInfo() {
        return driverInfo;
    }

    public MedicalInfo getMedicalInfo() {
        return medicalInfo;
    }
    
    
}
