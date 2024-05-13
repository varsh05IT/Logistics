package logisticsmanagement

class Billing {
    Customer sender
	Customer receiver
	Integer noOfPackages
	Double weight
	Double amount
	Shipment details
	Tracking status
    static constraints = {
        sender blank: false, nullable: false
        receiver blank: false, nullable: false
        noOfPackages blank: false, nullable: false
        weight blank: false, nullable: false
        amount blank: false, nullable: false
        details blank: false, nullable: false
        status blank: false, nullable: false
    }

}
