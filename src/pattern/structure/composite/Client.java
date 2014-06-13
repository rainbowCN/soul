package pattern.structure.composite;


/**
 * @author James.Yu
 * 
 * ���ģʽ(Composite)���壺
 * 1����������ϳ����νṹ�Ա�ʾ������-���֡��Ĳ�νṹ�����ģʽʹ�û��Ե����������϶����ʹ�ñ���һ���ԡ�
 * 
 * ���ģʽ(Composite)�ʺϽ����ҵ�񳡾���
 * 1���������������������벿�ֵĲ�νṹʱ���������ֽṹ���׷����仯��
 * 2��ϣ���û����Ժ�����϶����뵥������Ĳ�ͬ��ͳһʹ�ýṹ�еĶ���(��ȫ��ʽ)��
 * 
 * Note(���ģʽ�ַ�͸����ʽ�Ͱ�ȫ��ʽ)
 * 1��͸����ʽ����Component�ӿ�������add()&remove()������ʹ��϶����뵥������߱�һ�µ���Ϊ�ӿڡ����������󲻾߱�add()&remove()���ܣ�����ʵ�������塣
 * 2����ȫ��ʽ��������Composite�����������Ӷ���ķ��������ͻ����ڵ���ʱ��Ҫ����������͡�
 * 
 * ���ģʽ(Composite)�ľ�������
 * 1��ϵͳ����״�˵�
 * 2�� Backbone.Marionette CompositeView������һģʽ��ʵ����
 * 
 * �ο�
 * 1��ά���ٿ�: http://en.wikipedia.org/wiki/Composite_pattern
 * 2��Marionette http://lostechies.com/derickbailey/2012/04/05/composite-views-tree-structures-tables-and-more/
 * 
 */
public class Client {
	
	
	public static void main(String[] args){
		
		Composite company = new Composite("IT��˾");
		
		Composite tecDepartment = new Composite("������");
		Leaf PM = new Leaf("��Ŀ����");
		Leaf DE = new Leaf("��������ʦ");
		Leaf PG = new Leaf("����Ա");
		
		Composite netDevelopment = new Composite("���粿");
		Leaf AD = new Leaf("�������Ա");
		Leaf HE = new Leaf("Ӳ������ʦ");
		
		Composite HR = new Composite("������Դ��");
		
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