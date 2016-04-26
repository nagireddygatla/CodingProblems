package dataStructures;
import java.util.*;

public class NaryTree {
	
	public static void printChildren(FolderFile root){
		
		if(root==null)return;
		
		System.out.println(root.name);
		for(Iterator<FolderFile> newfile=root.children.iterator();newfile.hasNext();){	
		FolderFile child = (FolderFile)newfile.next();
		printChildren(child);
		}
	}
	
	
	public static void main(String args []){
		
		FolderFile root = new FolderFile("folder1");
		Set<FolderFile> children = root.children;
		FolderFile child1 = new FolderFile("child1");
		FolderFile child2 = new FolderFile("child2");
		FolderFile child3 = new FolderFile("child3");
		children.add(child1);
		children.add(child2);
		children.add(child3);
		Set<FolderFile> subchild = child1.children;
		FolderFile subchild1 = new FolderFile("subchild1");
		FolderFile subchild2 = new FolderFile("subchild2");
		FolderFile subchild3 = new FolderFile("subchild3");
		subchild.add(subchild1);
		subchild.add(subchild2);
		subchild.add(subchild3);
		Set<FolderFile> subsubchild = child2.children;
		FolderFile subsubchild1 = new FolderFile("subsubchild1");
		FolderFile subsubchild2 = new FolderFile("subsubchild2");
		FolderFile subsubchild3 = new FolderFile("subsubchild3");
		subsubchild.add(subsubchild1);
		subsubchild.add(subsubchild2);
		subsubchild.add(subsubchild3);
		Set<FolderFile> thirdchild = child3.children;
		FolderFile thirdchild1 = new FolderFile("thirdchild1");
		FolderFile thirdchild2 = new FolderFile("thirdchild2");
		FolderFile thirdchild3 = new FolderFile("thirdchild3");
		thirdchild.add(thirdchild1);
		thirdchild.add(thirdchild2);
		thirdchild.add(thirdchild3);
		Set<FolderFile> third3child = child3.children;
		FolderFile third3child1 = new FolderFile("third3child1");
		FolderFile third3child2 = new FolderFile("third3child2");
		FolderFile third3child3 = new FolderFile("third3child3");
		third3child.add(third3child1);
		third3child.add(third3child2);
		third3child.add(third3child3);
		printChildren(root);
		
	}

}


class FolderFile{
	String name;
	Set<FolderFile> children;

	
	public FolderFile(String name){
		this.name = name;
		this.children = new HashSet<FolderFile>();
		
	}
	
}