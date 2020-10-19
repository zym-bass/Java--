package ocm.ujiuye.object;

public class Product {
	//属性：产品编号
	private String id ;
	//产品名称
	private String name ;
	//产品单价
	private double price;
	
	
	
	public Product() {
		super();
	}
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
