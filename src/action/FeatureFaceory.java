package action;

import java.util.List;

import util.Sample;

/**
 * ��������
 * @author double
 * @data 2013-03-15
 */
public class FeatureFaceory {
	/**
	 * ���ѡȡ��������
	 * @param featureNumber	ԭʼ������Ŀ
	 * @param rate	���ѡȡ�ı���
	 * @return	���ѡȡ����������
	 */
	public static List<Integer> sampleFeature(int featureNumber, double rate) {
		return Sample.sampling(featureNumber, rate);
	}
}
