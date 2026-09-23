// Phạm Đức Trường - 25810048
fun main(){
    fun hamChuoi(ten String?){
        val tenSafeCall : Int? = ten?.length
        val tenElvis String : ten?: "Khach vang lai"
        val tenHaiThang Int : ten!!.length
        
        //doi voi toan tu cham thang, voi 1 doan code null thi code
        //se loi ngay lap tuc, o day chi dung khi chac chan bien nay
        //khong null, vi du nhu thong tin nguoi dung: username, password
        
        println("Do dai la: $tenSafeCall")
        println("ten khach: $tenElvis")
        print("Do dai lan 2: $tenHaiThang")
    }
    
    hamChuoi()
}

