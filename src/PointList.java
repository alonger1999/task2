public class PointList {

    private class Element {

        private Point value;
        private Element next;

    }

    private Element head;
    private int size = 0;

    public void add(Point point) {

        if (head == null) {

            head = new Element();
            head.value = point;

        } else {

            Element current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Element();
            current.next.value = point;

        }

        size++;

    }

    public Point[] toArray() {

        Point[] result = new Point[size];

        Element current = head;
        int i = 0;

        while (current != null) {

            result[i] = current.value;

            current = current.next;
            i++;

        }

        return result;

    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        Element current = head;

        while (current != null) {
            result.append(current.value.toString()).append("\n");
            current = current.next;
        }

        return result.toString();

    }

}
