package ocm.ujiuye.object;

public class Product {
	//���ԣ���Ʒ���
	private String id ;
	//��Ʒ����
	private String name ;
	//��Ʒ����
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
