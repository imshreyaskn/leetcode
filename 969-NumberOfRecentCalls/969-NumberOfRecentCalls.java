// Last updated: 5/25/2026, 4:28:00 PM
import java.util.*;

class RecentCounter {

    Queue<Integer> q = new LinkedList<>();

    public int ping(int t) {
        q.add(t);
        while (!q.isEmpty() && t - q.peek() > 3000) {
            q.remove();
        }
        return q.size();
    }
}
