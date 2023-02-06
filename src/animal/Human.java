package animal;

public class Human extends Animal implements Thinkable {
    //フィールド
    private String hobby;

    //引数なしのコンストラクタ
    public Human() {
    }

    //引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
//        super.setName(name);
//        super.setAge(age);
        super(name, age);  //Animalクラスのコンストラクタを呼び出し
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //think()メソッドの作成
    public void think() {
        System.out.println("私は" + hobby + "について考えています");
    }
}
