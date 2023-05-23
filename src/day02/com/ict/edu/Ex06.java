package day02.com.ict.edu;
class Ex06{
    public static void main(String[] args){
      // String : ���ڿ��� ó���ϱ� ���ؼ� ���� Ŭ����
      //            �⺻�ڷ����� �ƴϴ�. 
      //            Ŭ������ �ڷ������� ����ϹǷ� �����ڷ����̴�.
      //            ������ �⺻�ڷ���ó�� ��� �����ϴ�.
      //            �ݵ�� �ֵ���ǥ�� ��� �ϰ�, Ȭ����ǥ�� char���� ���.
      //            String �����̸� = "������" ;
      // 'a', "a" �տ� 'a'�� 97�� ����, "a"�� a �ؽ�Ʈ ��ü�� �����. 

      String name = "ȫ�浿";
      int age = 17 ;
      System.out.println(name);

      // + ������ �� �� ������ ����� ������ String �̴�.
      name = "1000";
      age = 1000;
      System.out.println(name + 50);
      System.out.println(age + 50);
      // ���ϱ⸦ �غ��� �������� �������� �� �� ����. (������ ��� ��� �ȵǰ� ���ڿ����ڷ� �׳� ����)

      int su1 = 20;
      int su2 = 4;
      System.out.println(su1 + su2);
      System.out.println("��� : " + su1 + su2);  // �����δ� 204�� ���� -> ���ϱ�� �տ����� ��� -> "��� : " + 20�� ���� ó��.
      System.out.println("��� : " + (su1 + su2));

      // �ذ�å
      int su3 = su1 + su2;
      System.out.println("��� : " + su3);
      // �Ǵ� ����ó�� ��ȣ
    }
}