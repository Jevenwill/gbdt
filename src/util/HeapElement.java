package util;

/**
 * ������һ����Ԫ�ص���Ϊ
 * @author double
 * @date 2013-03-20
 */
public abstract class HeapElement {
	abstract public Double getValue();
	abstract public int getIndex();
	abstract public int compare(HeapElement e);
	public String toString() {
		return getValue().toString()+"/"+getIndex();
	}
}
