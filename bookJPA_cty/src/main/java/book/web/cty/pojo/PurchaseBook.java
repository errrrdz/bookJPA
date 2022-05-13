package book.web.cty.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
@Table(name = "purchase_book")
public class PurchaseBook implements Serializable {
    @Id
    private Long isbn;//isbn

    private String category;//category
    private String des;//des
    private String name;//name
    private String picture;//picture
    private String press;//press
    @Transient
    private String categoryName;
    @Transient
    private String pressName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String inventoryName) {
        this.categoryName = inventoryName;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }

}
