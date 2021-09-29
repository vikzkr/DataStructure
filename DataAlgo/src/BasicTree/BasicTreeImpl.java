package BasicTree;

import java.util.ArrayList;

public class BasicTreeImpl {
	
	String data;
	ArrayList<BasicTreeImpl> children;
	public BasicTreeImpl(String data) {
		
		this.data = data;
		children= new ArrayList<BasicTreeImpl>();
	}
	
	
public void addChilder(BasicTreeImpl node)
{
	this.children.add(node);
}

public String print(int level)
{
	String val;
	val=" ".repeat(level)+data+"\n";
	for(BasicTreeImpl node: this.children)
	{
		val+=node.print(level+1);
	}
	return val;
}
}
