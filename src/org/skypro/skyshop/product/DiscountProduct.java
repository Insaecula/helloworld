package org.skypro.skyshop.product;

public class DiscountProduct extends Product {
    private final int basePrice;
    private final int discount;

    public DiscountProduct(String name, int basePrice, int discount) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Базовая цена продукта должна быть строго больше 0.");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Процент скидки должен быть в пределах от 0 до 100.");
        }
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getDiscount() {
        return discount;
    }


    @Override
    public int getPrice() {
        return basePrice - (basePrice * discount / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discount + "%)";
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }
}
