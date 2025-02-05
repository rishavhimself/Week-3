
import java.util.LinkedList;

// Implementing a Custom Hash Map using Separate Chaining
class CustomHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % SIZE;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key.equals(key));
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Alice's Age: " + map.get("Alice"));
        map.remove("Alice");
        System.out.println("Alice after removal: " + map.get("Alice"));
    }
}

