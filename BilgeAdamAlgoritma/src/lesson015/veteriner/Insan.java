package lesson015.veteriner;

public abstract class Insan {

	private String tc;
	private String name;

	public Insan(String tc, String name) {
		super();
		this.tc = tc;
		this.name = name;
	}

	public abstract void bilgileriGoster();

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Insan [tc=" + tc + ", name=" + name + "]";
	}

}
