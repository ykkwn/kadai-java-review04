package animal;

public class Animal {
    //フィールドの作成
    private String name;
    private int age;

    //引数なしのコンストラクタ
    public Animal() {
    }

    //引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //say()メソッドの作成
    public void say() {
        System.out.println( name + "です。" + age + "歳です");
    }
}
