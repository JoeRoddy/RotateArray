package Array;
import java.util.ArrayList;
public class RotateArray extends ArrayList {

    public void rotate(int rotations) {
        for (int i = 0; i < rotations; i++) {
            //1 rotation
            Object temp=this.get(0);
            for (int x = 0 ; x < this.size()-1; x++) {
                this.set(x,this.get(x+1));
            }
            this.set(this.size()-1,temp);
        }
    }
}
