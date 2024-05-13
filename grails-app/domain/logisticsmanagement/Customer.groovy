package logisticsmanagement

class Customer {
    String name
    Long mobileNumber
	String email
	String address
	Integer pincode
    static constraints = {
        // name blank: false, nullable: false
        // mobileNumber blank:false, size: 10..12
        // email email: true, blank: false
        // address blank:false,nullable: false
        // pincode blank:false, size: 6
    }
    
}
