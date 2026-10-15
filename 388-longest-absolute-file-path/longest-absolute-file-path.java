
class Solution {
    public int lengthLongestPath(String input) {
        String[] lines = input.split("\n");
        int[] pathLength = new int[lines.length + 1];
        int maxLength = 0;

        for (String line : lines) {
            int level = line.lastIndexOf('\t') + 1;
            String name = line.substring(level);

            pathLength[level + 1] =
                pathLength[level] + name.length() + 1;

            if (name.contains(".")) {
                maxLength = Math.max(
                    maxLength,
                    pathLength[level] + name.length()
                );
            }
        }

        return maxLength;
    }
}
