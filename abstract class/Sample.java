abstract class Sample{
	public void display(){
	System.out.println("display method");
	}
	abstract void test();

}

abstract class SampleChild extends Sample{
	void test(){
	System.out.println("test method implemented in childclass");
	}
}

  class GrandSample extends SampleChild{
	void demo(){
	System.out.println("demo method implemented in childclass");
	}
}