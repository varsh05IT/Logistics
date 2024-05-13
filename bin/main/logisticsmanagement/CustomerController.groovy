package logisticsmanagement

class CustomerController {

    def index() { }
    def customerDetails(){

    }
     def save(){
        def customer=new Customer();
        if(customer.validate()){
            customer.save();
        }
        else{
            println customer.errors;
        }
        redirect(controller:"Billing", action:"index");
     }
}
