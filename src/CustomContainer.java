public class CustomContainer {

        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;

        public CustomContainer(int initialCapacity) {
            if (initialCapacity <= 0) {
                throw new IllegalArgumentException("Initial capacity must be positive");
            }
            this.elements = new Object[initialCapacity];
        }

        public CustomContainer() {
            this(DEFAULT_CAPACITY);
        }

        public void add(Object element) {
            ensureCapacity();
            elements[size++] = element;
        }


        public Object get(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            return elements[index];
        }


        public void remove(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }

            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;
        }


        private void ensureCapacity() {
            if (size == elements.length) {
                Object[] newElements = new Object[elements.length * 2];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
        }


        public int size() {
            return size;
        }
}
