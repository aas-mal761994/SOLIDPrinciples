package com.leet.code.solution;

public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        Solution22.MyHashMap map = new Solution22().new MyHashMap();

        map.put(1,10);
        map.put(1,11);
        //map.put(3,30);
    }

    class MyHashMap {

        final Node[] nodes = new Node[10000];

        class Node {
            int key;
            int value;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        //create a hashFunction
        int hashFunction(int key) {
            return Integer.hashCode(key) % nodes.length;
        }

        //create a find method
        Node find(Node node, int key) {
            Node prev = null;
            for (; node != null && node.key != key; node = node.next) {
                prev = node;
            }
            return prev;
        }

        public MyHashMap() {

        }

        public void put(int key, int value) {
            int i = hashFunction(key);
            if(nodes[i] == null){
                nodes[i] = new Node(-1, -1);
            }
            Node prev = find(nodes[i], key);
            if(prev.next == null){
                prev.next = new Node(key, value);
            } else {
                prev.next.value = value;
            }

        }

        public int get(int key) {
            int i = hashFunction(key);
            if(nodes[i] == null){
                return -1;
            }
            Node node = find(nodes[i], key);
            return node.next == null ? -1 : node.next.value;

        }

        public void remove(int key) {

            int i = hashFunction(key);
            if(nodes[i] != null){
                Node prev = find(nodes[i], key);
                if(prev.next != null){
                    prev.next = prev.next.next;
                }
            }

        }
    }

}
