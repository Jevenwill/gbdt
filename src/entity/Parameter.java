package entity;

/**
 * ģ�͵ĳ�����
 * @author double
 * @data 2013-03-13
 * @version 0.1
 */
public class Parameter {
	private int treeNumber = 1;				//ģ����������Ŀ
	private int splitNumber = 1;			//ÿ�����ķ��Ѵ���
	private int minNumInNode = 1;			//�����а����Ľڵ���Ŀ����
	private double featureSampleRate = 0.5;	//������������
	private double instanceSampleRate = 0.5;	//������������
	private String saveFile;				//ģ�ͱ���·��
	private String  trainDataFile;			//ѵ�������ļ���
	private boolean isBooleanFeature =  false;		//�Ƿ��Ƕ�Ԫ����
	
	public boolean isLegal() {
		if (saveFile == null) {
			System.out.println("��ָ������saveFile!");
			return false;
		}
		if (featureSampleRate > 1 || featureSampleRate < 0) {
			System.out.println("����featureSampleRate������Χ��(0,1]");
			return false;
		}
		if (instanceSampleRate > 1 || instanceSampleRate < 0) {
			System.out.println("����instanceSampleRate������Χ��(0,1]");
			return false;
		}
		if (trainDataFile == null) {
			System.out.println("��ָ������trainDataFile!");
			return false;
		}
		return true;
	}
	
	public int getTreeNumber() {
		return treeNumber;
	}
	public void setTreeNumber(int treeNumber) {
		this.treeNumber = treeNumber;
	}
	public int getSplitNumber() {
		return splitNumber;
	}
	public void setSplitNumber(int splitNumber) {
		this.splitNumber = splitNumber;
	}
	public int getMinNumInNode() {
		return minNumInNode;
	}
	public void setMinNumInNode(int minNumInNode) {
		this.minNumInNode = minNumInNode;
	}
	public double getFeatureSampleRate() {
		return featureSampleRate;
	}
	public void setFeatureSampleRate(double featureSampleRate) {
		this.featureSampleRate = featureSampleRate;
	}
	public double getInstanceSampleRate() {
		return instanceSampleRate;
	}
	public void setInstanceSampleRate(double instanceSampleRate) {
		this.instanceSampleRate = instanceSampleRate;
	}
	public String getSaveFile() {
		return saveFile;
	}
	public void setSaveFile(String saveFile) {
		this.saveFile = saveFile;
	}
	public String getTrainDataFile() {
		return trainDataFile;
	}
	public void setTrainDataFile(String trainDataFile) {
		this.trainDataFile = trainDataFile;
	}

	public boolean isBooleanFeature() {
		return isBooleanFeature;
	}

	public void setBooleanFeature(boolean isBooleanFeature) {
		this.isBooleanFeature = isBooleanFeature;
	}
}
