package bst_MichaelChan;

class Node_MichaelChan {
    Node_MichaelChan left_MichaelChan, right_MichaelChan;
    int data_MichaelChan;

    public Node_MichaelChan(int data_MichaelChan) {
        left_MichaelChan = null;
        right_MichaelChan = null;
        this.data_MichaelChan = data_MichaelChan;
    }

    public Node_MichaelChan getLeft_MichaelChan() { return left_MichaelChan; }
    public void setLeft_MichaelChan(Node_MichaelChan left_MichaelChan) {
        this.left_MichaelChan = left_MichaelChan;
    }

    public Node_MichaelChan getRight_MichaelChan() { return right_MichaelChan; }
    public void setRight_MichaelChan(Node_MichaelChan right_MichaelChan) {
        this.right_MichaelChan = right_MichaelChan;
    }

    public int getData_MichaelChan() { return data_MichaelChan; }
    public void setData_MichaelChan(int data_MichaelChan) {
        this.data_MichaelChan = data_MichaelChan;
    }
}

class BinarySearchTree_MichaelChan {
    private Node_MichaelChan root_MichaelChan;

    public BinarySearchTree_MichaelChan() {
        root_MichaelChan = null;
    }

    private Node_MichaelChan insert_MichaelChan(
            Node_MichaelChan node_MichaelChan, int data_MichaelChan) {

        if (node_MichaelChan == null) {
            node_MichaelChan = new Node_MichaelChan(data_MichaelChan);
        } else if (data_MichaelChan <= node_MichaelChan.getData_MichaelChan()) {
            node_MichaelChan.left_MichaelChan =
                    insert_MichaelChan(node_MichaelChan.left_MichaelChan, data_MichaelChan);
        } else {
            node_MichaelChan.right_MichaelChan =
                    insert_MichaelChan(node_MichaelChan.right_MichaelChan, data_MichaelChan);
        }

        return node_MichaelChan;
    }

    public void insert_MichaelChan(int data_MichaelChan) {
        root_MichaelChan = insert_MichaelChan(root_MichaelChan, data_MichaelChan);
    }

    private Node_MichaelChan findMinimum_MichaelChan(Node_MichaelChan node_MichaelChan) {
        while (node_MichaelChan.left_MichaelChan != null) {
            node_MichaelChan = node_MichaelChan.left_MichaelChan;
        }
        return node_MichaelChan;
    }

    private Node_MichaelChan deleteMinimum_MichaelChan(Node_MichaelChan node_MichaelChan) {
        if (node_MichaelChan == null) return null;

        if (node_MichaelChan.left_MichaelChan != null) {
            node_MichaelChan.left_MichaelChan =
                    deleteMinimum_MichaelChan(node_MichaelChan.left_MichaelChan);
            return node_MichaelChan;
        }

        return node_MichaelChan.right_MichaelChan;
    }

    private Node_MichaelChan delete_successor_MichaelChan(
            Node_MichaelChan node_MichaelChan, int data_MichaelChan) {

        if (node_MichaelChan == null) return null;

        if (data_MichaelChan < node_MichaelChan.getData_MichaelChan()) {
            node_MichaelChan.left_MichaelChan =
                    delete_successor_MichaelChan(node_MichaelChan.left_MichaelChan, data_MichaelChan);
        } else if (data_MichaelChan > node_MichaelChan.getData_MichaelChan()) {
            node_MichaelChan.right_MichaelChan =
                    delete_successor_MichaelChan(node_MichaelChan.right_MichaelChan, data_MichaelChan);
        } else if (node_MichaelChan.left_MichaelChan != null
                && node_MichaelChan.right_MichaelChan != null) {
            node_MichaelChan.data_MichaelChan =
                    findMinimum_MichaelChan(node_MichaelChan.right_MichaelChan).data_MichaelChan;
            node_MichaelChan.right_MichaelChan =
                    deleteMinimum_MichaelChan(node_MichaelChan.right_MichaelChan);
        } else {
            node_MichaelChan = (node_MichaelChan.left_MichaelChan != null)
                    ? node_MichaelChan.left_MichaelChan
                    : node_MichaelChan.right_MichaelChan;
        }

        return node_MichaelChan;
    }

    public void delete_successor_MichaelChan(int data_MichaelChan) {
        root_MichaelChan =
                delete_successor_MichaelChan(root_MichaelChan, data_MichaelChan);
    }

    private Node_MichaelChan findMaximum_MichaelChan(Node_MichaelChan node_MichaelChan) {
        while (node_MichaelChan.right_MichaelChan != null) {
            node_MichaelChan = node_MichaelChan.right_MichaelChan;
        }
        return node_MichaelChan;
    }

    private Node_MichaelChan deleteMaximum_MichaelChan(Node_MichaelChan node_MichaelChan) {
        if (node_MichaelChan == null) return null;

        if (node_MichaelChan.right_MichaelChan != null) {
            node_MichaelChan.right_MichaelChan =
                    deleteMaximum_MichaelChan(node_MichaelChan.right_MichaelChan);
            return node_MichaelChan;
        }

        return node_MichaelChan.left_MichaelChan;
    }

    private Node_MichaelChan delete_predecessor_MichaelChan(
            Node_MichaelChan node_MichaelChan, int data_MichaelChan) {

        if (node_MichaelChan == null) return null;

        if (data_MichaelChan < node_MichaelChan.getData_MichaelChan()) {
            node_MichaelChan.left_MichaelChan =
                    delete_predecessor_MichaelChan(node_MichaelChan.left_MichaelChan, data_MichaelChan);
        } else if (data_MichaelChan > node_MichaelChan.getData_MichaelChan()) {
            node_MichaelChan.right_MichaelChan =
                    delete_predecessor_MichaelChan(node_MichaelChan.right_MichaelChan, data_MichaelChan);
        } else if (node_MichaelChan.left_MichaelChan != null
                && node_MichaelChan.right_MichaelChan != null) {
            node_MichaelChan.data_MichaelChan =
                    findMaximum_MichaelChan(node_MichaelChan.left_MichaelChan).data_MichaelChan;
            node_MichaelChan.left_MichaelChan =
                    deleteMaximum_MichaelChan(node_MichaelChan.left_MichaelChan);
        } else {
            node_MichaelChan = (node_MichaelChan.left_MichaelChan != null)
                    ? node_MichaelChan.left_MichaelChan
                    : node_MichaelChan.right_MichaelChan;
        }

        return node_MichaelChan;
    }

    public void delete_predecessor_MichaelChan(int data_MichaelChan) {
        root_MichaelChan =
                delete_predecessor_MichaelChan(root_MichaelChan, data_MichaelChan);
    }

    private void inorder_MichaelChan(Node_MichaelChan node_MichaelChan) {
        if (node_MichaelChan != null) {
            inorder_MichaelChan(node_MichaelChan.getLeft_MichaelChan());
            System.out.print(node_MichaelChan.getData_MichaelChan() + " ");
            inorder_MichaelChan(node_MichaelChan.getRight_MichaelChan());
        }
    }

    public void inorder_MichaelChan() {
        inorder_MichaelChan(root_MichaelChan);
    }

    private void preOrder_MichaelChan(Node_MichaelChan node_MichaelChan) {
        if (node_MichaelChan != null) {
            System.out.print(node_MichaelChan.getData_MichaelChan() + " ");
            preOrder_MichaelChan(node_MichaelChan.getLeft_MichaelChan());
            preOrder_MichaelChan(node_MichaelChan.getRight_MichaelChan());
        }
    }

    public void preOrder_MichaelChan() {
        preOrder_MichaelChan(root_MichaelChan);
    }

    private void postOrder_MichaelChan(Node_MichaelChan node_MichaelChan) {
        if (node_MichaelChan != null) {
            postOrder_MichaelChan(node_MichaelChan.getLeft_MichaelChan());
            postOrder_MichaelChan(node_MichaelChan.getRight_MichaelChan());
            System.out.print(node_MichaelChan.getData_MichaelChan() + " ");
        }
    }

    public void postOrder_MichaelChan() {
        postOrder_MichaelChan(root_MichaelChan);
    }
}

public class BST_MichaelChan {
    public static void main(String[] args_MichaelChan) {
        BinarySearchTree_MichaelChan bst_MichaelChan =
                new BinarySearchTree_MichaelChan();

        bst_MichaelChan.insert_MichaelChan(70);
        bst_MichaelChan.insert_MichaelChan(85);
        bst_MichaelChan.insert_MichaelChan(50);
        bst_MichaelChan.insert_MichaelChan(90);
        bst_MichaelChan.insert_MichaelChan(80);
        bst_MichaelChan.insert_MichaelChan(65);
        bst_MichaelChan.insert_MichaelChan(30);

        System.out.print("Inorder          : ");
        bst_MichaelChan.inorder_MichaelChan();
        System.out.println();

        System.out.print("Preorder         : ");
        bst_MichaelChan.preOrder_MichaelChan();
        System.out.println();

        System.out.print("Postorder        : ");
        bst_MichaelChan.postOrder_MichaelChan();
        System.out.println();

        bst_MichaelChan.delete_predecessor_MichaelChan(70);

        System.out.println("\nSetelah menghapus 70 dengan predecessor:");

        System.out.print("Inorder          : ");
        bst_MichaelChan.inorder_MichaelChan();
        System.out.println();

        System.out.print("Preorder         : ");
        bst_MichaelChan.preOrder_MichaelChan();
        System.out.println();

        System.out.print("Postorder        : ");
        bst_MichaelChan.postOrder_MichaelChan();
        System.out.println();
    }
}