import java.util.HashSet;

class Set {
    private HashSet<Integer> elements;

    public Set(int n) {
        elements = new HashSet<>();
        for (int i = 0; i < n; i++) {
            elements.add((int) (Math.random() * 100));
        }
    }

    public Set(HashSet<Integer> elements) {
        this.elements = new HashSet<>(elements);
    }

    public HashSet<Integer> getElements() {
        return elements;
    }

    // Метод для объединения текущего множества с другим
    public Set union(Set otherSet) {
        HashSet<Integer> unionSet = new HashSet<>(this.elements);
        unionSet.addAll(otherSet.getElements());
        return new Set(unionSet);
    }

    // Метод для пересечения текущего множества с другим
    public Set intersection(Set otherSet) {
        HashSet<Integer> intersectionSet = new HashSet<>(this.elements);
        intersectionSet.retainAll(otherSet.getElements());
        return new Set(intersectionSet);
    }

    public void printSet() {
        System.out.println(elements);
    }

}