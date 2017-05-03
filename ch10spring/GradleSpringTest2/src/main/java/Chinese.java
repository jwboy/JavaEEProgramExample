public class Chinese implements Human{
   	private Language lan; 
   	public Chinese(){};
	//构造注入所需要的带参数的构造函数
	public Chinese(Language lan){
		this.lan=lan;
	}	
	public void speak() {
		System.out.println(lan.kind());
   	}
   	public void setLan(Language lan) {
 		this.lan = lan;
   	}



}

