package tw.org.iii;

public class Scooter extends Bike {  //�~��BIKE���S��
	Scooter(){
		//super(); �����w �N��super(); �|�l���췽�Y:�|�Y�O����
		System.out.println("Scouter()");
	}
    void upSpeed(){
    	super.upspeed(); //���Ϊ������\��,�A�j�ƥ\��
    	speed = (speed<1)?1.5:(speed*3.2); //�s���׹��r   //���Ө�� ���N1�L�٬O2��
    	//���ܦW�٥i�H�W�[�ۼ�
    }
}
