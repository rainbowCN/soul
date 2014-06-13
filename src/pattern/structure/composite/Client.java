package pattern.structure.composite;


/**
 * @author James.Yu
 * 
 * 组合模式(Composite)定义：
 * 1、将对象组合成树形结构以表示“整体-部分”的层次结构。组合模式使用户对单个对象和组合对象的使用保持一致性。
 * 
 * 组合模式(Composite)适合解决的业务场景：
 * 1、当需求中需体现整体与部分的层次结构时，而且这种结构容易发生变化。
 * 2、希望用户可以忽略组合对象与单个对象的不同，统一使用结构中的对象(安全方式)。
 * 
 * Note(组合模式又分透明方式和安全方式)
 * 1、透明方式是在Component接口中声明add()&remove()方法，使组合对象与单个对象具备一致的行为接口。但单个对象不具备add()&remove()功能，所以实现无意义。
 * 2、安全方式，则是在Composite中声明管理子对象的方法。但客户端在调用时需要区别对象类型。
 * 
 * 组合模式(Composite)的具体用例
 * 1、系统的树状菜单
 * 2、 Backbone.Marionette CompositeView正是这一模式的实践。
 * 
 * 参考
 * 1、维基百科: http://en.wikipedia.org/wiki/Composite_pattern
 * 2、Marionette http://lostechies.com/derickbailey/2012/04/05/composite-views-tree-structures-tables-and-more/
 * 
 */
public class Client {
	
	
	public static void main(String[] args){
		
		Composite company = new Composite("IT公司");
		
		Composite tecDepartment = new Composite("技术部");
		Leaf PM = new Leaf("项目经理");
		Leaf DE = new Leaf("开发工程师");
		Leaf PG = new Leaf("程序员");
		
		Composite netDevelopment = new Composite("网络部");
		Leaf AD = new Leaf("网络管理员");
		Leaf HE = new Leaf("硬件工程师");
		
		Composite HR = new Composite("人力资源部");
		
		tecDepartment.add(PM);
		tecDepartment.add(DE);
		tecDepartment.add(PG);
		
		netDevelopment.add(AD);
		netDevelopment.add(HE);
		
		company.add(tecDepartment);
		company.add(netDevelopment);
		company.add(HR);
		
		company.operation();
	}
}