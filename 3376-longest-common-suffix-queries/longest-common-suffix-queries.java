class Solution {

    class TrieNode {

        TrieNode[] child = new TrieNode[26];

        // best index for this node
        int index;

        TrieNode(int idx) {
            index = idx;
        }
    }

    TrieNode root;

    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {

        int n = wordsContainer.length;

        // smallest length word index
        int smallest = 0;

        for (int i = 1; i < n; i++) {

            if (wordsContainer[i].length()
                < wordsContainer[smallest].length()) {

                smallest = i;
            }
        }

        root = new TrieNode(smallest);

        // build trie with reversed words
        for (int i = 0; i < n; i++) {
            insert(wordsContainer[i], i, wordsContainer);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    private void insert(String word,
                        int idx,
                        String[] wordsContainer) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {

                node.child[c] = new TrieNode(idx);
            }

            node = node.child[c];

            // update best index
            int curr = node.index;

            if (wordsContainer[idx].length()
                < wordsContainer[curr].length()) {

                node.index = idx;
            }
        }
    }

    private int search(String word) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                break;
            }

            node = node.child[c];
        }

        return node.index;
    }
}