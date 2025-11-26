import java.util.List;
import java.util.ArrayList;
class ShoppingCard {
    private List<String> items = new ArrayList<>();
    
    void addItem(String item) {
        items.add(item);
    }
    
    public int getDiscountPercentage(List<String> items) {
    	if(items.contains("Книга")) {
		return 5;
	}
	else
		return 0;
    }
    
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public void removeItem(String item) {
    	items.remove(item);
    }
}

class FP3 {
	public static void main(String args[]) {

		ShoppingCard card = new ShoppingCard();
		card.addItem("Флешка");
		card.addItem("Диск");
		card.addItem("Смартфон");
		card.getItems();
		card.getItems().remove("Смартфон");
		card.getDiscountPercentage(card.getItems());
		ShoppingCard card2 = new ShoppingCard();
		card2.addItem("Книга");
		card2.getDiscountPercentage(card2.getItems());
