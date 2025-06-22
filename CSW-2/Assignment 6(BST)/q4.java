class Country {
    String name;
    int population;
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    @Override
    public String toString() {
        return name + " (" + population + ")";
    }
}
class BNode {
    Country data;
    BNode left, right;
    public BNode(Country data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BSTCountry {
    BNode root;
    public BSTCountry() {
        root = null;
    }
    // Insert country into BST based on population
    public void insert(Country country) {
        root = insertRec(root, country);
    }
    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            root = new BNode(country);
            return root;
        }
        if (country.population < root.data.population)
            root.left = insertRec(root.left, country);
        else
            root.right = insertRec(root.right, country);

        return root;
    }

    // In-order traversal (sorted by population)
    public void inOrder() {
        System.out.println("Countries in order of population:");
        inOrderRec(root);
        System.out.println();
    }
    private void inOrderRec(BNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }
    // Find country with minimum population
    public Country findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null)
            current = current.left;
        return current.data;
    }
    // Find country with maximum population
    public Country findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null)
            current = current.right;
        return current.data;
    }
}
public class q4 {
    public static void main(String[] args) {
        BSTCountry bst = new BSTCountry();
        bst.insert(new Country("USA", 331000000));
        bst.insert(new Country("India", 1393000000));
        bst.insert(new Country("China", 1444000000));
        bst.insert(new Country("Brazil", 213000000));
        bst.insert(new Country("Nigeria", 206000000));
        bst.insert(new Country("Russia", 146000000));
        bst.inOrder();
        Country minCountry = bst.findMin();
        Country maxCountry = bst.findMax();
        System.out.println("Country with minimum population: " + minCountry);
        System.out.println("Country with maximum population: " + maxCountry);
    }
}
/* output:-
   Countries in order of population:
   Russia (146000000)
   Nigeria (206000000)
   Brazil (213000000)
   USA (331000000)
   India (1393000000)
   China (1444000000)

   Country with minimum population: Russia (146000000)
   Country with maximum population: China (1444000000)
*/
