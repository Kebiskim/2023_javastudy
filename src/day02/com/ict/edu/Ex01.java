package day02.com.ict.edu;
class Ex01{
    public static void main(String[] args){
      // �ּ� : �Ʒ� ���� ������ �޾Ƶ�

      // ���� : ���α׷��� ���������� �������� ���� �� �ִ� ���°� (�Ѹ����, ���� ���� = ��(Random Access Memory))
      // ���� : �ڷ��� �����̸� ;
      //                      �����̸� = �� ������ ;
      // �� �ڷ����� ����
      boolean b1 ;
      b1 = true ;  // b1�� true�̴� (X)   true�� b1�� ����(���)�Ѵ� (O)   �������� ���� �����Ϳ� ����(O)

      // �繰�Կ� �� �̸��� ���δ� -> �� ���Ǹ� ��. 
      // b1���� boolean�� ����־�� -> b1���� true or false�� ��. 
      // ������ ������� �Ѱ��� ������ �� ����. 
      // �̸��� �θ��� ���� �� -> b1�� �θ���, true�� ��. 

      // b1�� ȣ���� ����
      System.out.println(b1);

      // b1�� ���¸� true���� false�� ��������. 
      // boolean b1 ;    // ������ 1���� ������!! 
      b1 = false ;    // �ֽ� ������ ����� (���� ������ ���ֹ���) 
      System.out.println(b1);

      // ����� ������ �ѹ���
      boolean b2 = true ;    // ������ �ѹ��ۿ� �ȵǱ� ������ b2�� �ٽñ� ����!! 
      System.out.println(b2);

      b2 = false ;
      System.out.println(b2);

      // boolean b3 = 10.0 ; 

    }
}