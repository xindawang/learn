package test;

public interface interfac {
	void a();
	int b();
	default public String c(){
		return "af";
	}
}
