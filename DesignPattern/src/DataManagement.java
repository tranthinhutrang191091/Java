import java.util.ArrayList;
import java.util.List;

public class DataManagement {
	List<Category> cat;
	List<Product> pro;
	private static DataManagement instance=null;
	private DataManagement() {
		cat= new ArrayList<>();
		pro= new ArrayList<>();
		System.out.println("Init object from class objcet DataManagement");
	}
	public synchronized static DataManagement getInstance() {
		if(instance ==null) {
			instance = new DataManagement();	
		}
		return instance;
	}
	public List<Category> getCat() {
		return this.cat;
	}
	public void setCat(List<Category> cat) {
		this.cat = cat;
	}
	public List<Product> getPro() {
		return this.pro;
	}
	public void setPro(List<Product> pro) {
		this.pro = pro;
	}
	public static void setInstance(DataManagement instance) {
		DataManagement.instance = instance;
	}
}
