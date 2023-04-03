package myprograms;

class Encap
{
	private int id;
	private String name;
	private String branch;
	private void dis()
	{
		System.out.println("Encapsulation");

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
        dis();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}


public class Encapsulationpractc {

	public static void main(String[] args) {

		Encap ob=new Encap();
		ob.setId(101);
		ob.setName("vasu");
		ob.setBranch("Testing");
		System.out.println("id :"+ob.getId());
		System.out.println("name :"+ob.getName());

		System.out.println("branch :"+ob.getBranch());


	}

}
