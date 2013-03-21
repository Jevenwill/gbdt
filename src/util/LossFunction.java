package util;

import java.util.List;

import entity.Corpus;
import entity.Parameter;
import entity.Tree;

/**
 * ��ʧ�����Ľӿ�
 * @author double
 *
 */
public abstract class LossFunction {
	/**
	 * ������ʧ����ֵ
	 * @param t �ڵ㣨����
	 * @param corpus
	 * @return ��ʧ����ֵ
	 */
	abstract public double setLossFunctionValue(Tree t, Corpus corpus);
	
	/**
	 * ��С����������ʧ������
	 * @param t �ڵ㣨����
	 * @param corpus
	 */
	abstract public void minLossFunction(Tree t, List<Integer> featureSampleList,
			Corpus corpus, Parameter p);
	
}
