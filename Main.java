// 1. インターフェース（ルールの定義）
// 「挨拶ができる」という機能を定義します。
interface GreetingService {
    void sayHello(String name);
}

// 2. クラスと継承（実装）
// インターフェースを実装（implements）して、具体的な中身を書きます。
class JapaneseGreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello(String name) {
        System.out.println("こんにちは、" + name + "さん！");
    }
}

class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// 3. 実行クラス
public class Main {
    public static void main(String[] args) {
        // インターフェースの型で変数を作るのがポイント！
        GreetingService service;

        // 中身を日本語版にする
        service = new JapaneseGreetingServiceImpl();
        service.sayHello("田中");

        // 中身を英語版に切り替える（インターフェースが同じなので入れ替え可能）
        service = new EnglishGreetingServiceImpl();
        service.sayHello("Tanaka");
    }
}