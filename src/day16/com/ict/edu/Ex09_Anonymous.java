package day16.com.ict.edu;

interface Animal{
	public void sound();
	public String play();
}

interface Animal2{
	public String play();
}

class Dog implements Animal, Animal2{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	@Override
	public String play() {
		return "꼬리잡기";
	}
}
class Cat{
	void music(Animal animal) {
		animal.sound();
	}
	void game(Animal2 animal2) {
		System.out.println(animal2.play());
	}
}

public class Ex09_Anonymous {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.play();
		System.out.println(dog.play()); // void는 알아서 출력하지만 (위 참고) return 반환형 있으면 sysout 해줘야 출력.
		
		Cat cat = new Cat();
		cat.music(new Animal() {
			@Override
			public void sound() {
				System.out.println("야옹");
			}
			@Override
			public String play() {
				return "그루밍하기";
			}
		});
		
		cat.game(new Animal2() {
			@Override
			public String play() {
				return "그루밍";
			}
		});
	}
}