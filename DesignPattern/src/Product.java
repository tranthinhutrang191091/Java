
public class Product {
	int idProduct;
	String nameProduct;
	int id_Category;
	float price;
	public Product(int idProduct, String nameProduct, int id_Category, float price) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.id_Category = id_Category;
		this.price = price;
	}
	public Product() {
	}
	public int getIdProduct() {
		return this.idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return this.nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getId_Category() {
		return this.id_Category;
	}
	public void setId_Category(int id_Category) {
		this.id_Category = id_Category;
	}
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
