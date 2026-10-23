package pertemuan;
 
class AVL_Node<AnyType> {
    AnyType element; // Nilai Pada Node
    AVL_Node<AnyType> left, right; // Subtree Kiri Dan Kanan
    int height; // Tinggi Pohon
 
    public AVL_Node(AnyType element, AVL_Node<AnyType> left, AVL_Node<AnyType> right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.height = 0; // Inisialisasi tinggi default
    }
 
    public String toString() {
        return left + " " + right;
    }
}
 
class AVL_Tree<AnyType extends Comparable<? super AnyType>> {
    private AVL_Node<AnyType> root;
 
    public AVL_Tree() {
        this.root = null;
    }
 
    private int height(AVL_Node<AnyType> t) {
        return t == null ? -1 : t.height;
    }
 
    public void height() {
        System.out.println("Tinggi = " + height(root));
    }
 
    private int maks(int lh, int rh) {
        if (lh > rh) {
            return lh;
        }
        return rh;
    }
 
    // Single Rotation Left-Left
    private AVL_Node<AnyType> case1(AVL_Node<AnyType> k2) {
        AVL_Node<AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
 
        k2.height = maks(height(k2.left), height(k2.right)) + 1;
        k1.height = maks(height(k1.left), k2.height) + 1;
        return k1;
    }
 
    // Single Rotation Right-Right
    private AVL_Node<AnyType> case4(AVL_Node<AnyType> k1) {
        AVL_Node<AnyType> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
 
        k1.height = maks(height(k1.left), height(k1.right)) + 1;
        k2.height = maks(height(k2.left), height(k2.right)) + 1;
        return k2;
    }
 
    // Double Rotation Left-Right (case 2)
    public AVL_Node<AnyType> case2(AVL_Node<AnyType> k3) {
        k3.left = case4(k3.left);
        return case1(k3);
    }
 
    // Double Rotation Right-Left (case 3)
    public AVL_Node<AnyType> case3(AVL_Node<AnyType> k1) {
        k1.right = case1(k1.right);
        return case4(k1);
    }
 
    // Metode insert publik (Duplikat yang di bawah sudah dihapus)
    public void insert(AnyType x) {
        root = insert(x, root);
    }
 
    private AVL_Node<AnyType> insert(AnyType x, AVL_Node<AnyType> t){
        if(t == null) {
            t = new AVL_Node<AnyType>(x, null, null);
        }
        else if(x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
            if(height(t.left) - height(t.right) > 1) {
                if(x.compareTo(t.left.element) < 0) {
                    t = case1(t);
                }
                else {
                    t = case2(t);
                }
            }
        }
        else if(x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);
            if(height(t.right) - height(t.left) > 1) {
                if(x.compareTo(t.right.element) > 0) {
                    t = case4(t);
                }
                else {
                    t = case3(t);
                }
            }
        }
 
        t.height = maks(height(t.left), height(t.right)) + 1;
        return t; 
    }
 
    private void preOrder(AVL_Node<AnyType> t) {
        if(t != null) {
            // Menggunakan print (bukan println) agar cetakan berbaris ke samping
            System.out.print(t.element + " "); 
            if(t.left != null) {
                preOrder(t.left);
            }
            if(t.right != null) {
                preOrder(t.right);
            }
        }
    }
 
    public void printPreOrder() {
        // 2. Memperbaiki operator '=' menjadi '==' untuk perbandingan
        if(root == null) { 
            System.out.println("Tree Kosong!");
        }
        else {
            preOrder(root);
            System.out.println(); // Membuat baris baru setelah selesai cetak
        }
    }
    
    public void inOrder(AVL_Node<AnyType> t) {
    	if(t != null) {
    		if(t.left != null) {
    			inOrder(t.left);
    		}
    		System.out.print(t.element + " ");
    		if(t.right != null) {
    			inOrder(t.right);
    		}
    	}
    }
    public void printInOrder() {
    	if(root == null) {
    		System.out.println("Tree Kosong");
    	} else {
    		inOrder(root);
    		System.out.println();
    	}
    }

    public void postOrder(AVL_Node<AnyType> t) {
    	if(t != null) {
    		if(t.left != null) {
    			postOrder(t.left);
    		}
    		if(t.right != null) {
    			postOrder(t.right);
    		}
    		System.out.print(t.element + " ");
    	}
    }
    public void printPostOrder() {
    	if(root == null) {
    		System.out.println("Tree Kosong");
    	} else {
    		postOrder(root);
    		System.out.println();
    	}
    }

    private AVL_Node<AnyType> cariMinimum(AVL_Node<AnyType> t){
        if(t == null){
            return null;
        } while (t.left != null){
            t = t.left;
        }
        return t;
    }

    private AVL_Node<AnyType> seimbang (AVL_Node<AnyType> t){
        if(t == null){
            return null;
        } else if (height(t.left) - height(t.right) > 1){ //LH
            if(height(t.left.left) >= height(t.left.right)){ //LH
                t = case1(t);
            } else { //RH
                t = case2(t);
            }
        } else if (height(t.right) - height(t.left) > 1) { //RH
            if(height(t.right.right) >= height(t.right.left)){ //RH
                t = case4(t); // right subtree mengalami RH 
            } else { //LH
                t = case3(t); // right subtree mengalami LH
            }
        }
        // yang punya method max maka gunakan method tersebut
        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }

    private AVL_Node<AnyType> delete_successor (AnyType y, AVL_Node<AnyType> t){
        if(t == null){
            return null;
        } else if(y.compareTo(t.element) < 0){
            t.left = delete_successor(y,t.left);
        } else if(y.compareTo(t.element) > 0){
            t.right = delete_successor(y,t.right);
        } else if(t.left != null && t.right != null) { //kondisi punya 2 anak
            t.element = cariMinimum(t.right).element;
            t.right = delete_successor(t.element, t.right);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return seimbang(t)
    }

}
 

 
public class AVL_Implementasi {
    public static void main(String[] args) {
    	//INSERT : 14,17,11,7,53,4,25
    	AVL_Tree<Integer> avl = new AVL_Tree<Integer>();
    	avl.insert(14);
    	avl.insert(17);
    	avl.insert(11);
    	avl.insert(7);
    	avl.insert(53);
    	avl.insert(4);
    	avl.insert(25);
    	System.out.println("---InOrder---");
    	avl.printInOrder();
    	System.out.println("---preOrder---");
    	avl.printPreOrder();
    	System.out.println("---postOrder---");
    	avl.printPostOrder();
    }
}
 