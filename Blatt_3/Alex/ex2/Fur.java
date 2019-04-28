public class Fur { 
    public int length;

    public Fur(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length=length;
    }

    public Fur deepclone (Fur newfur) {
        newfur.length = this.length;
        return newfur;
    }

    public String toString() {
        return "Felllaenge: " + length;
    }
}