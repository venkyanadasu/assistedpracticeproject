package constructor;


	class std{
		int id;
		String name ;
		
		std(int a,String b){
			 id =a;
			 name = b;
		}
			void display() {
				System.out.println(id+" "+name);
				
			}
			
		}
		
	
	public class Paraconst {
		public static void main(String args[]) {
			std id1=new std(12,"venkatesh");
			std name1=new std(10,"vara");
			id1.display();
			name1.display();
			
		}

}