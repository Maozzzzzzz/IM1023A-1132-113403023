// 1. Instrument (抽象類別)
abstract class Instrument {
    protected String instrumentName;

    public Instrument(String instrumentName) {
        // TODO: 指定 instrumentName
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        // TODO: 回傳 instrumentName
        return instrumentName;
    }

    // 抽象方法，由子類別實作
    public abstract void playSound(); // TODO: 子類別應該要實作這個方法
}

// 2. Playable (介面)
interface Playable {
    void playNote(String note); // TODO: 定義彈奏音符的方法
}

// 3. 具體樂器類別

// Piano 類別
class Piano extends Instrument implements Playable {
    public Piano() {
        super("鋼琴"); // TODO: 傳入樂器名稱
    }

    @Override
    public void playSound() {
        // TODO: 印出鋼琴的聲音描述
        System.out.println("鋼琴發出優美的琴聲");
    }

    @Override
    public void playNote(String note) {
        // TODO: 印出彈奏指定音符的訊息
        System.out.println("鋼琴彈奏音符: " + note);
    }
}

// Guitar 類別
class Guitar extends Instrument implements Playable {
    public Guitar() {
        super("吉他"); // TODO: 傳入樂器名稱
    }

    @Override
    public void playSound() {
        // TODO: 印出吉他的聲音描述
        System.out.println("吉他發出清脆的弦音");
    }

    @Override
    public void playNote(String note) {
        // TODO: 印出彈奏指定音符的訊息
        System.out.println("吉他彈奏音符: " + note);
    }
}

// Violin 類別
class Violin extends Instrument implements Playable {
    public Violin() {
        super("小提琴"); // TODO: 傳入樂器名稱
    }

    @Override
    public void playSound() {
        // TODO: 印出小提琴的聲音描述
        System.out.println("小提琴發出悠揚的琴聲");
    }

    @Override
    public void playNote(String note) {
        // TODO: 印出演奏指定音符的訊息
        System.out.println("小提琴演奏音符: " + note);
    }
}

// 4. Main (主程式類別)
public class Main {
    public static void main(String[] args) {
        // TODO: 宣告一個 Instrument 類型的陣列（大小為 3）
        Instrument[] instruments = new Instrument[3];

        // TODO: 將 Piano、Guitar、Violin 各自放入陣列中（順序任意）
        instruments[0] = new Piano();
        instruments[1] = new Guitar();
        instruments[2] = new Violin();

        // TODO: 宣告一個 String 陣列，存放要演奏的音符（例如 "Do", "Re", "Mi"）
        String[] notes = {"Do", "Re", "Mi"};

        System.out.println("--- 樂團開始演奏 ---");

        // TODO: 使用 for 迴圈，依序處理每個樂器
        // 提示：可以用索引 i 搭配 instruments[i] 和 notes[i]
        for (int i = 0; i < instruments.length; i++) {
            // TODO: 取得目前的樂器物件
            Instrument inst = instruments[i];

            // TODO: 印出樂器名稱
            System.out.println("樂器名稱: " + inst.getInstrumentName());

            // TODO: 呼叫該樂器的 playSound() 方法
            inst.playSound();

            // TODO: 檢查該樂器是否實作 Playable，若是，則轉型並呼叫 playNote(note)
            // 注意：須確認音符陣列長度是否足夠，避免陣列越界
            if (inst instanceof Playable && i < notes.length) {
                ((Playable) inst).playNote(notes[i]);
            }

            // TODO: 印出分隔線（---）
            System.out.println("---");
        }

        System.out.println("--- 樂團演奏結束 ---");
    }
}
