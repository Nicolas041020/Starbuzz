package co.edu.unipiloto.starbuzz;

public class Snack {
    private String name;
    private String description;

    private int imageResourceId;

    public static final Snack[] snacks ={
      new Snack("Sandwich","a delicious afternoon snack made with bread, cheese and ham",R.drawable.sandwich),
            new Snack("Brownies","a sweet delicious afternoon snack which you can eat with a delicious espresso",R.drawable.brownies)
    };

    public Snack(String name, String description, int imageResourceId) {
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
