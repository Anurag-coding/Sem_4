class Image {
     private int imageWidth;
     private int imageHeight;
     private String colorCode;

    // Parameterized Constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Default Constructor
    public Image() {
        this.imageWidth = 80;
        this.imageHeight = 70;
        this.colorCode = "#ff5745";
    }
    @Override
    public String toString() {
        return "Height: " + imageHeight + ", Width: " + imageWidth + ", ColorCode: " + colorCode;
    }
    public int getImageWidth() {
        return imageWidth;
    }
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }
    public int getImageHeight() {
        return imageHeight;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    public String getColorCode() {
        return colorCode;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    @Override
        public boolean equals(Object o) {
            Image obj=(Image)o; //Object o type casted to Image type and stored in obj
            return imageWidth==obj.imageWidth && imageHeight==obj.imageHeight && colorCode.equals(obj.colorCode);
        }
}

public class q4_Image {
    public static void main(String[] args) {
        Image img1 = new Image(); // Default Constructor
        Image img2 = new Image(12,43, "#b0654g"); // Parameterized Constructor

        System.out.println("Image 1: " + img1.toString()); // Automatically calls toString()
        System.out.println("Image 2: " + img2.toString());
    }
}
/* output:-
   Image 1: Height: 70, Width: 80, ColorCode: #ff5745
   Image 2: Height: 43, Width: 12, ColorCode: #b0654g
*/