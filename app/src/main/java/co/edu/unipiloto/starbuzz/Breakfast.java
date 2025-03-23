package co.edu.unipiloto.starbuzz;

public class Breakfast {

    private String name;
    private String description;

    private int imageResourceId;

    public static final Breakfast[] breakfasts = {
        new Breakfast("pancakes","delicious meal if you like to have a sweet breakfast",R.drawable.pancake),
            new Breakfast("eggs and bacon","delicious and classic meal",R.drawable.baconeggs)

    };

    public Breakfast(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
