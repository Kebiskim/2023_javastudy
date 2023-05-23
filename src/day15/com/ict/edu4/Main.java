package day15.com.ict.edu4;

public class Main {
	public static void main(String[] args) {
		Terran terran = new Terran();
		terran.setName("마린");
		terran.setFly(false);
		terran.setEnergy(40);
		
		Protoss protoss  = new Protoss("질럿", 80, false);
		Zerg zerg = new Zerg("뮤탈", 120, true);
		
		terran.decEnergy();
		zerg.decEnergy();
		protoss.decEnergy();
		
		System.out.println("terran 에너지 : " + terran.getEnergy());
		System.out.println("protoss 에너지 : " + protoss.getEnergy());
		System.out.println("zerg 에너지 : " + zerg.getEnergy());
		System.out.println();
		
		terran.decEnergy();
		terran.decEnergy();
		// ★ 위 코드가, TV랑 스피커 등 여러개 있을 때, 각각 에너지 깎는 것 => volumeup, volumedown 과 동일!!
		
		System.out.println("terran 에너지 : " + terran.getEnergy());
		System.out.println("protoss 에너지 : " + protoss.getEnergy());
		System.out.println("zerg 에너지 : " + zerg.getEnergy());
	}
}
