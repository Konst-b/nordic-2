package second_hometask;

public class Node {
    String name;
    Node before;
    Node after;

    public Node(String name) {
        this.name = name;
        this.before = null;
        this.after = null;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return this.name.equals(node.name) &&
                this.before.equals(node.before) &&
                this.after.equals(node.after);
    }
}

