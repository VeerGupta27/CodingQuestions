class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // skip out-of-bounds or already visited
            if (i < 0 || i >= n || visited[i]) continue;

            if (arr[i] == 0) return true;

            visited[i] = true;

            queue.offer(i + arr[i]);  // jump right
            queue.offer(i - arr[i]);  // jump left
        }

        return false;
    }
}