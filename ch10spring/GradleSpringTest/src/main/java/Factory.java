public class Factory {
	public Human getHuman(String name){
		if(name.equals("Chinese")){
			return new Chinese();
		}else if(name.equals("American")){
			return new American();
		}else{
			throw new IllegalArgumentException("参数不正确");
		}
   	}
}
