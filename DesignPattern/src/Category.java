import java.util.List;

public class Category {
	int idCategory;
	String nameCategory;
	public Category(int idCategory, String nameCategory) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
	}
	public Category() {
	}
	public int getId() {
		return this.idCategory;
	}
	public void setId(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getName() {
		return this.nameCategory;
	}
	public void setName(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	public void input() {
		List<Category> categorys = DataManagement.getInstance().getCat();
	}
}
