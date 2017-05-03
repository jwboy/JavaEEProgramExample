public class Test {    
   	public static void main(String[] args) {
	  	Human human=null;
	  	human=new Factory().getHuman("Chinese");
	  	human.eat();
	  	human.walk();
		human=new Factory().getHuman("American");
	  	human.eat();
	  	human.walk();
   	}
}
