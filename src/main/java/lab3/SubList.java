package lab3;

class SubList<T> extends ListContainer {
    Object[] elements;
    private ListContainer parent;
    private int offset;
    int size;

    SubList(ListContainer parent, int offset, int fromIndex, int toIndex) {
        this.parent = parent;
        this.offset = offset + fromIndex;
        this.size = toIndex - fromIndex;

        elements = new Object[toIndex - fromIndex];
        for (int i = fromIndex, k = 0; i < toIndex; i++, k++) {
            elements[k] = parent.get(i);
        }
    }

    public Object get(int index) {
        indexCheck(index);
        return parent.get(index + offset);
    }

    public int size() {
        return this.size;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return "List { " + result + "}";
    }
}

