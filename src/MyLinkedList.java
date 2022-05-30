public class MyLinkedList<E> {


    private Node firstBlock;

    public MyLinkedList (){
        firstBlock = null;
    }

    public class Node {
        public int block;
        public Node ref;

        public Node(int block) {
            this.block = block;
            ref = null;
        }
    }

    public void add(int block){
        Node newNode = new Node(block);
        Node thisNode = firstBlock;
        if (firstBlock == null){
            firstBlock = newNode;
        }else{
            while (thisNode.ref != null){
                thisNode = thisNode.ref;
            }
            thisNode.ref = newNode;

        }
    }
    public void print() {
        Node thisNode = firstBlock;
        if (firstBlock != null){
            System.out.println(firstBlock.block);
        }
        while(thisNode.ref != null){
            thisNode = thisNode.ref;
            System.out.println(thisNode.block);
        }
    }
}
