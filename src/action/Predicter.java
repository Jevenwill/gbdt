package action;

import java.util.ArrayList;
import java.util.List;

import entity.Instance;
import entity.Model;
import entity.Tree;

/**
 * Ԥ����
 * @author double
 * @data 2013-03-20
 */
public class Predicter {
	/**
	 * ����ģ��Ԥ��ins��ֵ�����������ins��
	 * @param ins	��������
	 * @param model	ģ��
	 */
	public static void predict(Instance ins, Model model) {
		for (ArrayList<Tree> tree : model.getForest()) {
			predict(ins, tree);
		}
	}
	
	/**
	 * ʹ��һ����Ԥ��ins������������ʹ����������ins��Ԥ��ֵ
	 * @param ins	����
	 * @param tree	��
	 */
	public static void predict(Instance ins, List<Tree> tree) {
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
		ins.setPredictLabel(ins.getPredictLabel()+predictValue);
	}
}
