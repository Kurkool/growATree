public class tree {
    private int treeheight;

public tree(int treeheight){
this.treeheight = treeheight;
}

    public int getTreeheight() {
        return treeheight;
    }

    public void setTreeheight(int treeheight) {
        this.treeheight = treeheight;
    }

    public void growAtree(){
        int i,j;

        for(i =0 ; i<treeheight+1;i++){ //outer loop

            int x = 2*(treeheight-1)-1; //initial sequence of the tree level
            for(j=0;j<x;j++){
                if(i<treeheight-1){
                    if(j<(x-1)/2 && i+j>=(x-1)/2) System.out.print("*"); //perform left leaves
                    else if(j==(x-1)/2) System.out.print("*"); //perform trunk
                    else if(j> (x-1)/2 &&j<=(x-1)/2+i)  System.out.print("*"); //perform right leaves
                    else System.out.print(" ");

                }else{
                    if(j==(x-1)/2) System.out.print("*"); //perform trunk
                    if(i==treeheight && j>=(x-1)/2-1 && j<=(x-1)/2 ) System.out.print("*"); //tree base
                    else System.out.print(" ");
                }

            }
            System.out.println("");

        }
    }
}
