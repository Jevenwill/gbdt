package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * �������ڴ�����Ĵ洢
 * @author double
 * @data 1013-03-15
 * @version 0.1
 */
public class Corpus {
	private List<Instance> instanceList = null;
	private int featureSize = 0;
	
	public Corpus() {
		instanceList = new ArrayList<Instance>();
	}
	
	/**
	 * ����������ֵ
	 * @return ��ֵ
	 */
	public double average() {
		if (instanceList == null) {
			return -1;
		}
		double sum = 0.0;
		for (Instance ins : instanceList) {
			sum += ins.getLabel();
		}
		return sum/instanceList.size();
	}
	
	/**
	 * ���㲿�������ľ�ֵ
	 * @param instanceSampleSet ����������
	 * @return ��ֵ
	 */
	public double average(List<Integer> instanceSampleSet) {
		if (instanceList == null) {
			return -1;
		}
		double sum = 0.0;
		for (int i : instanceSampleSet) {
			sum += instanceList.get(i).getLabel();
		}
		return sum/instanceSampleSet.size();
	}
	
	/**
	 * ����ѵ��������label
	 * @param tree
	 */
	public void update(List<Tree> tree) {
		for (Instance ins : instanceList) {
			int index = 0;
			while (tree.get(index).getLeftChildID() > 0) {
				if (ins.getFeature(tree.get(index).getFeatureID()) < tree.get(index).getFeatureValue()) {
					index = tree.get(index).getLeftChildID();
				}
				else {
					index = tree.get(index).getRightChildID();
				}
			}
			double predictValue = tree.get(index).getAvgValue();
			ins.setLabel(ins.getLabel()-predictValue);
		}
	}
	
	public void addInstance(Instance ins) {
		instanceList.add(ins);
	}
	
	/**
	 * ��ȡ��index������
	 * @param index	����
	 * @return
	 */
	public Instance getInstance(int index) {
		return instanceList.get(index);
	}
	
	/**
	 * ��ȡ��instanceIndex�������ĵ�featureIndexά����ֵ
	 * @param instanceIndex
	 * @param featureIndex
	 * @return
	 */
	public Double getFeature(int instanceIndex, int featureIndex) {
		return instanceList.get(instanceIndex).getFeature(featureIndex);
	}

	/**
	 * ��ȡ��index��������label
	 * @param index
	 * @return
	 */
	public Double getLabel(int index) {
		return instanceList.get(index).getLabel();
	}
	public int getFeatureSize() {
		return featureSize;
	}

	public void setFeatureSize(int featureSize) {
		this.featureSize = featureSize;
	}
	
	public int getInstanceSize() {
		return instanceList.size();
	}
	
	public List<Instance> getInstanceList() {
		return instanceList;
	}
}
