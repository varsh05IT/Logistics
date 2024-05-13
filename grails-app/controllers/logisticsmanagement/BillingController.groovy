package logisticsmanagement

class BillingController {

    def index() { }
    def login(){ 
        def username=params?.username ?: "";
        def password=params?.password ?: "";
        println "${params}"
        if((username.equals("sowmiya")) && (password.equals("123") )){
            redirect(action: "viewBills")
        }else{
         //redirect(action:"index")
         redirect(action: "viewBills")
        }
    }
     def viewBills(){
        
     }
     def save(){
     }
}
